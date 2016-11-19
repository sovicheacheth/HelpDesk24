<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Brand</a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
      </ul>
    </div>
  </div>
</nav>




<!--  
	<li><a href="<spring:url value='/home'/>"><spring:message code="navi.home" text="Home" /></a></li>
	<li><a href="<spring:url value='/tender/all'/>"><spring:message code="navi.tenders" text="Tenders" /></a></li>
	
	<sec:authorize access="isAnonymous()">
		<li><a href="<spring:url value='/subscribe'/>"><spring:message code="navi.subscribe" text="Subscribe" /></a></li>
	</sec:authorize>
	
	<sec:authorize access="hasAnyRole('ROLE_ORGANIZATION', 'ROLE_EMPLOYEE', 'ROLE_ADMIN')">
		<li><a href="<spring:url value='/tender/new'/>"><spring:message code="navi.newTender" text="New Tender" /></a></li>
	</sec:authorize>

	<sec:authorize access="hasAnyRole('ROLE_ANONYMOUS', 'ROLE_ORGANIZATION', 'ROLE_MEMBER')">
		<li><a href="<spring:url value='/contact'/>"><spring:message code="navi.contactUs" text="Contact Us" /></a></li>
	</sec:authorize>
	
	<sec:authorize access="hasRole('ROLE_ADMIN')">
		<li><a href="<spring:url value='/member/all'/>"><spring:message code="navi.manageMember" text="Manage Member" /></a></li>
		<li><a href="<spring:url value='/category/all'/>"><spring:message code="navi.manageCategory" text="Manage Category" /></a></li>
	</sec:authorize>

	<li id="naviLogin">
		<sec:authorize access="isAnonymous()">
			<a href="<spring:url value='/loginPage'/>"><spring:message code="navi.login" text="Login" /></a>
		</sec:authorize>
		<sec:authorize access="isAuthenticated()">
			<a href="<spring:url value='/doLogout'/>"><spring:message code="navi.logout" text="Logout" /></a>
		</sec:authorize>
	</li>
</ul>
-->
