<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>delete</title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" />
<link href="datepicker/css/datepicker.css" rel="stylesheet" />
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />

<%@ include file="Header.jsp"%>

<title>Ticket Assignment</title>

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

<div class="container">
	<div class="jumbotron">
		<form:form id="myform" method="post"
			class="bs-example form-horizontal" modelAttribute="ticketAssignment"
			action="ticketAssignment">
			<fieldset>

				<legend>Ticket Assignment</legend>

				<input type="hidden" name="id" value="${ticket.id}">


				<div class="form-group">
					<label for="inputEmail" class="col-lg-2 control-label">Title</label>
					<div class="col-lg-10">

						<input type="text" class="form-control" id="txtTicketTitle"
							value="${ticket.subject}">
					</div>
				</div>

				<div class="form-group">
					<label for="inputDate" class="col-lg-2 control-label">Date</label>
					<div class="col-lg-10">
						<input type="text" class="form-control" id="txtDate"
							value="${ticket.date}">
					</div>
				</div>

				<!-- Select Priority -->
				<div class="form-group">
					<label for="select" class="col-lg-2 control-label">Priority</label>
					<div class="col-lg-10">

						<select value="${ticket.priority}" class="form-control"
							id="priority">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select>
					</div>
				</div>

				<!-- Assign to staff -->
				<div class="form-group">
					<label for="select" class="col-lg-2 control-label">Staff</label>
					<div class="col-lg-10">

						<select name="staff_id" class="form-control" id="staff_id">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select>

					</div>
				</div>

				<div class="form-group">
					<label for="textArea" class="col-lg-2 control-label">Comment</label>
					<div class="col-lg-10">
						<input type="textarea" class="form-control" id="txtDate"
							value="${ticket.comment}" path="comment" />
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-10 col-lg-offset-2">
						<button type="reset" class="btn btn-default">Cancel</button>
						<button type="submit" class="btn btn-primary" id="myBtn">Submit</button>
					</div>
				</div>
			</fieldset>
		</form:form>
	</div>


</div>


<%@include file="/WEB-INF/views/Footer.jsp"%>