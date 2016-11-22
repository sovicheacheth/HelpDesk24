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
<title>List of Tickets </title>
</head>
<body>
<%@include file="/WEB-INF/views/Header.jsp"%>


<div class="row col-md-8 col-md-offset-2">
   <br>
             <a href="topic" class="btn btn-primary btn-xs pull-left"><b><span class="glyphicon glyphicon-plus"></span></b> Create New Topic</a><br>
<h4 class="form-header">List of your Topics</h4>
<table class="table table-striped">
  <thead>
    <tr>
      <th>No</th>
      <th>Title</th>
      
    </tr>
  </thead>
  
    <c:if test="${empty topics}">
      <tr>
        <td colspan="8">No topic to Display</td>
      </tr>
    </c:if>
    <c:if test="${not empty topics}">

      <c:forEach items="${topics}" var="topics">
        <tr class="">
          <td>${topics.id}</td>
          <td>${topics.title}</td>
          
          <td>
                         <a class='btn btn-info btn-xs' href="editTopic?id=${topics.id}">
                         <span class="glyphicon glyphicon-edit"></span> Edit</a>
                         
                          <a href="deleteTopic?id=${topics.id}" class="btn btn-danger btn-xs">
                          <span class="glyphicon glyphicon-remove"></span> Delete</a>
                        </td>

 </tr>
  </c:forEach> 
  </c:if>
  </table>        
        </div>
        
      <%@include file="/WEB-INF/views/Footer.jsp"%>