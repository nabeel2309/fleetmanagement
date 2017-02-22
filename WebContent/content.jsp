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
<script src="https://code.jquery.com/jquery-1.7.2.js"
	integrity="sha256-FxfqH96M63WENBok78hchTCDxmChGFlo+/lFIPcZPeI="
	crossorigin="anonymous"></script>
<script type="text/javascript">
	function unhidepanel(a) {
		if (a.checked) {
			document.getElementById("returnlocation").hidden = false;
		} else {
			document.getElementById("returnlocation").hidden = true;
		}
	}
</script>
<script type="text/javascript">
	function myfun(ddl1, ddl2) {
		var mah = [ 'Mumbai', 'Pune', 'Nagpur' ];
		var raj = [ 'Kota', 'Jaipur', 'Jodhpur' ];
		var guj = [ 'Ahmedabad', 'Surat', 'Gandhinagar' ];
		var del = [ 'New Delhi' ];
		var pun = [ 'Amritsar', 'Chandigarh', 'Patiala' ];

		switch (ddl1.value) {
		case 'Maharashtra':
			ddl2.options.length = 0;
			for (i = 0; i < mah.length; i++) {
				createOption(ddl2, mah[i], mah[i]);
			}
			break;
		case 'Rajasthan':
			ddl2.options.length = 0;
			for (i = 0; i < raj.length; i++) {
				createOption(ddl2, raj[i], raj[i]);
			}
			break;
		case 'Gujarat':
			ddl2.options.length = 0;
			for (i = 0; i < guj.length; i++) {
				createOption(ddl2, guj[i], guj[i]);
			}
			break;
		case 'Delhi':
			ddl2.options.length = 0;
			for (i = 0; i < del.length; i++) {
				createOption(ddl2, del[i], del[i]);
			}
			break;
		case 'Punjab':
			ddl2.options.length = 0;
			for (i = 0; i < pun.length; i++) {
				createOption(ddl2, pun[i], pun[i]);
			}
			break;
		}

	}

	function createOption(ddl, text, value) {
		var opt = document.createElement('option');
		opt.value = value;
		opt.text = text;
		ddl.options.add(opt);
	}
</script>
<style type="text/css">
#bgimg {
	background-image: url('background.jpg');
	color: #FFF;
}
</style>
</head>
<body id="bgimg" background="background.jpg">
	<div class="container" style="color: #fff;">
		<h1 align="center">
			<b>Book A Car Now</b>
		</h1>
		<form:form class="form-horizontal" commandName="mybooking"
			method="post">
			<div class="form-group">
				<label class="control-label col-sm-2">Rental Date and Time</label>
				<div class="col-sm-10">
					<form:input class="form-control" type="date" path="pickupdate"
						min="2000-01-02" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Return Date and Time</label>
				<div class="col-sm-10">
					<form:input class="form-control" type="date" path="returndate"
						min="2000-01-02" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Enter Airport Code</label>
				<div class="col-sm-10">
					<form:select class="form-control" path="airportcode">
						<form:option value="BOM(Mumbai)"></form:option>
						<form:option value="DEL(New Delhi)"></form:option>
						<form:option value="IXC(Chandigarh)"></form:option>
						<form:option value="MAA(Chennai)"></form:option>
						<form:option value="COK(Cochin)"></form:option>
						<form:option value="IXC(Chandigarh)"></form:option>
						<form:option value="ISK(Gandhinagar)"></form:option>
						<form:option value="HYD(Hyderabad)"></form:option>
						<form:option value="IXC(Chandigarh)"></form:option>
						<form:option value="JDH(Jodhpur)"></form:option>
						<form:option value="KNU(Kanpur)"></form:option>
						<form:option value="KTU(Kota)"></form:option>
						<form:option value="CCU(Kolkata)"></form:option>
						<form:option value="PNY(Pondicherry)"></form:option>
						<form:option value="VNS(Varanasi)"></form:option>
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Enter State Name</label>
				<div class="col-sm-10">
					<form:select class="form-control" id="one" path="statename"
						onChange="myfun(this,document.getElementById('two'));">
						<form:option value="NONE" label="--- Select State ---" />
						<form:options items="${mystate}" />
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Enter City Name</label>
				<div class="col-sm-10">
					<form:select class="form-control" id="two" path="cityname">
						<form:option value="NONE" label="--- Select City ---" />
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<div class="checkbox">
						<label><input name="cbx" type="checkbox"
							onclick="unhidepanel(this)">I may return the car to
							different location.</label>
					</div>
				</div>
			</div>
			<div hidden="true" id="returnlocation">
				<h2 align="center">
					<b>Return Location</b>
				</h2>
				<div class="form-group">
					<label class="control-label col-sm-2">Enter Airport Code</label>
					<div class="col-sm-10">
						<form:select class="form-control" path="rairportcode">
							<form:option value="BOM(Mumbai)"></form:option>
							<form:option value="DEL(New Delhi)"></form:option>
							<form:option value="IXC(Chandigarh)"></form:option>
							<form:option value="MAA(Chennai)"></form:option>
							<form:option value="COK(Cochin)"></form:option>
							<form:option value="IXC(Chandigarh)"></form:option>
							<form:option value="ISK(Gandhinagar)"></form:option>
							<form:option value="HYD(Hyderabad)"></form:option>
							<form:option value="IXC(Chandigarh)"></form:option>
							<form:option value="JDH(Jodhpur)"></form:option>
							<form:option value="KNU(Kanpur)"></form:option>
							<form:option value="KTU(Kota)"></form:option>
							<form:option value="CCU(Kolkata)"></form:option>
							<form:option value="PNY(Pondicherry)"></form:option>
							<form:option value="VNS(Varanasi)"></form:option>
						</form:select>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2">Enter State Name</label>
					<div class="col-sm-10">
						<form:select class="form-control" id="three" path="rstatename"
							onChange="myfun(this,document.getElementById('four'));">
							<form:option value="NONE" label="--- Select State ---" />
							<form:options items="${mystate}" />
						</form:select>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2">Enter City Name</label>
					<div class="col-sm-10">
						<form:select class="form-control" id="four" path="rcityname">
							<form:option value="NONE" label="--- Select City ---" />
						</form:select>
					</div>
				</div>
			</div>
			<div align="right">
				<input type="submit" class="btn btn-info" value="Continue Booking" />
			</div>

		</form:form>
	</div>
</body>
</html>