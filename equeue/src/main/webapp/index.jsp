<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>  
    <title>Пользователи</title>  
     <style>
      .pole.ng-valid {
          background-color: lightgreen;
      }
      .pole.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .pole.ng-dirty.ng-invalid-minlength {
          background-color: yellow;
      }
 
    </style>
    
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
     <link href="<c:url value='/js/css/app.css' />" rel="stylesheet"></link>
 
 
  </head>
  <body ng-app="myApp" class="ng-cloak">
      <div class="generic-container" ng-controller="UserController as ctrl">
        <div class="panel panel-default">
              <div class="panel-heading"><span class="lead">Форма регистрации/обновления</span></div>
              <div class="formcontainer">
                  <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
                      <input type="hidden" ng-model="ctrl.user.id" />
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Логин:</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.user.login" name="ulogin" class="login form-control input-sm" placeholder="Укажите логин" required ng-minlength="3"/>
                                  <div class="has-error" ng-show="myForm.$dirty">
                                      <span ng-show="myForm.ulogin.$error.required">????</span>
                                      <span ng-show="myForm.ulogin.$error.minlength">Меньше 3 знаков</span>
                                      <span ng-show="myForm.ulogin.$invalid">Некорректное поле </span>
                                  </div>
                              </div>
                          </div>
                      </div>
                         
                       
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Пароль</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.user.password" name="upassword" class="login form-control input-sm" placeholder="Укажите пароль" required ng-minlength="3""/>
                            		 <div class="has-error" ng-show="myForm.$dirty">
                                      <span ng-show="myForm.upassword.$error.required">Обязательное для заполнения</span>
                                      <span ng-show="myForm.upassword.$error.minlength">Меньше 3 знаков</span>
                                      <span ng-show="myForm.upassword.$invalid">Некорректное поле </span>
                                  </div>
                             
                              </div>
                          </div>
                      </div>
 
                       <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Признак</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.user.token" class="form-control input-sm" placeholder="Укажите признак(поле может быть пустым)"/>
                              </div>
                          </div>
                      </div>
 					
 						<div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Фамилия</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.user.surname" class="form-control input-sm" placeholder="Укажите фамилию(поле может быть пустым)"/>
                              </div>
                          </div>
                      </div>
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Имя</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.user.name" class="form-control input-sm" placeholder="Укажите имя(поле может быть пустым)"/>
                              </div>
                          </div>
                      </div>
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Отчество</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.user.farther_name" class="form-control input-sm" placeholder="Укажите отчество(поле может быть пустым)"/>
                              </div>
                          </div>
                      </div>
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Роль</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.user.user_role" class="form-control input-sm" placeholder="Укажите роль(поле может быть пустым)"/>
                              </div>
                          </div>
                      </div>
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Филиал</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.user.ufilial" class="form-control input-sm" placeholder="Укажите филиал(поле может быть пустым)"/>
                              </div>
                          </div>
                      </div>
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Подразделение</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.user.upodr" class="form-control input-sm" placeholder="Укажите подразделение(поле может быть пустым)"/>
                              </div>
                          </div>
                      </div>
                      <div class="row">
                          <div class="form-actions floatRight">
                              <input type="submit"  value="{{!ctrl.user.id ? 'Добавить' : 'Обновить'}}" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid">
                              <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Очистить</button>
                          </div>
                      </div>
                  </form>
              </div>
          </div>  
          
          
          
          
          <div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">Список пользователей </span></div>
              <div class="tablecontainer">
                  <table class="table table-hover">
                      <thead>
                          <tr>
                              <th>ИД</th>
                              <th>Логин</th>
                              <th>Пароль</th>
                              <th>Признак</th>
                              <th>ФИО</th>
                              <th>Роль</th>
                              <th>Филиал</th>
                              <th>Подразделение</th>
                              <th width="20%"></th>
                          </tr>
                      </thead>
                      <tbody>
                          <tr ng-repeat="u in ctrl.users">
                              <td><span ng-bind="u.id"></span></td>
                              <td><span ng-bind="u.login"></span></td>
                              <td><span ng-bind="u.password"></span></td>
                              <td><span ng-bind="u.surname"></span></td>
                              <td><span ng-bind="u.user_role"></span></td>
                              <td><span ng-bind="u.ufilial"></span></td>
                              <td><span ng-bind="u.upodr"></span></td>
                              <td>
                              <button type="button" ng-click="ctrl.edit(u.id)" class="btn btn-success custom-width">Изменить</button>  <button type="button" ng-click="ctrl.remove(u.id)" class="btn btn-danger custom-width">Удалить</button>
                              </td>
                          </tr>
                      </tbody>
                  </table>
              </div>
          </div>
      </div>
   <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
      <script src="<c:url value='/js/app.js' />"></script>
      <script src="<c:url value='/js/services.js' />"></script>
      <script src="<c:url value='/js/controllers.js' />"></script>    
     
  </body>
</html>