package com.Student.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Student.Connection.DBConnectionProvider;
import com.Student.DAO.LoginDAO;
import com.Student.Entity.StudentBean;

/**
 * Servlet implementation class LoginStudentController
 */
@WebServlet("/login")
public class LoginStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static Connection con = null;
	private static PreparedStatement ps = null;

	private LoginDAO loginDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginStudentController() {
		super();
		loginDAO = new LoginDAO();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String emailAddress = request.getParameter("email_");
		String password = request.getParameter("password_");

		StudentBean student = new StudentBean();
		student.setEmail(emailAddress);
		student.setPassword(password);

		StudentBean finalLogin = loginDAO.getLoginDetails(student);
		HttpSession session = request.getSession();
		if (finalLogin != null) {
			System.out.println("Student is Available:- " + finalLogin);
			session.setAttribute("student", finalLogin);
			response.sendRedirect("index.jsp");
		} else {
			System.out.println("Student is not Available:- " + finalLogin);
			session.setAttribute("errorMssg", "Invalid Email Address and Password...");
			response.sendRedirect("login.jsp");
		}

		DBConnectionProvider.closeResources(ps, con);

	}

}
