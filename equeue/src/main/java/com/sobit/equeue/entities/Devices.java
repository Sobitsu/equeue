package com.sobit.equeue.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="devices")

public class Devices {
	 @Id
     @GeneratedValue
     @Column(name="id")
     int id;

     @Column(name="kod")
     String kod;
     
     @Column(name="name")
     String name;
     
     @Column(name="address")
     String address;
     
     @Column(name="coment")
     String coment;
  
     public Devices(){
         id=0;
     }
      
     public Devices(int id, String kod, String name, String address, String coment){
    	 this.id= id;
         this.kod = kod;
         this.name = name;
         this.address = address;
         this.coment = coment;
     }    
 
  public int getid() {
         return id;
  }

  public void setid(int id) {
         this.id = id;
  }
        
    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    } 
    
    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    } 
}