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

h3, h4 {
	margin: 10px 0 30px 0;
	letter-spacing: 10px;
	font-size: 20px;
	color: #111;
}

.container {
	padding: 80px 120px;
}

.carousel-inner img {
	-webkit-filter: grayscale(90%);
	filter: grayscale(90%); /* make all photos black and white */
	width: 100%; /* Set width to 100% */
	margin: auto;
}

.carousel-caption h3 {
	color: #fff !important;
}

@media ( max-width : 600px) {
	.carousel-caption {
		display: none;
		/* Hide the carousel text when the screen is less than 600 pixels wide */
	}
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
</style>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar"
	data-offset="50">

	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="webslider_1.png" alt="Safar 1">
				<div class="carousel-caption">
					<h3>SUV</h3>
					<p>Spacious cars.</p>
				</div>
			</div>

			<div class="item">
				<img src="webslider_2.jpg" alt="Sedan" width="460" height="200">
				<div class="carousel-caption">
					<h3>Sedan</h3>
					<p>Pro Plan Sedan with more features.</p>
				</div>
			</div>

			<div class="item">
				<img src="webslider_3.jpg" alt="Sedan" width="460" height="200">
				<div class="carousel-caption">
					<h3>Safar Inc.</h3>
					<p>Fits your budget.</p>
				</div>
			</div>
			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
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
</html>