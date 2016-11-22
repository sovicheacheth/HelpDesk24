
<title>List of Staffs</title>
</head>
<body>
	<%@include file="/WEB-INF/views/Header.jsp"%>


	<div class="row col-md-8 col-md-offset-2">
		<br> <a href="register" class="btn btn-primary btn-xs pull-left"><b><span
				class="glyphicon glyphicon-plus"></span></b> Create New staff</a><br>
		<h4 class="form-header">List of staffs</h4>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>No</th>
					<th>First name</th>
					<th>Last name</th>
					<th>Position</th>
					<th>Email</th>

				</tr>
			</thead>

			<c:if test="${empty staffs}">
				<tr>
					<td colspan="8">No staff to Display</td>
				</tr>
			</c:if>
			<c:if test="${not empty staffs}">

				<c:forEach items="${staffs}" var="staff">
					<tr class="">
						<td>${staff.id}</td>
						<td>${staff.firstname}</td>
						<td>${staff.lastname}</td>
						<td>${staff.position}</td>
						<td>${staff.email}</td>

						<td><a class='btn btn-info btn-xs'
							href="editStaff?id=${staff.id}"> <span
								class="glyphicon glyphicon-edit"></span> Edit
						</a> <a href="deleteStaff?id=${staff.id}"
							class="btn btn-danger btn-xs"> <span
								class="glyphicon glyphicon-remove"></span> Delete
						</a></td>

					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>

	<%@include file="/WEB-INF/views/Footer.jsp"%>