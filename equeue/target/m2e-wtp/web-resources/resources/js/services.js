var raServices=angular.module('raServices',['ngResource']);
 
  
 
raServices.factory('UsersService', ['$resource',
 
 function($resource){
 
         
 
   return $resource('http://localhost:8080/equeue/service/:call', {}, {
 
    usersall: {method:'GET',params:{call:'userall'},isArray:true},
 
        user:{method:'GET',params:{call:'user'},isArray:false}
 
   });
 
 }]);