package com.sobit.equeue.services.users.rest;
import java.util.List;
import javax.servlet.http.HttpServletRequest;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import com.sobit.equeue.services.dao.data.users.UsersDAO;
import com.sobit.equeue.entities.Users;
 
@RestController


@RequestMapping("/service")
public class UsersServiceJSON {
	
	 private UsersDAO usersdao=new UsersDAO();
    
	 
	 @RequestMapping(value = "/userall", method = RequestMethod.GET)
	    public ResponseEntity<List<Users>> listAllUsers() {
	        List<Users> users = usersdao.getUsers();
	        if(users.isEmpty()){
	            return new ResponseEntity<List<Users>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
	    }
	     
     
    @RequestMapping(value="/user", method=RequestMethod.GET)
    public Users users(HttpServletRequest request) {
        if(request.getParameter("id")!=null)
        {
        return usersdao.getUsers(Integer.parseInt(request.getParameter("id")));
        }
        return null;
    }
}