<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body onload="ready()" background="login_background.jpg">

	<div class="container" style="color: #fff;">
		<h1 align="center">
			<b>Staff Login Page</b>
		</h1>
		<form:form method="post" commandName="mystaff">
			<table class="table">
				<tbody>
					<tr>
						<td><label>Enter Username:</label></td>
						<td><input name="uname" id="uname" type="text" class="form-control"
							placeholder="Enter Username" /></td>
					</tr>
					<tr>
						<td><label>Enter Password:</label></td>
						<td><input name="passwd" id="passwd" type="password" class="form-control"
							placeholder="Enter Password" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" class="btn btn-success"
							value="Login"></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>
</body>
</html>