Var restAngular = angular.module('restAngular',['ngRoute','raControllers','raServices']);
 
  
 
restAngular.config(['$routeProvider',
 
 function($routeProvider) {
 
   $routeProvider.
 
     when('/userall', {
 
       templateUrl: 'users-list.jsp',
 
       controller: 'UsersListController'
 
     }).
 
        when('/user/:id', {
 
       templateUrl: 'users-details.jsp',
 
       controller: 'UsersDetailsController'
 
     }).
 
     otherwise({
 
       redirectTo: '/users'
 
     });
 
 }]);