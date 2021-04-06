<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="all_component/style.css">
<title>Registration Page</title>
<%@include file="all_component/allCss.jsp"%>

<style type="text/css">
.footer-tester {
	margin-top: 115px; 
	font-weight : bold;
	font-size: 30px;
	font-family: galindo;
	background-color: #F7C201;
	font-weight: bold;
}
</style>
</head>
<body style="background-color: #DECBA4">
	<%@include file="all_component/navbar.jsp"%>
	<div class="container-fluid">
		<div class="row p-2">
			<div class="col-md-4 offset-md-4">
				<div class="card mt-5">
					<div class="card-body">
						<h4 class="text-center text-success test-mark">Student
							Registration Form</h4>
						<%
							String successMssg = (String) session.getAttribute("successMssg");
							String errorMssg = (String) session.getAttribute("errorMssg");

							if (successMssg != null) {
						%>
						<p class="text-success text-center"><%=successMssg%></p>
						<%
							session.removeAttribute("successMssg");
							}

							if (errorMssg != null) {
						%>
						<p class="text-danger text-center"><%=errorMssg%></p>
						<%
							session.removeAttribute("errorMssg");
							}
						%>
						<form action="register" method="post">
							<div class="form-group">
								<label for="exampleInputFirstName1">First Name</label> <input
									type="text" name="first_name" class="form-control"
									id="exampleInputFirstName1">
							</div>

							<div class="form-group">
								<label for="exampleInputLastName1">Last Name</label> <input
									type="text" name="last_name" class="form-control"
									id="exampleInputLastName1">
							</div>

							<div class="form-group">
								<label for="exampleInputEmailHelp1">Email Address</label> <input
									type="email" name="email_" class="form-control"
									id="exampleInputEmailHelp1" aria-describedby="emailHelp">
							</div>

							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" name="password_" class="form-control"
									id="exampleInputPassword1">
							</div>

							<button type="submit"
								class="btn btn-danger badge-pill btn-block mt-4">Register</button>
						</form>

					</div>

				</div>


			</div>


		</div>


	</div>
	<div class="card footer-tester">
		<div class="card-body">
			<blockquote class="blockquote mb-0">
				<footer class="blockquote-footer text-center">
					© 2021 Copyright: <cite title="Source Title">Developed By
						Tirtha Sharma</cite>
				</footer>
			</blockquote>
		</div>
	</div>
</body>
</html>