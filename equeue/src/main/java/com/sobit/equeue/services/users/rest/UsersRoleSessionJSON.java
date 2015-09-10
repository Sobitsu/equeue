package com.sobit.equeue.services.users.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sobit.equeue.entities.UsersRole;
import com.sobit.equeue.services.dao.data.users.UsersRoleDAO;

@RestController

@RequestMapping("/userrole")
public class UsersRoleSessionJSON {
	private UsersRoleDAO usersroledao = new UsersRoleDAO();
	
	@RequestMapping(value = "/usersroleall ", method = RequestMethod.GET)
	public ResponseEntity<List<UsersRole>> listAllUsersRole(){
		List<UsersRole> ur = usersroledao.getUsersRole();
		if(ur.isEmpty()){
			return new ResponseEntity<List<UsersRole>>(HttpStatus.NO_CONTENT);
			}
		return new ResponseEntity<List<UsersRole>>(ur,HttpStatus.OK);
		}
	
	
}
