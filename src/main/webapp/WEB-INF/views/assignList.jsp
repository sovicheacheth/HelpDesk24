
<title>List of Assign Ticket</title>
</head>
<body>
	<%@include file="/WEB-INF/views/Header.jsp"%>


	<div class="row col-md-8 col-md-offset-2">
		<br> <a href="newTicket" class="btn btn-primary btn-xs pull-left"><b><span
				class="glyphicon glyphicon-plus"></span></b> Create New Ticket</a><br>
		<h4 class="form-header">List of your assign ticket</h4>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>No</th>
					<th>Date</th>
					<th>Ticket ID</th>
					<th>Staff ID</th>
					<th>Priority</th>
				</tr>
			</thead>

			<c:if test="${empty assigns}">
				<tr>
					<td colspan="8">No assignment to display</td>
				</tr>
			</c:if>
			<c:if test="${not empty assigns}">

				<c:forEach items="${assigns}" var="assigns">
					<tr class="">
						<td>${assigns.id}</td>
						<td>${assigns.date}</td>

						<td>${assigns.staff_id}</td>
						<td>${assigns.ticket_id}</td>
						<td>${assigns.priority}</td>

						<td><a class='btn btn-info btn-xs'
							href="editTicket?id=${assigns.id}"> <span
								class="glyphicon glyphicon-edit"></span> Edit
						</a> <a class='btn btn-success btn-xs'
							href="ticketAssignment=${assigns.id}"> <span
								class="glyphicon glyphicon-edit"></span> Assign Ticket
						</a> <a class='btn btn-success btn-xs'
							href="ticketProgress=${assigns.id}"> <span
								class="glyphicon glyphicon-edit"></span> Update Progress
						</a> <a href="deleteTicket?id=${assigns.id}"
							class="btn btn-danger btn-xs"> <span
								class="glyphicon glyphicon-remove"></span> Delete
						</a></td>

					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>

	<%@include file="/WEB-INF/views/Footer.jsp"%>