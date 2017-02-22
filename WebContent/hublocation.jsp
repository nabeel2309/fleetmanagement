<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	background-image: url('hub_background.jpg');
	color: #FFF;
}
</style>
</head>
<body background="hub_background.jpg">
	<div class="container" style="color: #fff;">
		<h1 align="center">
			<b>Hub Location Selection</b>
		</h1>
		<form:form commandName="mybooking" method="post">
			<h2 align="center">Select Pickup Location</h2>
			<table class="table">
				<thead>
					<tr>
						<th>Select</th>
						<th>Hub Name</th>
						<th>Address</th>
						<th>City</th>
						<th>State</th>
						<th>Telephone</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${hublist}" var="x">
						<tr>
							<td><input type="radio" name="rd1" value="${x.hubid}" /></td>
							<td>${x.hubname}</td>
							<td>${x.hubaddress}</td>
							<td>${x.cityname}</td>
							<td>${x.statename}</td>
							<td>${x.hubphone}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<h2 align="center">Select Return Location</h2>
			<table class="table">
				<thead>
					<tr>
						<th>Select</th>
						<th>Hub Name</th>
						<th>Address</th>
						<th>City</th>
						<th>State</th>
						<th>Telephone</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${rhublist}" var="y">
						<tr>
							<td><input type="radio" name="rd2" value="${y.hubid}" /></td>
							<td>${y.hubname}</td>
							<td>${y.hubaddress}</td>
							<td>${y.cityname}</td>
							<td>${y.statename}</td>
							<td>${y.hubphone}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<input type="submit" class="btn btn-info" value="Continue Booking" />
		</form:form>
	</div>
</body>
</html>