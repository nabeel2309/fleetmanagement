<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style type="text/css">
	#bgimg {
    background-image: url('login_background.jpg');
	color:  #FFF;
}
</style>
</head>
<body onload="ready()">
<div class="panel panel-default" id="bgimg">
<div class="panel-body">
<div class="container">
<h1 align="center"><b>Login Details</b></h1>
<form:form commandName="mycustomer" method="post">
  <table class="table">    
    <tbody>      
      <tr>
		<td><label>Enter Username:</label></td>
        <td><input name="uname" type="text" class="form-control" placeholder="Enter Username" /></td>	
      </tr>        
	  <tr>
		<td><label>Enter Password:</label></td>
        <td><input name="passwd" type="password" class="form-control" placeholder="Enter Password" /></td>
      </tr>
	 <tr>
		<td><a href="register.do" class="btn btn-info" role="button">Are You New??</a></td>
        <td><input type="submit" class="btn btn-success" value="Login"></td>
      </tr>
    </tbody>  
	</table>
	</form:form>
</div>
</div>
</div>
</body>
</html>