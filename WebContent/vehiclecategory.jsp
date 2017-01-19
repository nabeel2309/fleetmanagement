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
	background-image: url('vehicle_background.jpg');
	color: #FFF;
}
</style>
</head>
<body>
	<div class="panel panel-default" id="bgimg">
		<div class="panel-body">
			<div class="container">
				<h1 align="center">
					<b>Vehicle Category Selection</b>
				</h1>
				<form:form commandName="mybooking" method="post">
					<table class="table">
						<thead>
							<tr>
								<th>Select</th>
								<th>Vehicle Type</th>
								<th>Car Image</th>
								<th>Daily Rate</th>
								<th>Weekly Rate</th>
								<th>Monthly Rate</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${myvehicles}" var="x">
								<tr>
									<td><input type="radio" name="rdv1"
										value="${x.vehiclecategoryid}" /></td>
									<td>${x.vehiclecategorydesc}</td>
									<td><img src="${x.imagepattern}" height="105" width="180" /></td>
									<td>${x.dailyrate}</td>
									<td>${x.weeklyrate}</td>
									<td>${x.monthlyrate}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<input class="btn btn-info" type="submit" value="Continue Booking" />
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>