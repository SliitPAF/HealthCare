<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" ></script>
<link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>
<link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet'>
<link rel = "stylesheet" href = "CSS/index.css" >
<link rel="shortcut icon" href="Images/logohealth.png" type="image.png">
<title>Health Care</title>
</head>

<body class = "body">

	<div class = "headerup">
	<img src="Images/logohealth.png" class="rounded float-left" alt="...">
	<h2 class = "text-center" style = "margin-top : 20px;">Health Care web base outpatient Medical</h2>
	<h4 class = "text-center" style = "margin-top : -4px;">Appointment Booking System</h4>
	</div>
	<jsp:include page="WEB-INF/Views/Header1.jsp"></jsp:include>
	<jsp:include page="WEB-INF/Views/Header.jsp"></jsp:include>
	
	
	
	<form action = "addTestServlet" method = "POST" >
	  <div class="form-group">
	    <label for="exampleInputEmail1">Email address</label>
	    <input type="email" class="form-control" name="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" required>
	    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
	  </div>
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form>
	
	
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</body>
</html>