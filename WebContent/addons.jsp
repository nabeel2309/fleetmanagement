<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	background-image: url('addons_background.jpg');
	color: #FFF;
}
</style>
<script>
	function ready() {
		sum = 0;
	}
	function quantity(q) {
		qty = 0;
		qty = parseInt(q.value);
	}
	function calculate(c) {
		var a = parseInt(c.value);
		if (c.checked) {
			sum = sum + (a * qty);
		} else {
			sum = sum - (a * qty);
		}
		document.getElementById("total").value = sum;
	}
</script>
</head>
<body onload="ready()" background="addons_background.jpg">
	<div class="container" style="color: #fff;">
		<h1 align="center">
			<b>Add Ons Selection</b>
		</h1>
		<form:form commandName="mybooking" method="post">
			<table class="table">
				<thead>
					<tr>
						<th>Select</th>
						<th>AddOns Type</th>
						<th>AddOns Cost</th>
						<th>Quantity</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${addonslist}" var="x">
						<tr>
							<td><input type="checkbox" onclick="calculate(this)"
								value="${x.addonscost}" /></td>
							<td>${x.addonstype}</td>
							<td>${x.addonscost}</td>
							<td><input type="number" style="color: #000;"
								onchange="quantity(this)" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<b>Total Add Ons Cost:</b>
			<input type="text" name="total" class="form-control" id="total"
				readonly="readonly" />
			<br />
			<br />
			<input class="btn btn-info" type="submit" value="Continue Booking" /><br/>
		</form:form>
	</div>
</body>
</html>