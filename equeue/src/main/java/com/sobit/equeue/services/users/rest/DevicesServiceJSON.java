package com.sobit.equeue.services.users.rest;
import java.util.List;
import javax.servlet.http.HttpServletRequest;


//import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import com.sobit.equeue.services.dao.data.users.DevicesDAO;
import com.sobit.equeue.entities.Devices;
 
@RestController


@RequestMapping("/service")
public class DevicesServiceJSON {
	
	 private DevicesDAO devicesdao=new DevicesDAO();
    
	 
	 @RequestMapping(value = "/deviceall", method = RequestMethod.GET)
	    public ResponseEntity<List<Devices>> listAllDevices() {
	        List<Devices> devices = devicesdao.getDevices();
	        if(devices.isEmpty()){
	            return new ResponseEntity<List<Devices>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<Devices>>(devices, HttpStatus.OK);
	    }
	     
     
    @RequestMapping(value="/device", method=RequestMethod.GET)
    public Devices devices(HttpServletRequest request) {
        if(request.getParameter("id")!=null)
        {
        return devicesdao.getDevices(Integer.parseInt(request.getParameter("id")));
        }
        return null;
    }
}