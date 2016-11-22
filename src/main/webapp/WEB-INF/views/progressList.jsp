
<title>Progress List</title>
</head>
<body>
	<%@include file="/WEB-INF/views/Header.jsp"%>


	<div class="row col-md-8 col-md-offset-2">
		<br> <a href="newTicket" class="btn btn-primary btn-xs pull-left"><b><span
				class="glyphicon glyphicon-plus"></span></b> Create New Ticket</a><br>
		<h4 class="form-header">List of your Ticket Progress</h4>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>No</th>
					<th>Subject</th>
					<th>Date</th>
					<th>Status</th>
				</tr>
			</thead>

			<c:if test="${empty tickets}">
				<tr>
					<td colspan="8">No ticket to Display</td>
				</tr>
			</c:if>
			<c:if test="${not empty tickets}">

				<c:forEach items="${tickets}" var="ticket">
					<tr class="">
						<td>${ticket.id}</td>
						<td>${ticket.subject}</td>
						<td>${ticket.date}</td>
						<td>${ticket.priority}</td>
						<td><a class='btn btn-info btn-xs'
							href="editTicket?id=${ticket.id}"> <span
								class="glyphicon glyphicon-edit"></span> Edit
						</a> <a class='btn btn-success btn-xs'
							href="ticketAssignment=${ticket.id}"> <span
								class="glyphicon glyphicon-edit"></span> Assign Ticket
						</a> <a class='btn btn-success btn-xs'
							href="ticketProgress=${ticket.id}"> <span
								class="glyphicon glyphicon-edit"></span> Update Progress
						</a> <a href="deleteTicket?id=${ticket.id}"
							class="btn btn-danger btn-xs"> <span
								class="glyphicon glyphicon-remove"></span> Delete
						</a></td>

					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>

	<%@include file="/WEB-INF/views/Footer.jsp"%>