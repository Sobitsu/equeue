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

     @Column(name="code")
     String code;
     
     @Column(name="podrazdel")
     Integer podrazdel;
     
     @Column(name="deviceType")
     Integer deviceType;
     
     @Column(name="state")
     Boolean state;
  
     public Devices(){
         id=0;
     }
      
     public Devices(int id, String code, Integer podrazdel, Integer deviceType, Boolean state){
    	 this.id= id;
         this.code = code;
         this.podrazdel = podrazdel;
         this.deviceType = deviceType;
         this.state = state;
     }    
 
  public int getid() {
         return id;
  }

  public void setid(int id) {
         this.id = id;
  }
        
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public Integer getPodrazdel() {
        return podrazdel;
    }

    public void setPodrazdel(Integer podrazdel) {
        this.podrazdel = podrazdel;
    }   
    
    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    } 
    
    public Boolean isState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    } 
}