'use strict';

App.factory('UserService', ['$http', '$q', function($http, $q){

	return {
		
			fetchAllUsers: function() {
					return $http.get('http://localhost:8080/equeue/service/userall')
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while fetching users');
										return $q.reject(errResponse);
									}
							);
			},
		    
		    createUser: function(user){
					return $http.post('http://localhost:8080/equeue/service/user/', user)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Ошибка при добавлении записи');
										return $q.reject(errResponse);
									}
							);
		    },
		    
		    updateUser: function(user, id){
		    			return $http.put('http://localhost:8080/equeue/service/user/'+id, user)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Ошибка при обновлении записи');
										return $q.reject(errResponse);
									}
							);
			},
		    
			
		
	};

}]);
