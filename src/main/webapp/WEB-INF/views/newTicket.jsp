<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create new ticket</title>
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

	<c:if test="${not empty message}">
		<div class="message green">${message}</div>
	</c:if>

	<div class="col-lg-6 col-lg-offset-3">
		<div class="well">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						<form:form id="myform" method="post"
							class="bs-example form-horizontal" modelAttribute="ticket"
							action="newTicket">
							<fieldset>
								<legend>Create New Ticket </legend>

								<div class="form-group">
									<label class="col-lg-3 control-label" for="topic">Select
										Topic </label>
									<div class="col-lg-9">
										<form:select path="topic" class="form-control" id="topic">
											<c:forEach items="${categoryMap}" var="topic">
												<option value="${topic.key}">${topic.value}</option>
											</c:forEach>
										</form:select>
									</div>
								</div>

								<div class="form-group">
									<label for="subject" class="col-lg-3 control-label">Subject
									</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control" path="subject"
											id="subject" placeholder=" sample topic " />
										<form:errors path="subject" cssClass="error" />
									</div>
								</div>

								<div class="form-group">
									<label class="col-lg-3 control-label" for="comment">Comment</label>
									<div class="col-lg-9">
										<form:textarea path="comment" class="form-control" rows="3" />
									</div>
								</div>														

								<div class="form-group">
									<label class="col-lg-3 control-label" for="priority">Selects</label>
									<div class="col-lg-9">
										<form:select path="priority" class="form-control">

											<option>Low</option>
											<option>Medium</option>
											<option>High</option>
											<option>Urgent</option>
											<option>Critical</option>
										</form:select>
									</div>
								</div>

								<div class="col-lg-9 col-lg-offset-3">									
									<button class="btn btn-primary">Submit</button>
								</div>
							</fieldset>
						</form:form>
					</div>



				</div>
			</div>
		</div>
	</div>

	<%@include file="/WEB-INF/views/Footer.jsp"%>


</body>
</html>