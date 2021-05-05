<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="container">
	<div class=" my-4 jumbotron">
		<h3 class="h1-responsive font-weight-bold text-center">CARE
			DIAGNOSTIC</h3>

		<form:form method="post" action="cDRegister" modelAttribute="careDig"
			name="cdRegisterFrm" onsubmit="return cdRegisterValid()"
			class="needs-validation">
			<div class="modal-body mx-3">
				<div class="md-form mb-3">
					<i class="fas fa-user prefix grey-text"></i>
					<form:input type="text" path="name" id="validationServerUsername55"
						class="form-control is-invalid validate" />
					<label data-error="wrong" data-success="right"
						for="validationServerUsername55">Your Name</label>
					<p data-error="wrong" data-success="right" class="invalid-feedback"
						id="cdName"></p>
					<form:errors class="invalid-feedback" path="name" />


				</div>
				<div class="md-form mb-3">
					<i class="fas fa-mobile-alt prefix grey-text"></i>
					<form:input path="mobile" type="text" id="orangeForm-name"
						class="form-control is-invalid  validate" />
					<label data-error="wrong" data-success="right"
						for="orangeForm-name">Mobile Number</label>
					<p data-error="wrong" data-success="right" class="invalid-feedback"
						id="cdMobile"></p>
					<form:errors class="invalid-feedback" path="mobile" />
				</div>
				<div class="md-form mb-3">
					<i class="fas fa-envelope prefix grey-text"></i>
					<form:input path="email" type="email" id="orangeForm-email"
						class="form-control is-invalid  validate" />
					<label data-error="wrong" data-success="right"
						for="orangeForm-email">Your Email</label>
					<p data-error="wrong" data-success="right" class="invalid-feedback"
						id="cdEmail"></p>
					<form:errors class="invalid-feedback" path="email" />
				</div>

				<!-- <div class="md-form mb-3">

					<i class="fas fa-microscope  prefix grey-text"></i>
					<form:input type="text" path="test" id="orangeForm-name"
						class="md-textarea form-control is-invalid  validate" />
					<label data-error="wrong" data-success="right"
						for="orangeForm-name">Test Name</label>
					<p data-error="wrong" data-success="right" class="invalid-feedback"
						id="cdtest"></p>
					<form:errors class="invalid-feedback" path="test" />
				</div> -->
				
				<div class="md-form mb-3">
					
				    <form:select path="test" style="border-top:0px;border-left:0px;border-right:0px;" id="orangeForm-name"
						class="md-textarea form-control is-invalid  validate">
					    <form:option  value="" disabled="" label=" Please Select Your Test"/>    
					  <form:options items="${cdTest}" />
					</form:select>
					<p data-error="wrong" data-success="right" class="invalid-feedback"
						id="cdtest"></p>
					<form:errors class="invalid-feedback" path="test" />
				</div>

				<div class="md-form mb-3">

					<i class="fas fa-map-marked  prefix grey-text"></i>
					<form:input type="text" path="Address" id="orangeForm-name"
						class="md-textarea form-control is-invalid  validate" />
					<label data-error="wrong" data-success="right"
						for="orangeForm-name">Your Address</label>
					<p data-error="wrong" data-success="right" class="invalid-feedback"
						id="cdAddress"></p>
					<form:errors class="invalid-feedback" path="Address" />
				</div>

				<div class="md-form mb-2">
					<i class="fas fa-map-marker-alt prefix grey-text"></i>
					<form:input type="text" path="landmark" id="orangeForm-name"
						class="form-control is-invalid  validate" />
					<label data-error="wrong" data-success="right"
						for="orangeForm-name">Landmark</label>
				</div>

				<div class="d-flex justify-content-center">
					<button type="submit" class="btn btn-deep-orange">BOOK NOW</button>
				</div>
			</div>
		</form:form>
	</div>
</div>

