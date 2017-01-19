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
<style type="text/css">
#bgimg {
	background-image: url('register_background.jpg');
	color: #FFF;
}
</style>
<style>
.error {
	color: red;
}
</style>
</head>
<body onload="ready()">
	<div class="panel panel-default" id="bgimg">
		<div class="panel-body">
			<div class="container">
				<h1 align="center">
					<b>Registration Details</b>
				</h1>
				<form:form commandName="myregister" method="post">
					<table class="table">
						<tbody>
							<tr>
								<td><label>Enter Username:</label></td>
								<td><form:input path="username" type="text"
										class="form-control" />
									<form:errors path="username" cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Enter Password:</label></td>
								<td><form:input path="password" type="password"
									class="form-control" />
								<form:errors path="password" cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Confirm Password:</label></td>
								<td><form:input path="confirmpassword" type="password"
										class="form-control" />
									<form:errors path="confirmpassword" cssClass="error" /></td>
							</tr>
							<tr>
							<tr>
								<td><label>Enter First Name:</label></td>
								<td><form:input path="customerfname" type="text"
										class="form-control" />
									<form:errors path="customerfname" cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Enter Last Name:</label></td>
								<td><form:input path="customerlname" type="text"
										class="form-control" />
									<form:errors path="customerlname" cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Enter Address:</label></td>
								<td><form:input path="customeraddress" type="text"
										class="form-control" />
									<form:errors path="customeraddress" cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Enter Email Id:</label></td>
								<td><form:input path="customeremailId" type="text"
										class="form-control" />
									<form:errors path="customeremailId" cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Enter City Name:</label></td>
								<td><form:input path="customercity" type="text"
										class="form-control" />
									<form:errors path="customercity" cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Enter Telephone Number:</label></td>
								<td><form:input path="customerphoneno" type="text"
										class="form-control" />
									<form:errors path="customerphoneno" cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Enter Postal Code:</label></td>
								<td><form:input path="customerzipcode" type="text"
										class="form-control" />
									<form:errors path="customerzipcode" cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Enter Credit Card Type:</label></td>
								<td><form:select class="form-control"
										path="customercreditCardType">
										<form:option value="----Credit Card Type----"></form:option>
										<form:option value="American Express"></form:option>
										<form:option value="Visa"></form:option>
										<form:option value="MasterCard"></form:option>
										<form:option value="RuPay"></form:option>
									</form:select>
									<form:errors path="customercreditCardType" cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Enter Credit Card Number:</label></td>
								<td><form:input type="text" class="form-control"
										path="customercreditCardNumber" />
									<form:errors path="customercreditCardNumber" cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Enter Driving License Number:</label></td>
								<td><form:input type="text" class="form-control"
										path="customerdrivingLicenseNumber" />
									<form:errors path="customerdrivingLicenseNumber"
										cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Enter Driving License Expiry Date:</label></td>
								<td><form:input class="form-control" type="date"
										min="2000-01-02" path="customerdrivingLicenseDate" />
									<form:errors path="customerdrivingLicenseDate" cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Enter Date Of Birth:</label></td>
								<td><form:input class="form-control" type="date"
										min="2000-01-02" path="customerdateofBirth" />
									<form:errors path="customerdateofBirth" cssClass="error" /></td>
							</tr>
							<tr>
								<td><label>Enter Passport Number:</label></td>
								<td><form:input path="customerpassportNumber" type="text"
										class="form-control" />
									<form:errors path="customerpassportNumber" cssClass="error" /></td>
							</tr>
							<td><a href="#" class="btn btn-danger" role="button">Cancel</a></td>
							<td><input type="submit" class="btn btn-success"
								value="Sign Up"></td>
							</tr>
						</tbody>
					</table>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>