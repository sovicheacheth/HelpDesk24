<%@ include file="Header.jsp"%>

<title>Ticket Progress</title>

<div class="container">
	<div class="jumbotron">
		<form:form id="myform" method="POST"
			class="bs-example form-horizontal" modelAttribute="ticketProgress"
			action="ticketProgress">
			<fieldset>
				<legend>Ticket Progress</legend>

				<input type="hidden" name="id" value="${ticket.id}">

				<div class="form-group">
					<label for="inputEmail" class="col-lg-2 control-label">Subject</label>
					<div class="col-lg-10">
						<input type="text" class="form-control" id="txtTicketTitle"
							value="${ticket.subject}">
					</div>
				</div>

				<!--  Date  -->
				<div class="form-group">
					<label for="inputEmail" class="col-lg-2 control-label">Date</label>
					<div class="col-lg-10">
						<div class="input-group date" data-provide="datepicker">
							<input type="text" class="form-control" value="${ticket.date}">

						</div>
					</div>
				</div>

				<!-- Select Status -->
				<div class="form-group">
					<label class="col-lg-2 control-label" for="status">Select Status</label>
					<div class="col-lg-10">
						<form:select path="status" class="form-control">
							<option>New</option>
							<option>In-progress</option>
							<option>Cancel</option>
							<option>Completed</option>
							<option>Closed</option>
						</form:select>
					</div>
				</div>


				<div class="form-group">
					<label class="col-lg-2 control-label" for="note">Note</label>
					<div class="col-lg-10">
						<form:textarea path="note" class="form-control" rows="3" placeholder="Enter your note"/>
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-10 col-lg-offset-2">
						<button type="reset" class="btn btn-default">Cancel</button>
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</div>
			</fieldset>
		</form:form>
	</div>

	<div></div>
</div>

<%@include file="/WEB-INF/views/Footer.jsp"%>


</body>
</html>