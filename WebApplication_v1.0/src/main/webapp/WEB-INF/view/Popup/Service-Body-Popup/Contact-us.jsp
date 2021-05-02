<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!----SignUp Model---->
<div class="modal fade" id="modalContactUsForm" tabindex="-1"
	role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header text-center">
				<h5 class="modal-title w-100 font-weight-bold">CONTACT US</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div><!--  -->
			<form:form action="contactus"
				modelAttribute="contactUs" name="contactFrm" onsubmit="return contactValid()" class="needs-validation">
				<div class="modal-body mx-3">
					<div class="md-form mb-3">
						<i class="fas fa-user prefix grey-text"></i>
						<form:input type="text" path="Customer_Name"
							id="validationServerUsername55"
							class="form-control is-invalid validate"/>
						<label data-error="wrong" data-success="right"
							for="validationServerUsername55">Your Name</label>
                        <p data-error="wrong" data-success="right" class="invalid-feedback" id="contactName"></p>
						<form:errors class="invalid-feedback" path="Customer_Name" />

					</div>
					<div class="md-form mb-3">
						<i class="fas fa-mobile-alt prefix grey-text"></i>
						<form:input path="mobile" type="text" id="orangeForm-name"
							class="form-control is-invalid  validate"/>
						<label data-error="wrong" data-success="right"
							for="orangeForm-name">Mobile Number</label>
						 <p data-error="wrong" data-success="right" class="invalid-feedback" id="contactMobile"></p>		
						<form:errors class="invalid-feedback" path="mobile" />
					</div>
					<div class="md-form mb-3">
						<i class="fas fa-envelope prefix grey-text"></i>
						<form:input path="email" type="email" id="orangeForm-email"
							class="form-control is-invalid  validate"/>
						<label data-error="wrong" data-success="right"
							for="orangeForm-email">Your Email</label>
						
						 <p data-error="wrong" data-success="right" class="invalid-feedback" id="contactEmail"></p>
						<form:errors class="invalid-feedback" path="email" />
					</div>

					<div class="md-form mb-3">
						<i class="fas fa-user prefix grey-text"></i>
						<form:input type="text" path="issue" id="orangeForm-name"
							class="form-control is-invalid  validate"/>
						<label data-error="wrong" data-success="right"
							for="orangeForm-name">Your Issue</label>
					 <p data-error="wrong" data-success="right" class="invalid-feedback" id="contactIssue"></p>		
						<form:errors class="invalid-feedback" path="issue" />
					</div>
                 <div class="d-flex justify-content-center">
					<button type="submit" class="btn btn-deep-orange">Submit</button>
				</div>
				</div>
				<div class="modal-footer d-flex justify-content-center">
				 <h5 class="modal-title w-100 font-weight-bold">
				  Or Call us on <i class="fas fa-mobile-alt"></i> +918808089692,+919628141545</h5>
				</div>
			</form:form>
		</div>
	</div>
</div>
