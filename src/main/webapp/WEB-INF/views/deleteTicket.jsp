<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Ticket</title>
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
						<h4 align="center">Delete Ticket (ID : ${ticket.id}) ?</h4>


						<form action="deleteTicket" method="post"
							class="bs-example form-horizontal">
							<div class="form-group">
								<label class="col-lg-3 control-label" for="topic_id">Select
									Topic </label>
								<div class="col-lg-9">

									<select name="topic" class="form-control">

										<option value="${ticket.topic }">${ticket.topic }</option>
									</select>
								</div>
							</div>




							<div class="form-group">
								<label for="subject" class="col-lg-3 control-label">Subject
								</label>
								<div class="col-lg-9">
									<input type="text" value="${ticket.subject}"
										class="form-control" name="subject" id="subject"
										placeholder=" sample topic " />
									<form:errors path="subject" cssClass="error" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-lg-3 control-label" for="comment">Comment</label>
								<div class="col-lg-9">
									<textarea name="comment" class="form-control" rows="3">${ticket.comment }</textarea>
								</div>
							</div>

							<div class="form-group">
								<label for="file" class="col-lg-3 control-label">file
									upload </label>
								<div class="col-lg-9">
									<input type="text" value="${ticket.file}" class="form-control"
										name="file" id="file" placeholder=" sample topic " />
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-3 control-label" for="priority">Selects</label>
								<div class="col-lg-9">
									<select name="priority" class="form-control">
										<option value="${ticket.priority}">${ticket.priority}</option>
										<option>Low</option>
										<option>Medium</option>
										<option>High</option>
										<option>Urgent</option>
										<option>Critical</option>
									</select>
								</div>
							</div>

							<div class="form-group">
								<div class="col-lg-3"></div>
								<div class="col-lg-9">
									<input type="hidden" name="id" value="${ticket.id}">
									<button class="btn btn-danger">Delete</button>
									<a href="ticketList" class="btn btn-default">Cancel</a>
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