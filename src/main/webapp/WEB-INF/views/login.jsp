

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
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

.vcenter {
	display: inline-block;
	vertical-align: middle;
	float: none;
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



	<div class="col-lg-6 col-lg-offset-3 align-middle"
		style="margin-top: 5%; margin-left: 35%;">
		<h2>Welcome to IT HelpDesk24!</h2>
	</div>

	<div class="col-lg-6 col-lg-offset-3 align-middle">
		<div class="well align-middle" style="margin-top: 5%;">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">

						<form:form id="myForm" method="post" modelAttribute="command"
							class="bs-example form-horizontal" action="login">

							<fieldset>
								<legend class="align-middle">Log In</legend>

								<div class="form-group">
									<label for="username" class="col-lg-3 control-label">UserName
									</label>
									<div class="col-lg-9">
										<input type="text" class="form-control" name="username"
											id="username" />
									</div>
								</div>

								<div class="form-group">
									<label for="password" class="col-lg-3 control-label">PassWord
									</label>
									<div class="col-lg-9">

										<input type="password" class="form-control" name="password"
											id="password" />
									</div>
								</div>


								<div class="form-group">
									<div class="col-lg-3"></div>
									<div class="col-lg-9">
										<button type="submit" class="btn btn-primary ">Login</button>
										<a href="register"><button class="btn btn-primary ">Register</button></a>
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


