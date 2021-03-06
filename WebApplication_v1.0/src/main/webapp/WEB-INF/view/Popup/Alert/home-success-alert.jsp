<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Carpenter Service  Alert -->
<c:if test="${param.actsuccess eq'reqCarpenter'}">
	<div class="alert alert-success alert-dismissible fade show" role="alert">
   Your Request has Successfully Submitted. You Will receive Confirmation Email.
  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
</div>
</c:if>


<!-- Electrician Service  Alert -->
<c:if test="${param.actsuccess eq'reqElectrician'}">
	<div class="alert alert-success alert-dismissible fade show" role="alert">
    Your Request has Successfully Submitted. You Will receive Confirmation Email. 
 <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
</div>
</c:if>

<!-- Event Service  Alert -->
<c:if test="${param.actsuccess eq'reqEvent'}">
	<div class="alert alert-success alert-dismissible fade show" role="alert">
  Your Request has Successfully Submitted. You Will receive Confirmation Email.
<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
</div>
</c:if>


<!-- Painter Service  Alert -->
<c:if test="${param.actsuccess eq'reqPainter'}">
	<div class="alert alert-success alert-dismissible fade show" role="alert">
 Your Request has Successfully Submitted. You Will receive Confirmation Email.
<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
</div>
</c:if>


<!-- IronWork Service  Alert -->
<c:if test="${param.actsuccess eq'reqIronWork'}">
	<div class="alert alert-success alert-dismissible fade show" role="alert">
 Your Request has Successfully Submitted. You Will receive Confirmation Email.
<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
</div>
</c:if>


<!-- Plumber Service  Alert -->
<c:if test="${param.actsuccess eq'reqPlumber'}">
	<div class="alert alert-success alert-dismissible fade show" role="alert">
 Your Request has Successfully Submitted. You Will receive Confirmation Email.
<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
</div>
</c:if>

<!-- Tuition Service  Alert -->
<c:if test="${param.actsuccess eq'reqTution'}">
	<div class="alert alert-success alert-dismissible fade show" role="alert">
 Your Request has Successfully Submitted. You Will receive Confirmation Email.
<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
</div>
</c:if>


<!-- Contact Alert -->
<c:if test="${param.actsuccess eq'reqContactUs'}">
	<div class="alert alert-success alert-dismissible fade show" role="alert">
  <strong>Thank You for Contacting us</strong> We Will Contact With You As Soon As Possible.
<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
</div>
</c:if>
