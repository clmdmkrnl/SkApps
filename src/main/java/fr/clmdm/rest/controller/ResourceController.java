package fr.clmdm.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.clmdm.dao.ResourceServiceI;
import fr.clmdm.model.Resource;

@RestController	
public class ResourceController{

	 @Autowired
	 ResourceServiceI rsSer;
	
	@RequestMapping(value = "/resources", method = RequestMethod.GET)
    public ResponseEntity<List<Resource>> listAllUsers() {
          
		List<Resource> rs = rsSer.listAllResources();
        if(rs.isEmpty()){
            return new ResponseEntity<List<Resource>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Resource>>(rs, HttpStatus.OK);
		
    }
 
}	