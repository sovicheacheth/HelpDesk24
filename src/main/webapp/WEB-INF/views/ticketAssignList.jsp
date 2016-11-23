
<title>List of Tickets</title>
</head>
<body>
	<%@include file="/WEB-INF/views/Header.jsp"%>


	<div class="row col-md-8 col-md-offset-2">
		<h4 class="form-header">List of your Assignment Ticket</h4>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>No</th>
					<th>Date</th>
					<th>Priority</th>
					<th>Assigned Staff</th>
				</tr>
			</thead>

			<c:if test="${empty ticketassignment}">
				<tr>
					<td colspan="8">No ticket assignment to Display</td>
				</tr>
			</c:if>
			<c:if test="${not empty ticketassignment}">

				<c:forEach items="${ticketassignment}" var="ticket">
					<tr class="">
						<td>${ticket.id}</td>
						<td>${ticket.date}</td>
						<td>${ticket.priority}</td>
						<td>${ticket.staff_id}</td>

					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>

	<%@include file="/WEB-INF/views/Footer.jsp"%>