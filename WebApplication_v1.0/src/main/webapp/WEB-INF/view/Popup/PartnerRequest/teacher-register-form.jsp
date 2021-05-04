<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="container">
	<div class=" my-4 jumbotron">
		<h2 class="h1-responsive font-weight-bold text-center">Teacher</h2>

		<form:form method="post" action="teacherRegister" modelAttribute="teacher"
			name="teacherRegisterFrm" onsubmit="return teacherRegisterValid()"
			class="needs-validation">
			<div class="modal-body mx-3">
				<div class="md-form mb-3">
					<i class="fas fa-user prefix grey-text"></i>
					<form:input type="text" path="name" id="validationServerUsername55"
						class="form-control is-invalid validate" />
					<label data-error="wrong" data-success="right"
						for="validationServerUsername55">Your Name</label>
					<p data-error="wrong" data-success="right" class="invalid-feedback"
						id="teacherName"></p>
					<form:errors class="invalid-feedback" path="name" />


				</div>
				<div class="md-form mb-3">
					<i class="fas fa-mobile-alt prefix grey-text"></i>
					<form:input path="mobile" type="text" id="orangeForm-name"
						class="form-control is-invalid  validate" />
					<label data-error="wrong" data-success="right"
						for="orangeForm-name">Mobile Number</label>
					<p data-error="wrong" data-success="right" class="invalid-feedback"
						id="teacherMobile"></p>
					<form:errors class="invalid-feedback" path="mobile" />
				</div>
				<div class="md-form mb-3">
					<i class="fas fa-envelope prefix grey-text"></i>
					<form:input path="email" type="email" id="orangeForm-email"
						class="form-control is-invalid  validate" />
					<label data-error="wrong" data-success="right"
						for="orangeForm-email">Your Email</label>
					<p data-error="wrong" data-success="right" class="invalid-feedback"
						id="teacherEmail"></p>
					<form:errors class="invalid-feedback" path="email" />
				</div>

				<div class="md-form mb-3">

					<i class="fas fa-book-open prefix grey-text"></i>
					<form:input type="text" path="qualification" id="orangeForm-name"
						class="md-textarea form-control is-invalid  validate" />
					<label data-error="wrong" data-success="right"
						for="orangeForm-name">Qualification</label>
					<p data-error="wrong" data-success="right" class="invalid-feedback"
						id="teacherQualification"></p>
					<form:errors class="invalid-feedback" path="qualification" />
				</div>
				
				<div class="md-form mb-3">
					<i class="fas fa-business-time  prefix grey-text"></i>
					<form:input type="number" path="experience"
					         placeholder="In Number Only(e.g. 2)" id="orangeForm-name"
						class="md-textarea form-control is-invalid  validate" />
					<label data-error="wrong" data-success="right"
						for="orangeForm-name">Experience</label>
					<p data-error="wrong" data-success="right" class="invalid-feedback"
						id="teacherExp"></p>
					<form:errors class="invalid-feedback" path="experience" />
				</div>
			
				<div class="md-form mb-3">

					<i class="fas fa-map-marked  prefix grey-text"></i>
					<form:input type="text" path="Address" id="orangeForm-name"
						class="md-textarea form-control is-invalid  validate" />
					<label data-error="wrong" data-success="right"
						for="orangeForm-name">Your Address</label>
					<p data-error="wrong" data-success="right" class="invalid-feedback"
						id="teacherAddress"></p>
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
					<button type="submit" class="btn btn-deep-orange">Register</button>
				</div>
			</div>
		</form:form>
	</div>
</div>