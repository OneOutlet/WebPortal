<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!----SignUp Model---->
<div class="modal fade" id="modalRegisterForm" tabindex="-1"
	role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header text-center">
				<h4 class="modal-title w-100 font-weight-bold">Sign up</h4>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form:form action="login" modelAttribute="signup">
				<div class="modal-body mx-3">
					<div class="md-form mb-5">
						<i class="fas fa-user prefix grey-text"></i>
						<form:input type="text" path="name" id="orangeForm-name"
							class="form-control validate" />
						<label data-error="wrong" data-success="right"
							for="orangeForm-name">Your name</label>
					</div>
					<div class="md-form mb-5">
						<i class="fas fa-mobile-alt prefix grey-text"></i>
						<form:input path="mobile" type="text" id="orangeForm-name"
							class="form-control validate" />
						<label data-error="wrong" data-success="right"
							for="orangeForm-name">Mobile Number</label>
					</div>
					<div class="md-form mb-5">
						<i class="fas fa-envelope prefix grey-text"></i>
						<form:input path="email" type="email" id="orangeForm-email"
							class="form-control validate" />
						<label data-error="wrong" data-success="right"
							for="orangeForm-email">Your email</label>
					</div>

					<div class="md-form mb-5">
						<!-- Material inline 1 -->
						<div class="form-check form-check-inline">
							<form:radiobutton class="form-check-input" value="m"
								id="materialInline1" path="gender" />
							<label class="form-check-label" for="materialInline1">Male</label>
						</div>

						<!-- Material inline 2 -->
						<div class="form-check form-check-inline">
							<form:radiobutton class="form-check-input" value="f"
								id="materialInline2" path="gender" />
							<label class="form-check-label" for="materialInline2">Female</label>
						</div>

					</div>
					<div class="md-form mb-4">
						<i class="fas fa-lock prefix grey-text"></i>
						<form:input path="password" type="password" id="orangeForm-pass"
							class="form-control validate" />
						<label data-error="wrong" data-success="right"
							for="orangeForm-pass">Your password</label>
					</div>

				</div>
				<div class="modal-footer d-flex justify-content-center">
					<button type="submit" class="btn btn-deep-orange">Sign up</button>
				</div>
			</form:form>
		</div>
	</div>
</div>
