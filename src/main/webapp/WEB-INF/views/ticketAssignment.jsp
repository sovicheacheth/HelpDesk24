<%@ include file="Header.jsp"%>

<title>Ticket Assignment</title>


<div class="container">
	<div class="jumbotron">
		<form:form id="myform" method="post"
			class="bs-example form-horizontal" modelAttribute="ticketAssignment"
			action="ticketAssignment">
			<fieldset>

				<legend>Ticket Assignment</legend>
				<div class="form-group">
					<label for="inputEmail" class="col-lg-2 control-label">Title</label>
					<div class="col-lg-10">

						<input type="text" class="form-control" id="txtTicketTitle"
							value="${ticket.subject}" path="ticket_id">
					</div>
				</div>

				<div class="form-group">
					<label for="inputDate" class="col-lg-2 control-label">Date</label>
					<div class="col-lg-10">
						<input type="text" class="form-control" id="txtDate"
							value="${ticket.date}" path="date">
					</div>
				</div>

				<!-- Select Priority -->
				<div class="form-group">
					<label for="select" class="col-lg-2 control-label">Priority</label>
					<div class="col-lg-10">

						<select path="priority" class="form-control" id="priority">
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
					<label for="select" class="col-lg-2 control-label">Staff</label>
					<div class="col-lg-10">

						<select path="staff_id" class="form-control" id="staff_id">
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
							value="${ticket.comment}" path="comment"/>
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



