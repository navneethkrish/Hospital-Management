<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Admin page</title>
</head>
<body>
  <jsp:include page="header.jsp"/>
     <div id="wrapper">
        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand highlight">
                    <a href="index">
                        Home
                    </a>
                </li>
                <li>
             <a href="createUser">Create User </a> 
                </li>
                <li>
              <a href="createPhysician">Add Physician</a> 
                </li>
                <li>
	           <a href="displayPhysicians">Display Physician</a>
                </li>
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->
        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                      Dear <strong>${sessionScope.email}</strong>, Welcome to Admin Page.
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->
    </div>
    <jsp:include page="footer.jsp"/>
</body>
</html>
