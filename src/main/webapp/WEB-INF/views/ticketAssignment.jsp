<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="assets/css/bootstrap-united.css" rel="stylesheet" />



<style>
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

<title>Ticket Assignment</title>
</head>
<body>
	<script src="jquery-1.8.3.js">
		
	</script>

	<script src="bootstrap/js/bootstrap.js"></script>
	<script src="datepicker/js/bootstrap-datepicker.js"></script>
	<script type="text/javascript">
		$(".form_datetime").datetimepicker({
			format : "dd MM yyyy - hh:ii"
		});
	</script>



	<div class="container">
		<div class="jumbotron">
			<form class="form-horizontal">
				<fieldset>
					<legend>Ticket Assignment</legend>
					<div class="form-group">
						<label for="inputEmail" class="col-lg-2 control-label">Title</label>
						<div class="col-lg-10">
							<input type="text" class="form-control" id="txtTicketTitle">
						</div>
					</div>

					<div class="form-group">
						<label for="inputDate" class="col-lg-2 control-label">Date</label>
						<div class="col-lg-10">
							<div class="input-group date" data-provide="datepicker">
								<input type="text" class="form-control">

							</div>
						</div>
					</div>

					<!-- Select Priority -->
					<div class="form-group">
						<label for="select" class="col-lg-2 control-label">Priority</label>
						<div class="col-lg-10">
							<select class="form-control" id="priorityLst" name="priorityLst">

							</select>
						</div>
					</div>

					<!-- Assign to staff -->
					<div class="form-group">
						<label for="select" class="col-lg-2 control-label">Staff</label>
						<div class="col-lg-10">
							<select class="form-control" id="priorityLst" name="priorityLst">
								<option>Sovichea</option>
								<option>Mahilet</option>
								<option>Kedir</option>
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