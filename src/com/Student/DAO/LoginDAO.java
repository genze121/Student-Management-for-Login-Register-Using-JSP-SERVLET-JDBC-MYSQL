package com.Student.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Student.Connection.DBConnectionProvider;
import com.Student.Entity.StudentBean;

public class LoginDAO {

	// Login Query i.e using Select Query
	private static final String SELECT_QUERY = "select * from student where email=? and pass=?";

	// Login Logic
	public StudentBean getLoginDetails(StudentBean student) {

		StudentBean bean = null;
		PreparedStatement preparedstatement = null;
		Connection connection = null;
		ResultSet result = null;
		try {
			connection = DBConnectionProvider.getConnection();
			preparedstatement = connection.prepareStatement(SELECT_QUERY);

			preparedstatement.setString(1, student.getEmail());
			preparedstatement.setString(2, student.getPassword());

			result = preparedstatement.executeQuery();
			while (result.next()) {
				bean = new StudentBean();
				bean.setEmail(result.getString("email"));
				bean.setPassword(result.getString("pass"));
			}

		} catch (SQLException e) {
			DBConnectionProvider.printSQLException(e);
		}

		return bean;

	}
}
