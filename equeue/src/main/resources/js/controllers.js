'use strict';

App.controller('UserController', ['$scope', 'UserService', function($scope, UserService) {
          var self = this;
          self.users= {id:null,login:'',password:'',token:null,surname:null,name:null,father_name:null,ufilial:null,upodr:null,user_Role:null};
          self.userss=[];
              
          self.fetchAllUsers = function(){
              UserService.fetchAllUsers()
                  .then(
      					       function(d) {
      						        self.userss = d;
      					       },
            					function(errResponse){
            						console.error('Ошибка при выборе');
            					}
      			       );
          };
           
          self.createUser = function(users){
              UserService.createUser(users)
		              .then(
                      self.fetchAllUsers, 
				              function(errResponse){
					               console.error('Ошибка при добавлении');
				              }	
                  );
          };

         self.updateUser = function(users, id){
              UserService.updateUser(users, id)
		              .then(
				              self.fetchAllUsers, 
				              function(errResponse){
					               console.error('Ошибка при изменении');
				              }	
                  );
          };

         self.deleteUser = function(id){
              UserService.deleteUser(id)
		              .then(
				              self.fetchAllUsers, 
				              function(errResponse){
					               console.error('Ошибка при удалении');
				              }	
                  );
          };

          self.fetchAllUsers();

          self.submit = function() {
              if(self.users.id==null){
                  console.log('Сохранить', self.users);    
                  self.createUser(self.user);
              }else{
                  self.updateUser(self.users, self.users.id);
                  console.log('Обновить по ид', self.users.id);
              }
              self.reset();
          };
              
          self.edit = function(id){
              console.log('ИД изменен', id);
              for(var i = 0; i < self.userss.length; i++){
                  if(self.userss[i].id == id) {
                     self.users = angular.copy(self.userss[i]);
                     break;
                  }
              }
          };
              
          self.remove = function(id){
              console.log('ид удален', id);
              for(var i = 0; i < self.userss.length; i++){
                  if(self.userss[i].id == id) {
                     self.reset();
                     break;
                  }
              }
              self.deleteUser(id);
          };

          
          self.reset = function(){
              self.users={id:null,login:'',password:'',token:null,surname:null,name:null,father_name:null,ufilial:null,upodr:null,user_Role:null};;
              $scope.myForm.$setPristine(); //reset Form
          };

      }]);
