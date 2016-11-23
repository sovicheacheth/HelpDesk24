<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


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
		<form:form id="myform" method="POST"
			class="bs-example form-horizontal" modelAttribute="ticketAssignment"
			action="ticketAssignment">
			<fieldset>

				<legend>Ticket Assignment</legend>
				
				<input type="hidden" name="id" value="${ticket.id}">

				<div class="form-group">
					<label for="inputEmail" class="col-lg-3 control-label">Title</label>
					<div class="col-lg-9">

						<input type="text" class="form-control"
							value="${ticket.subject}">
					</div>
				</div>



				<!-- Select Priority -->
				<div class="form-group">
					<label for="select" class="col-lg-3 control-label">Priority</label>
					<div class="col-lg-9">

						<select name="priority" class="form-control" id="priority">
							<option>Low</option>
							<option>Medium</option>
							<option>High</option>
							<option>Urgent</option>
							<option>Critical</option>
						</select>
					</div>
				</div>

				<!-- Assign to staff -->
				<div class="form-group">
					<label class="col-lg-3 control-label" for="topic">Select
						Staff</label>
					<div class="col-lg-9">
						<form:select path="staff_id" class="form-control" id="staff_id">
							<c:forEach items="${staffMap}" var="staff">
								<option value="${staff.key}">${staff.value}</option>
							</c:forEach>
						</form:select>
					</div>
				</div>

				<div class="form-group">
					<label for="textArea" class="col-lg-3 control-label">Comment</label>
					<div class="col-lg-9">
						<input type="textarea" class="form-control" id="txtDate"
							value="${ticket.comment}" path="comment" />
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-9 col-lg-offset-2">
						<button type="reset" class="btn btn-default">Cancel</button>
						<button type="submit" class="btn btn-primary" id="myBtn">Submit</button>
					</div>
				</div>
			</fieldset>
		</form:form>
	</div>


</div>


<%@include file="/WEB-INF/views/Footer.jsp"%>