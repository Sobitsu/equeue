package com.sobit.equeue.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user_role")
public class UsersRole {
	@Id
	@GeneratedValue
	@Column(name="Id")
	int id;
	
	@Column(name="authority")
	String authority;
	
	public UsersRole(){
		id=0;
	}
	public UsersRole(int id, String authority, String name) {
		super();
		this.id = id;
		this.authority = authority;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="name")
	String name;
	
}
