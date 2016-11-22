<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Staff</title>
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
						<h3 align="center">Editing Staff Member with ID Number:
							${staff.id}</h3>


						<form action="editStaff" method="post"
							class="bs-example form-horizontal">


							<div class="form-group">
								<label for="firstname" class="col-lg-3 control-label">First
									name </label>
								<div class="col-lg-9">
									<input type="text" value="${staff.firstname}"
										class="form-control" name="firstname" id="firstname"
										placeholder="first name" />
									<form:errors path="firstname" cssClass="error" />
								</div>
							</div>





							<div class="form-group">
								<label for="lastname" class="col-lg-3 control-label">Last
									name </label>
								<div class="col-lg-9">
									<input type="text" value="${staff.lastname}"
										class="form-control" name="lastname" id="lastname"
										placeholder="last name" />
									<form:errors path="lastname" cssClass="error" />
								</div>
							</div>





							<div class="form-group">
								<label for="email" class="col-lg-3 control-label">Email
								</label>
								<div class="col-lg-9">
									<input type="text" value="${staff.email}" class="form-control"
										name="email" id="email" placeholder="email" />
									<form:errors path="email" cssClass="error" />
								</div>
							</div>



							<div class="form-group">
								<label for="mobile" class="col-lg-3 control-label">Mobile
								</label>
								<div class="col-lg-9">
									<input type="text" value="${staff.mobile}" class="form-control"
										name="mobile" id="mobile" placeholder="mobile" />
									<form:errors path="mobile" cssClass="error" />
								</div>
							</div>




							<div class="form-group">
								<label for="bldg" class="col-lg-3 control-label">Building
									No </label>
								<div class="col-lg-9">
									<input type="text" value="${staff.address.buildingNo}"
										class="form-control" name="bldg" id="bldg"
										placeholder="buildingNo" />
									<form:errors path="buildg" cssClass="error" />
								</div>
							</div>



							<div class="form-group">
								<label for="office" class="col-lg-3 control-label">Office
								</label>
								<div class="col-lg-9">
									<input type="text" value="${staff.address.officeNo}"
										class="form-control" name="office" id="mobile"
										placeholder="office" />
									<form:errors path="office" cssClass="error" />
								</div>
							</div>



							<div class="form-group">
								<label for="email" class="col-lg-3 control-label">Username
								</label>
								<div class="col-lg-9">
									<input type="text" value="${staff.username}"
										class="form-control" name="username" id="username"
										placeholder="username" />
									<form:errors path="username" cssClass="error" />
								</div>
							</div>



							<input type="hidden" name="id" value="${staff.id}">
							<button class="btn btn-warning">update Staff</button>
							<a href="staffList" class="btn btn-default">Cancel</a>


						</form>

					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="/WEB-INF/views/Footer.jsp"%>

</body>
</html>

