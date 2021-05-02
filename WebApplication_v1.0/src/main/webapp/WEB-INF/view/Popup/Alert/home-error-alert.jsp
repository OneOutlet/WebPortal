<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Carpenter Service Error Alert -->
<c:if test="${act eq'reqCarpenter'}">
	 <script>
       $(document).ready(function(){
            $('#modalCarpenterForm').modal('show');
        }); 
    </script>
</c:if>


<!-- Electrician Service Error Alert -->
<c:if test="${act eq'reqElectrician'}">
	 <script>
       $(document).ready(function(){
            $('#modalElectricianForm').modal('show');
        }); 
    </script>
</c:if>


<!-- Event Service Error Alert -->
<c:if test="${act eq'reqEvent'}">

	 <script>
       $(document).ready(function(){
            $('#modalEventForm').modal('show');
        }); 
    </script>
</c:if>


<!-- Painter Service Error Alert -->
<c:if test="${act eq'reqPainter'}">
	 <script>
       $(document).ready(function(){
            $('#modalPainterForm').modal('show');
        }); 
    </script>
</c:if>


<!-- IronWork Service Error Alert -->
<c:if test="${act eq'reqIronWork'}">
	 <script>
       $(document).ready(function(){
            $('#modalironworkForm').modal('show');
        }); 
    </script>
</c:if>

<!-- Plumber Service Error Alert -->
<c:if test="${act eq'reqPlumber'}">
	 <script>
       $(document).ready(function(){
            $('#modalPlumberForm').modal('show');
        }); 
    </script>
</c:if>

<!-- Contact Us Error Alert -->
<c:if test="${act eq'reqTution'}">
	
	 <script>
       $(document).ready(function(){
            $('#modalTuitionForm').modal('show');
        }); 
    </script>
</c:if>

<!-- Contact Us Error Alert -->
<c:if test="${act eq'reqContactUs'}">
	
	 <script>
       $(document).ready(function(){
            $('#modalContactUsForm').modal('show');
        }); 
    </script>
</c:if>

<!-- Care Diagnos Error Alert -->
<c:if test="${act eq'reqCD'}">
	
	 <script>
       $(document).ready(function(){
            $('#modalCareDig').modal('show');
        }); 
    </script>
</c:if>