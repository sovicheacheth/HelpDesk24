<%@ include file="Header.jsp"%>

<title>Ticket Progress</title>


<body>
	<script src="jquery-1.8.3.js">
		
	</script>

	<script src="bootstrap/js/bootstrap.js">
		
	</script>


	<div class="container">
		<div class="jumbotron">
			<form class="form-horizontal">
				<fieldset>
					<legend>Ticket Progress</legend>
					<div class="form-group">
						<label for="inputEmail" class="col-lg-2 control-label">Title</label>
						<div class="col-lg-10">
							<input type="text" class="form-control" id="txtTicketTitle">
						</div>
					</div>

					<div class="form-group">
						<label for="inputEmail" class="col-lg-2 control-label">Date</label>
						<div class="col-lg-10">
							<div class="input-group date" data-provide="datepicker">
								<input type="text" class="form-control">

							</div>
						</div>
					</div>

					<!-- Select Priority -->
					<div class="form-group">
						<label for="select" class="col-lg-2 control-label">Status</label>
						<div class="col-lg-10">
							<select class="form-control" id="priorityLst" name="priorityLst">
								<option>New</option>
								<option>In-Progress</option>
								<option>Cancel</option>
								<option>Completed</option>
								<option>Closed</option>
							</select>
						</div>
					</div>


					<div class="form-group">
						<label for="textArea" class="col-lg-2 control-label">Note</label>
						<div class="col-lg-10">
							<textarea class="form-control" rows="3" id="txtNote"></textarea>
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


</body>
</html>