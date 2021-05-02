<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--Navbar -->
<nav class="mb-1 navbar navbar-expand-lg navbar-dark"
	style="background-color: #212121;">
	<a class="navbar-brand animated bounce" href="./"> <img
		src="<spring:url value="/Edit/EditHome/logo.jpg"/>"
		class="img-fluid  infinite" style="width: 40px" alt="logo">
		&nbsp OneOutlet.online
	</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent-333"
		aria-controls="navbarSupportedContent-333" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarSupportedContent-333">
		<ul class="navbar-nav mr-auto">
			<!-- Menu -->
		</ul>



		<ul class="navbar-nav ml-auto nav-flex-icons">

			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" id="navbarDropdownMenuLink"
				data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">List
					Of Tests</a>
				<div class="dropdown-menu dropdown-primary"
					aria-labelledby="navbarDropdownMenuLink">
					<c:forEach items="${cdTest}" var="value">
						<a class="dropdown-item" href="#"><c:out value="${value}" /></a>
					</c:forEach>
				</div></li>




			<li class="nav-item"><a class="nav-link" href="./aboutus">About
					Us</a></li>



		</ul>

	</div>
</nav>
<!--/.Navbar -->
