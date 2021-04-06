<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="all_component/style.css">
<title>Login Page</title>
<%@include file="all_component/allCss.jsp"%>

<style type="text/css">
.footer-tester {
	margin-top: 228px;
	font-weight: bold;
	font-family: galindo;
	background-color:#F7C201;
}
</style>
</head>
<body style="background-color: #92FFC0">
	<%@include file="all_component/navbar.jsp"%>
	<div class="container-fluid">
		<div class="row p-2">
			<div class="col-md-3 offset-md-4">
				<div class="card mt-5">
					<div class="card-body">
						<h4 class="text-center text-success">Student Login Form</h4>

						<%
							String errorMssg = (String) session.getAttribute("errorMssg");

							if (errorMssg != null) {
						%>
						<p class="text-center text-danger"><%=errorMssg%></p>

						<%
							session.removeAttribute("errorMssg");
							}
						%>

						<form action="login" method="post">

							<div class="form-group pt-4">
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
								class="btn btn-danger badge-pill btn-block mt-5">Login</button>
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