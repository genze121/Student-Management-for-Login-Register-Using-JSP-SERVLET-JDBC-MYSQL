<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-danger">
		<a class="navbar-brand" href="index.jsp"><i
			class="fa fa-address-card" aria-hidden="true"></i> Student Management</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="home.jsp">
						<i class="fa fa-home"></i> Home <span class="sr-only">(current)</span>
				</a></li>

			</ul>
			<form class="form-inline my-2 my-lg-0">
				<a href="login.jsp" class="btn btn-success"><i
					class='fa fa-user-circle-o'></i> Login</a> <a href="register.jsp"
					class="btn btn-primary ml-2"><i class='fa fa-user-plus'></i>
					Register</a>
			</form>
		</div>
	</nav>

</body>
</html>