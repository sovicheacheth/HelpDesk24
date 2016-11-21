

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


<!--  
	<div class="navbar navbar-default">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-responsive-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>

		<div class="navbar-collapse collapse navbar-responsive-collapse">
			<form class="navbar-form navbar-right">
				<input type="text" class="form-control" placeholder="Search">
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/StudentEnrollmentWithSpring">Home</a></li>
				<li class="active"><a href="signup.html">Signup</a></li>
				<li><a href="login.html">Login</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Explore<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">Contact us</a></li>
						<li class="divider"></li>
						<li><a href="#">Further Actions</a></li>
					</ul></li>
			</ul>
		</div>
	
	</div>


-->

	<script src="jquery-1.8.3.js">
		
	</script>

	<script src="bootstrap/js/bootstrap.js">
		
	</script>

	<script src="datepicker/js/bootstrap-datepicker.js">
		
	</script>

<!--  
	<div class="container">
		<div class="jumbotron">
			<div>
				<h1></h1>
				<p>Its absolutely quick!</p>
			</div>
		</div>

		<div></div>
	</div>

-->

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
									<label for="inputFirstName" class="col-lg-2 control-label">FirstName</label>
									<div class="col-lg-10">
										<input type="text" class="form-control" id="firstname"
											placeholder="FirstName">
									</div>
								</div>

								<div class="form-group">
									<label for="inputLastName" class="col-lg-2 control-label">LastName</label>
									<div class="col-lg-10">
										<input type="text" class="form-control" id="lastname"
											placeholder="LastName">
									</div>
								</div>

								<div class="form-group">
									<label class="col-lg-2 control-label">Gender</label>
									<div class="col-lg-10">
										<div class="radio">
											<label> <input type="radio" name="optionsRadios"
												id="gender" value="female"> Female
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" name="optionsRadios"
												id="gender" value="male"> Male
											</label>
										</div>
									</div>
								</div>



								<div class="form-group">
									<label for="inputEmail" class="col-lg-2 control-label">Email</label>
									<div class="col-lg-10">
										<input type="text" class="form-control" id="email"
											placeholder="Email">
									</div>
								</div>


								<div class="form-group">
									<label for="select" class="col-lg-2 control-label">Position</label>
									<div class="col-lg-10">
										<form:select path="position" id="position">
								
											<option>Accountant</option>
											<option>Developer</option>
											<option>Technician</option>
											<option>Manager</option>
											<option>Secretary</option>
										</form:select>

									</div>
								</div>


								<div class="form-group">
									<label for="inputMoble" class="col-lg-2 control-label">Mobile</label>
									<div class="col-lg-10">
										<input type="text" class="form-control" id="mobile"
											placeholder="Mobile">
									</div>
								</div>





								<div class="form-group">
									<label for="inputBldg" class="col-lg-2 control-label">Bldg
										No</label>
									<div class="col-lg-10">
										<input type="text" class="form-control"
											id=" address.buildingNo" placeholder="Building Number">
									</div>
								</div>


								<div class="form-group">
									<label for="inputOffice" class="col-lg-2 control-label">Office
										No</label>
									<div class="col-lg-10">
										<input type="text" class="form-control" id="address.officeNo"
											placeholder="Office Number">
									</div>
								</div>


								<div class="form-group">
									<label for="inputPhone" class="col-lg-2 control-label">Phone
										No</label>
									<div class="col-lg-10">
										<input type="text" class="form-control" id="address.phone"
											placeholder="Phone Number">
									</div>
								</div>

								<div class="form-group">
									<label for="inputExt" class="col-lg-2 control-label">Extention</label>
									<div class="col-lg-10">
										<input type="text" class="form-control" id="address.ext"
											placeholder="Extention">
									</div>
								</div>

								<div class="form-group">
									<label for="inputUserName" class="col-lg-2 control-label">UserName</label>
									<div class="col-lg-10">
										<input type="text" class="form-control" id="account.username"
											placeholder="UserName">
									</div>
								</div>


								<div class="form-group">
									<label for="inputPassword" class="col-lg-2 control-label">Password</label>
									<div class="col-lg-10">
										<input type="password" class="form-control"
											id="account.password" placeholder="Password">


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

