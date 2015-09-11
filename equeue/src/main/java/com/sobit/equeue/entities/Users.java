package com.sobit.equeue.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class Users {
	 @Id
     @GeneratedValue
     @Column(name="id")
     int id;

     @Column(name="login")
     String login;

     @Column(name="password")
     String password;

     @Column(name="token")
     String token;

     @Column(name="surname")
     String surname;
     
     @Column(name="name")
     String name;
     
     @Column(name="father_name")
     String father_name;
    
     @Column(name="user_role")
     int user_role;
     
     @Column(name="ufilial")
     int ufilial;
    
     @Column(name="upodr")
     int upodr;
  
     public Users(){
         id=0;
     }
      
     public Users(int id, String login, String password, String token, String surname,String name,String father_name,int user_role,int ufilial,int upodr){
         this.id = id;
         this.login = login;
         this.password = password;
         this.token = token;
         this.surname = surname;
         this.name = name;
         this.father_name = father_name;
         this.user_role = user_role;
         this.ufilial = ufilial;
         this.upodr = upodr;
         
     }    
 
  public int getid() {
         return id;
  }

  public void setid(int id) {
         this.id = id;
  }
        
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }
   
    public Integer getUser_Role() {
        return user_role;
    }

    public void setUser_Role(Integer user_role) {
        this.user_role = user_role;
    }
    
    public Integer getUfilial() {
        return ufilial;
    }

    public void setUfilial(Integer ufilial) {
        this.ufilial = ufilial;
    }
    
    public Integer getUpodr() {
        return upodr;
    }

    public void setUpodr(Integer upodr) {
        this.upodr = upodr;
    }
   

       
}
