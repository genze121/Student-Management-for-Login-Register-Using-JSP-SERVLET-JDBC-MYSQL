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
import com.Student.DAO.RegisterDAO;
import com.Student.Entity.StudentBean;

/**
 * Servlet implementation class RegisterStudentController
 */
@WebServlet("/register")
public class RegisterStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection con = null;
	private static PreparedStatement ps = null;

	private RegisterDAO registerDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterStudentController() {
		super();
		registerDAO = new RegisterDAO();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstname = request.getParameter("first_name");
		String lastname = request.getParameter("last_name");
		String email = request.getParameter("email_");
		String password = request.getParameter("password_");

		StudentBean student = new StudentBean();
		student.setFirstname(firstname);
		student.setLastname(lastname);
		student.setEmail(email);
		student.setPassword(password);

		boolean finalRegister = registerDAO.registerStudent(student);
		HttpSession session = request.getSession();
		if (finalRegister) {
			session.setAttribute("successMssg", "Student Details Registered Successfully...");
			response.sendRedirect("register.jsp");
		} else {
			session.setAttribute("errorMssg", "Something went wrong...");
			response.sendRedirect("register.jsp");
		}

		DBConnectionProvider.closeResources(ps, con);
	}

}
