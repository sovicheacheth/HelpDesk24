
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" />
<link href="datepicker/css/datepicker.css" rel="stylesheet" />
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of staffs </title>
</head>
<body>
<%@include file="/WEB-INF/views/Header.jsp"%>


<div class="row col-md-8 col-md-offset-2">
   <br>
             <a href="register" class="btn btn-primary btn-xs pull-left"><b><span class="glyphicon glyphicon-plus"></span></b> Create New staff</a><br>
<h4 class="form-header">List of staffs</h4>
<table class="table table-striped">
  <thead>
    <tr>
      <th>No</th>
      <th>first name</th>
      <th> last name</th>
      <th>position</th>
       <th>email</th>
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
          <td>
                         <a class='btn btn-info btn-xs' href="editPage?username=${staff.id}">
                         <span class="glyphicon glyphicon-edit"></span> Edit</a>
                          <a href="deleteUser?username=${staff.id}" class="btn btn-danger btn-xs">
                          <span class="glyphicon glyphicon-remove"></span> Delete</a>
                        </td>

 </tr>
  </c:forEach> 
  </c:if>
  </table>        
        </div>
        
      <%@include file="/WEB-INF/views/Footer.jsp"%>
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      