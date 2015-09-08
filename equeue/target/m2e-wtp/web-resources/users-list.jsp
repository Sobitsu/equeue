<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<input placeholder="search users" class="form-control" ng-model="query">
<div align="left">
<div class="list-group" >
<a href="#/users/{{users.id}}" class="list-group-item" ng-repeat="users in users | filter:query">
{{users.user}}
</a>
HELLO!
</div>
</div>