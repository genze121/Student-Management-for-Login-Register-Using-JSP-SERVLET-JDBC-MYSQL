package com.Student.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Student.Connection.DBConnectionProvider;
import com.Student.Entity.StudentBean;

public class RegisterDAO {

	// Registration Query i.e Insert Query
	private static final String INSERT_SQL_QUERY = "insert into student" + "(first_name,last_name,email,pass)"
			+ "values(?,?,?,?)";

	// Registration Logic
	public boolean registerStudent(StudentBean student) {

		boolean flag = false;
		PreparedStatement preparedstatement = null;
		Connection connection = null;
		try {
			connection = DBConnectionProvider.getConnection();
			preparedstatement = connection.prepareStatement(INSERT_SQL_QUERY);
			System.out.println(preparedstatement);
			preparedstatement.setString(1, student.getFirstname());
			preparedstatement.setString(2, student.getLastname());
			preparedstatement.setString(3, student.getEmail());
			preparedstatement.setString(4, student.getPassword());

			int registered = preparedstatement.executeUpdate();
			if (registered == 1 || registered > 0) {
				flag = true;
			}

		} catch (SQLException e) {
			DBConnectionProvider.printSQLException(e);
		}

		return flag;
	}

}
