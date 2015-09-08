<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" ng-app="restAngular">
 
<head>
 
 <meta charset="utf-8">
 
 <title>Users</title>

  <!-- Downloaded Scripts -->

 <script src="/resources/js/angular.min.js"></script>
 
 <script src="/resources/js/angular-route.min.js"></script>
 
 <script src="/resources/js/angular-resource.min.js"></script> 
 
 <script src="/resources/js/bootstrap.min.js"></script>
 
   <!-- Created Scripts -->
 
 <script src="/resources/js/app.js"></script>
 
 <script src="/resources/js/controllers.js"></script>
 
 <script src="/resources/js/services.js"></script> 
 
</head>
 
<body>
<div align="center">
 
<div style="width:300px;" >
 
 <div ng-view>
 
 </div>
 
</div>
 
</div>
 
</body>
 
</html>