<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<!doctype html>
<html class="fixed">
	<head>

		<!-- Basic -->
		<meta charset="UTF-8">

		<title>Dashboard | Porto Admin - Responsive HTML5 Template 1.5.2</title>
		<meta name="keywords" content="HTML5 Admin Template" />
		<meta name="description" content="Porto Admin - Responsive HTML5 Template">
		<meta name="author" content="okler.net">

		<!-- Mobile Metas -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

		<!-- Web Fonts  -->
		<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800|Shadows+Into+Light" rel="stylesheet" type="text/css">

		<!-- Vendor CSS -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/vendor/bootstrap/css/bootstrap.css" />

		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/vendor/font-awesome/css/font-awesome.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/vendor/magnific-popup/magnific-popup.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/vendor/bootstrap-datepicker/css/bootstrap-datepicker3.css" />

		<!-- Specific Page Vendor CSS -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/vendor/jquery-ui/jquery-ui.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/vendor/jquery-ui/jquery-ui.theme.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/vendor/bootstrap-multiselect/bootstrap-multiselect.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/vendor/morris.js/morris.css" />

		<!-- Theme CSS -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/stylesheets/theme.css" />

		<!-- Skin CSS -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/stylesheets/skins/default.css" />

		<!-- Theme Custom CSS -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/stylesheets/theme-custom.css">

		<!-- Head Libs -->
		<script src="${pageContext.request.contextPath}/assets/vendor/modernizr/modernizr.js"></script>

	</head>
	<body>
		<section class="body">
		
		
			<!-- start: header -->
			<t:insertAttribute name="header" />
			<!-- end: header -->
				
			<div class="inner-wrapper">

				<!-- start: sidebar -->
				<t:insertAttribute name="left-aside" />
				<!-- end: sidebar -->
				
		        <!-- Body
		        ============================================= -->        
				<t:insertAttribute name="body" />				


			</div>		
			<t:insertAttribute name="right-aside" />
			
		</section>

		<!-- Vendor -->
		<script src="${pageContext.request.contextPath}/assets/vendor/jquery/jquery.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jquery-browser-mobile/jquery.browser.mobile.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/bootstrap/js/bootstrap.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/nanoscroller/nanoscroller.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/magnific-popup/jquery.magnific-popup.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jquery-placeholder/jquery-placeholder.js"></script>
		
		<!-- Specific Page Vendor -->
		<script src="${pageContext.request.contextPath}/assets/vendor/jquery-ui/jquery-ui.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jqueryui-touch-punch/jqueryui-touch-punch.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jquery-appear/jquery-appear.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/bootstrap-multiselect/bootstrap-multiselect.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jquery.easy-pie-chart/jquery.easy-pie-chart.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/flot/jquery.flot.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/flot.tooltip/flot.tooltip.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/flot/jquery.flot.pie.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/flot/jquery.flot.categories.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/flot/jquery.flot.resize.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jquery-sparkline/jquery-sparkline.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/raphael/raphael.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/morris.js/morris.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/gauge/gauge.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/snap.svg/snap.svg.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/liquid-meter/liquid.meter.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jqvmap/jquery.vmap.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jqvmap/data/jquery.vmap.sampledata.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jqvmap/maps/jquery.vmap.world.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jqvmap/maps/continents/jquery.vmap.africa.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jqvmap/maps/continents/jquery.vmap.asia.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jqvmap/maps/continents/jquery.vmap.australia.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jqvmap/maps/continents/jquery.vmap.europe.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jqvmap/maps/continents/jquery.vmap.north-america.js"></script>
		<script src="${pageContext.request.contextPath}/assets/vendor/jqvmap/maps/continents/jquery.vmap.south-america.js"></script>
		
		<!-- Theme Base, Components and Settings -->
		<script src="${pageContext.request.contextPath}/assets/javascripts/theme.js"></script>
		
		<!-- Theme Custom -->
		<script src="${pageContext.request.contextPath}/assets/javascripts/theme.custom.js"></script>
		
		<!-- Theme Initialization Files -->
		<script src="${pageContext.request.contextPath}/assets/javascripts/theme.init.js"></script>

		<!-- Examples -->
		<script src="${pageContext.request.contextPath}/assets/javascripts/dashboard/examples.dashboard.js"></script>
	</body>
</html>			
			