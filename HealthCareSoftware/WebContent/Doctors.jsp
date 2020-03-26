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
<link rel = "stylesheet" href = "CSS/Administration.css" >
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<link rel="shortcut icon" href="Images/logohealth.png" type="image.png">
<title>Health Care</title>
</head>
<body class = "bodyAdmin" style ="margin-left : 0; margin-right : 15%;">
	
	
		<!-- Sidebar -->
		<div class="w3-sidebar w3-bar-block w3-card" style="width:15%;right:0; background-color : #000;">
		  <h3 class="w3-bar-item" style = "color : #fff; font-family : Raleway;">Manage</h3>
		  <a href="Customer.jsp" class="w3-bar-item w3-button" style = "color : #fff; font-family : Poppins; text-decoration : none;">Manage Patients</a>
		  <a href="Doctors.jsp" class="w3-bar-item w3-button" style = "color : #fff; font-family : Poppins; text-decoration : none;">Manage Doctors</a>
		  <a href="Booking.jsp" class="w3-bar-item w3-button" style = "color : #fff; font-family : Poppins; text-decoration : none;">Manage Bookings</a>
		  <a href="Hospitals.jsp" class="w3-bar-item w3-button" style = "color : #fff; font-family : Poppins; text-decoration : none;">Manage Hospitals</a>
		</div>
		
		<!-- Page Content -->
		<div style="margin-right:0%; background-color : gray;">
		
		<div class="w3-container w3-teal text-center" style = "background : white;">
		  <h1 style = "color : #fff; font-family : Raleway; color : #000; text-transform : uppercase;">Administration</h1>
		</div>
		
		<img src="Images/logohealth.png" alt="Car" >
		
		<div class="w3-container">
		<jsp:include page="WEB-INF/Views/ManageDoctors.jsp"></jsp:include>
		</div><br><br><br>
		</div><br><br><br>
		
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>