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
 
import com.sobit.equeue.services.dao.data.users.FilialDAO;
import com.sobit.equeue.entities.Filial;
 
@RestController


@RequestMapping("/service")
public class FilialServiceJSON {
	
	 private FilialDAO filialdao=new FilialDAO();
    
	 
	 @RequestMapping(value = "/filialall", method = RequestMethod.GET)
	    public ResponseEntity<List<Filial>> listAllFilial() {
	        List<Filial> filial = filialdao.getFilial();
	        if(filial.isEmpty()){
	            return new ResponseEntity<List<Filial>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<Filial>>(filial, HttpStatus.OK);
	    }
	     
     
    @RequestMapping(value="/filial", method=RequestMethod.GET)
    public Filial filial(HttpServletRequest request) {
        if(request.getParameter("id")!=null)
        {
        return filialdao.getFilial(Integer.parseInt(request.getParameter("id")));
        }
        return null;
    }
}