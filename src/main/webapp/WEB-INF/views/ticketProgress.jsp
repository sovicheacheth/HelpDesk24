<%@ include file="Header.jsp"%>

<title>Ticket Progress</title>

<div class="container">
	<div class="jumbotron">
		<form class="form-horizontal">
			<fieldset>
				<legend>Ticket Progress</legend>

				<input type="hidden" name="id" value="${ticket.id}">

				<div class="form-group">
					<label for="inputEmail" class="col-lg-2 control-label">Title</label>
					<div class="col-lg-10">
						<input type="text" class="form-control" id="txtTicketTitle"
							value="${ticket.subject}">
					</div>
				</div>

				<div class="form-group">
					<label for="inputEmail" class="col-lg-2 control-label">Date</label>
					<div class="col-lg-10">
						<div class="input-group date" data-provide="datepicker">
							<input type="text" class="form-control" value="${ticket.date}">

						</div>
					</div>
				</div>

				<!-- Select Priority -->
				<div class="form-group">
					<label for="select" class="col-lg-2 control-label">Status</label>
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


				<div class="form-group">
					<label for="textArea" class="col-lg-2 control-label">Note</label>
					<div class="col-lg-10">
						<textarea class="form-control" rows="3" id="txtNote"
							value="${ticket.comment}"></textarea>
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-10 col-lg-offset-2">
						<button type="reset" class="btn btn-default">Cancel</button>
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</div>
			</fieldset>
		</form>
	</div>

	<div></div>
</div>

<%@include file="/WEB-INF/views/Footer.jsp"%>


</body>
</html>