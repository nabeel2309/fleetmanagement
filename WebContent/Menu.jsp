<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Lato"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet" type="text/css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="icon" href="safar_favicon.ico" type="image/gif" sizes="16x16">
<style>
.container {
	padding: 80px 120px;
}
.open .dropdown-toggle {
	color: #fff;
	background-color: #555 !important;
}

.dropdown-menu li a {
	color: #000 !important;
}

.dropdown-menu li a:hover {
	background-color: red !important;
}
.navbar {
	font-family: Montserrat, sans-serif;
	margin-bottom: 0;
	background-color: #2d2d30;
	border: 0;
	font-size: 11px;
	letter-spacing: 4px;
	opacity: 0.9;
}

.navbar li a, .navbar .navbar-brand {
	color: #d5d5d5;
}

.navbar-nav li a:hover {
	color: #fff;
}

.navbar-nav li.active a {
	color: #fff;
	background-color: #29292c;
}

.navbar-default .navbar-toggle {
	border-color: transparent;
}
</style>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar"
	data-offset="50">

	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#myPage">Safar Inc.</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="index.jsp">HOME</a></li>
					<li><a href="aboutus.jsp">ABOUT</a></li>
					<li><a href="login.do">LOGIN</a></li>
					<li><a href="register.do">SIGN UP</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">MORE <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Vechicle categories</a></li>
							<li><a href="#">Pricing</a></li>
							<li><a href="#">Add Ons</a></li>
							<li><a href="#">Gallery</a></li>
							<li><a href="#">Contact</a></li>
						</ul></li>
					<li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
				</ul>
			</div>
		</div>
	</nav>
	<script>
			$(document).ready(
					function() {
						// Initialize Tooltip
						$('[data-toggle="tooltip"]').tooltip();

						// Add smooth scrolling to all links in navbar + footer link
						$(".navbar a, footer a[href='#myPage']").on('click',
								function(event) {

									// Make sure this.hash has a value before overriding default behavior
									if (this.hash !== "") {

										// Prevent default anchor click behavior
										event.preventDefault();

										// Store hash
										var hash = this.hash;

										// Using jQuery's animate() method to add smooth page scroll
										// The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
										$('html, body').animate({
											scrollTop : $(hash).offset().top
										}, 900, function() {

											// Add hash (#) to URL when done scrolling (default click behavior)
											window.location.hash = hash;
										});
									} // End if
								});
					})
		</script>
	</body>