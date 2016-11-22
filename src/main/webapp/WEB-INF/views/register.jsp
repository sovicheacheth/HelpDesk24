

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Staff registration</title>
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




	<script src="jquery-1.8.3.js">
		
	</script>

	<script src="bootstrap/js/bootstrap.js">
		
	</script>

	<script src="datepicker/js/bootstrap-datepicker.js">
		
	</script>


	<c:if test="${not empty message}">
		<div class="message green">${message}</div>
	</c:if>

	<div class="col-lg-6 col-lg-offset-3">
		<div class="well">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						<form:form id="myForm" method="post"
							class="bs-example form-horizontal" modelAttribute="staff"
							action="register">


							<fieldset>
								<legend>Registration</legend>



								<div class="form-group">
									<label for="file" class="col-lg-3 control-label">FirstName
									</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control" path="firstname"
											id="firstname" placeholder=" FirstName " />
									</div>
								</div>




								<div class="form-group">
									<label for="file" class="col-lg-3 control-label">LastName
									</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control" path="lastname"
											id="lastname" placeholder=" LastName " />
									</div>
								</div>




								<div class="form-group">
									<label class="col-lg-3 control-label" for="priority">Gender</label>
									<div class="col-lg-9">
										<form:select path="gender" class="form-control">

											<option>female</option>
											<option>male</option>

										</form:select>
									</div>
								</div>





								<div class="form-group">
									<label for="file" class="col-lg-3 control-label">Email
									</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control" path="email"
											id="email" placeholder=" Email Address " />
									</div>
								</div>




								<div class="form-group">
									<label class="col-lg-3 control-label" for="priority">Position</label>
									<div class="col-lg-9">
										<form:select path="position" class="form-control">

											<option>Accountant</option>
											<option>Developer</option>
											<option>Technician</option>
											<option>Manager</option>
											<option>Secretary</option>

										</form:select>
									</div>
								</div>





								<div class="form-group">
									<label for="file" class="col-lg-3 control-label">Mobile
									</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control" path="mobile"
											id="mobile" placeholder=" Mobile Number " />
									</div>
								</div>



								<div class="form-group">
									<label for="file" class="col-lg-3 control-label">Building
									</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control"
											path="address.buildingNo" id="address.buildingNo"
											placeholder=" Building Number " />
									</div>
								</div>




								<div class="form-group">
									<label for="file" class="col-lg-3 control-label">Office
									</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control"
											path="address.officeNo" id="address.officeNo"
											placeholder=" Office Number " />
									</div>
								</div>





								<div class="form-group">
									<label for="file" class="col-lg-3 control-label">Phone
									</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control" path="address.phone"
											id="address.phone" placeholder=" Phone Number " />
									</div>
								</div>



								
								<div class="form-group">
									<label for="file" class="col-lg-3 control-label">Extention
									</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control" path="address.ext"
											id="address.ext" placeholder=" Extention" />
									</div>
								</div>
								
								

								
								
								
								<div class="form-group">
									<label for="file" class="col-lg-3 control-label">UserName
									</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control" path="username"
											id="account.username" placeholder=" User Name " />
									</div>
								</div>
								
								

								<div class="form-group">
									<label for="file" class="col-lg-3 control-label">PassWord
									</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control" path="password"
											id="account.password" placeholder=" PassWord" />
									</div>
								</div>
								




								



								<div class="form-group">
									<div class="col-lg-10 col-lg-offset-2">
										<button type="reset" class="btn btn-default">Cancel</button>
										<button type="submit" class="btn btn-primary ">Submit</button>
									</div>
								</div>
							</fieldset>
						</form:form>
					</div>



				</div>
			</div>
		</div>
	</div>


</body>
</html>

