<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="<spring:url value='/resources/css/bootstrap-united.css' />"
	type="text/css" rel="stylesheet" />



    <!-- <link href="<c:url value="/resources/assets/css/bootstrap-united.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery-1.8.3.js" />"></script>
    <script src="<c:url value="/resources/bootstrap/js/bootstrap.js" />"></script>
-->
</head>

<body>
	
		
			
			
			<tiles:insertAttribute name="navigation" />
			<tiles:insertAttribute name="left" />
			<tiles:insertAttribute name="center" />
			<tiles:insertAttribute name="footer" />
	
	
</body>
</html>
