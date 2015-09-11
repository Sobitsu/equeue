package com.sobit.equeue.services.users.rest;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder; 
import com.sobit.equeue.services.dao.data.users.UserService;
import com.sobit.equeue.entities.Users;
 
@RestController


@RequestMapping("/service")
public class UsersServiceJSON {
	
	 @Autowired
	  UserService  userService;
	
	 @RequestMapping(value = "/userall", method = RequestMethod.GET)
	    public ResponseEntity<List<Users>> listAllUsers() {
	        List<Users> users = userService.getUsers();
	        if(users.isEmpty()){
	            return new ResponseEntity<List<Users>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
	    }
	
	//-------------------����� ����� ������--------------------------------------------------------
     
	    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Users> getUsers(HttpServletRequest request) 
	    	{
	            if(request.getParameter("id")!=null)
	            {
	            return new ResponseEntity<Users>(userService.getUsers(Integer.parseInt(request.getParameter("id"))), HttpStatus.OK);
	            }
	            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
	        }
	  //-------------------�������� ������--------------------------------------------------------
	     
	    @RequestMapping(value = "/user/", method = RequestMethod.POST)
	    public ResponseEntity<Void> createUsers(@RequestBody Users user,    UriComponentsBuilder ucBuilder) {
	        System.out.println("������� ������������ " + user.getLogin());
	 
	        if (userService.isUserExist(user)) {
	            System.out.println("������������ � ������� " + user.getLogin() + " ��� ����������");
	            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	        }
	 
	        userService.saveUser(user);
	 
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/user?id=").buildAndExpand(user.getid()).toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }
	 
	    
	     
	    //------------------- �������� ������ --------------------------------------------------------
	     
	    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	    public ResponseEntity<Users> updateUser(@PathVariable("id") int id, @RequestBody Users user) {
	        System.out.println("�������� ������" + id);
	         
	        Users currentUser = userService.findById(id);
	         
	        if (currentUser==null) {
	            System.out.println("������  " + id + " �� �������");
	            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
	        }
	 
	        currentUser.setLogin(user.getLogin());
	        currentUser.setPassword(user.getPassword());
	        currentUser.setToken(user.getToken());
	        currentUser.setSurname(user.getSurname());
	        currentUser.setName(user.getName());
	        currentUser.setFather_name(user.getFather_name());
	        currentUser.setUser_Role(user.getUser_Role());
	        currentUser.setUfilial(user.getUfilial());
	        currentUser.setUpodr(user.getUpodr());
	         
	        userService.updateUser(currentUser);
	        return new ResponseEntity<Users>(currentUser, HttpStatus.OK);
	    }
	       	 

}