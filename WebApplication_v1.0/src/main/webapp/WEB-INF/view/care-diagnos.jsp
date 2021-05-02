<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<noscript>
	<div class="alert alert-danger" role="alert">
		Please Enable javaScript in your Browser.
	</div>
</noscript>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="author" content="Harsh Vardhan Pandey">
<meta name="description"
	content="OneOutlet.online, We are providing Service for Electricain,Carpenter,Plumber,Painter,Event Management,IronWork in Gonda.
                                  We Will Provide home service less than in hour in Gonda City.OneOutlet , Electrician at Gonda , Painter at Gonda ,Tutoring Service at Gonda, IronWork at Gonda, Event Management at Gonda ">
<meta
	name="OneOutlet,home tuition,Gonda,Electrician,Carpenter,Plumber,Painter,Event Management,IronWork,Service in gonda,Gonda service "
	content="keywords,here">
<link rel="shortcut icon" href="/Edit/EditCareDiagnos/favicon.ico"
	type="image/vnd.microsoft.icon">
<title>OneOutlet.online Gonda,Book Electrician,Carpenter and Home Tuition in
	Gonda</title>
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<!-- Bootstrap core CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Material Design Bootstrap -->
<link rel="preconnect" href="https://fonts.gstatic.com">

<link
	href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.min.css"
	rel="stylesheet">


<!---Custom CSS-->
<link href='<spring:url value="/Edit/EditHome/custom-home.css"/>'
	rel="stylesheet" />

</head>

<body>
	<!-- Service Success Alert -->

	<jsp:include page="Popup/Alert/home-success-alert.jsp"></jsp:include>


	<!--Navbar -->
	<jsp:include page="Header/CareDiagnosNavbar.jsp"></jsp:include>

	<!-- Body -->
	<div class="container">

	    <jsp:include page="Popup/Care-Diagnos/cd-register-form.jsp"></jsp:include>

	</div>

	<!-- Popups -->
 
	
          
	
       
	<!-- Footer -->
	<jsp:include page="Footer/footer.jsp"></jsp:include>


	<!--Custom javaScript----->

	
	<script type="text/javascript"
		src='<spring:url value="/Edit/EditCareDiagnos/js/custom-home-cdregister.js"/>'></script>


	<!-- JQuery -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<!-- Bootstrap tooltips -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
	<!-- Bootstrap core JavaScript -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>
	<!-- MDB core JavaScript -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/js/mdb.min.js"></script>
		<!-- Service Error Alert -->

	<jsp:include page="Popup/Alert/home-error-alert.jsp"></jsp:include>
</body>
</html>