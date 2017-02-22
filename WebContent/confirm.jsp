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
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body background="confirm_background.png">
	<h1 style="color: white;">Your Booking has been Confirmed!!!</h1>
	<h2 style="color: white;">
		<center>Booking Details</center>
	</h2>
	<form:form commandName="mybooking" method="post">
		<h4 align="center">
			<span class="label label-primary">Booking ID</span><span
				class="label label-info">${mybooking.bookingid}</span></h4>
		<h4 align="center">
			<span class="label label-primary">Customer ID</span><span
				class="label label-info">${mycustomer.registerid}</span>
		</h4>
		<h4 align="center">
			<span class="label label-primary">Customer Name</span><span
				class="label label-info">${mycustomer.customerfname}
				&nbsp;&nbsp; ${mycustomer.customerlname}</span>
		</h4>
		<h4 align="center">
			<span class="label label-primary">Customer City</span><span
				class="label label-info">${mycustomer.customercity}</span>
		</h4>
		<h4 align="center">
			<span class="label label-primary">Customer Phone no.</span><span
				class="label label-info">${mycustomer.customerphoneno}</span>
		</h4>
		<h4 align="center">
			<span class="label label-primary">Username</span><span
				class="label label-info">${mycustomer.username}</span>
		</h4>
		<h4 align="center">
			<span class="label label-primary">Hub Name</span><span
				class="label label-info">${myhub.hubname}</span>
		</h4>
		<h4 align="center">
			<span class="label label-primary">Vehicle Category</span><span
				class="label label-info">${myvehicle.vehiclecategorydesc}</span>
		</h4>		
		<input class="btn btn-info" type="submit" value="Logout" /><br/><br/>
	</form:form>
</body>
</html>