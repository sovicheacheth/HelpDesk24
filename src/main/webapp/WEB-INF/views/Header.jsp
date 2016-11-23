<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="bootstrap/css/bootstrap.css" rel="stylesheet" />
<link href="datepicker/css/datepicker.css" rel="stylesheet" />
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />


<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	/* additional style for effect only */
	text-align: center;
	background-color: #333;
	color: #fff;
}

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
</head>
<body>

	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<button class="navbar-toggle collapsed" type="button"
				data-target="#bs-example-navbar-collapse-1" data-toggle="collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="/HelpDesk24/Home">IT-HelpDesk24</a>
		</div>

		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">




				<li><sec:authorize access="hasAnyRole('ROLE_STAFF')">
						<a href="<c:url value="/newTicket" />">New Ticket</a>
					</sec:authorize></li>

				<li><sec:authorize access="hasAnyRole('ROLE_TECH')">
						<a href="<c:url value="/AssignedTicket" />"> Assigned Tickets</a>
					</sec:authorize></li>

				<li><sec:authorize access="hasAnyRole('ROLE_ADMIN')">
						<a href="<c:url value="/topic" />">New Topic</a>
					</sec:authorize></li>


				<li><sec:authorize access="hasAnyRole('ROLE_ADMIN')">
						<a href="<c:url value="/ticketList" />">Ticket List</a>
					</sec:authorize></li>


				<li><sec:authorize access="hasAnyRole('ROLE_ADMIN')">
						<a href="<c:url value="/staffList" />">Staff List</a>
					</sec:authorize></li>

				<li><sec:authorize access="hasAnyRole('ROLE_ADMIN')">
						<a href="<c:url value="/assignList" />">Assign List</a>
					</sec:authorize></li>

				<li><sec:authorize access="hasAnyRole('ROLE_TECH')">
						<a href="<c:url value="/progressList" />">Progress List</a>
					</sec:authorize></li>




			</ul>

			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Welcome, User</a></li>
				<li><a href="/HelpDesk24/">Log out</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<!-- /.nav-collapse -->