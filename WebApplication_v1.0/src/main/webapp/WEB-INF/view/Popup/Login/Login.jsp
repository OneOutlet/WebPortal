<!---Login Model----->
<!-- Modal -->
<div class="modal fade" id="elegantModalForm" tabindex="-1"
	role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<!--Content-->
		<div class="modal-content form-elegant">
			<!--Header-->
			<div class="modal-header text-center">
				<h3 class="modal-title w-100 dark-grey-text font-weight-bold my-3"
					id="myModalLabel">
					<strong>Sign in</strong>
				</h3>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<!--Body-->
			<div class="modal-body mx-4">
				<!--Body-->
				<div class="md-form mb-5">
					<input type="email" id="Form-email1" class="form-control validate">
					<label data-error="wrong" data-success="right" for="Form-email1">Your
						email</label>
				</div>

				<div class="md-form pb-3">
					<input type="password" id="Form-pass1"
						class="form-control validate"> <label data-error="wrong"
						data-success="right" for="Form-pass1">Your password</label>
					<p class="font-small blue-text d-flex justify-content-end">
						Forgot <a href="#" class="blue-text ml-1"> Password?</a>
					</p>
				</div>

				<div class="text-center mb-3">
					<button type="button"
						class="btn blue-gradient btn-block btn-rounded z-depth-1a">Sign
						in</button>
				</div>
			</div>
			<!--Footer-->
			<div class="modal-footer mx-5 pt-3 mb-1">
				<p class="font-small grey-text d-flex justify-content-end">
					Not a member? <a href="#" class="blue-text ml-1"
						data-dismiss="modal" aria-label="Close" data-toggle="modal"
						data-target="#modalRegisterForm"> Sign Up</a>
				</p>
			</div>
		</div>
		<!--/.Content-->
	</div>
</div>
<!-- Modal -->