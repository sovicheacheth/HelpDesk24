<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Topic</title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" />
<link href="datepicker/css/datepicker.css" rel="stylesheet" />
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />

<style>
.green {
	font-weight: bold;
	color: green;
}

.message {
	margin-bottom: 10px;
}

.error {
	color: #ff0000;
	font-size: 0.9em;
	font-weight: bold;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>

	<%@include file="/WEB-INF/views/Header.jsp"%>

	<script src="jquery-1.8.3.js">
		
	</script>

	<script src="bootstrap/js/bootstrap.js">
		
	</script>

	<script src="datepicker/js/bootstrap-datepicker.js">
		
	</script>

	<div class="col-lg-6 col-lg-offset-3">
		<div class="well">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						<h4 align="center">Delete Topic (ID : ${topic.id}) ?</h4>


						<form action="deleteTopic" method="post"
							class="bs-example form-horizontal">


							<div class="form-group">
								<label for="subject" class="col-lg-3 control-label">Title
								</label>
								<div class="col-lg-9">
									<input type="text" value="${topic.title}" class="form-control"
										name="title" id="subject" placeholder=" sample topic " />
									<form:errors path="subject" cssClass="error" />
								</div>
							</div>



							<div class="form-group">
								<div class="col-lg-3"></div>
								<div class="col-lg-9">
									<input type="hidden" name="id" value="${topic.id}">
									<button class="btn btn-danger">Delete</button>
									<a href="topicList" class="btn btn-default">Cancel</a>
								</div>
							</div>


						</form>

					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="/WEB-INF/views/Footer.jsp"%>
</body>
</html>