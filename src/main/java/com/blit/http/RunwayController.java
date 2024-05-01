package com.blit.http;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blit.Service.RunwayService;
import com.blit.entity.Runway;

@RestController
@RequestMapping("api/v1/runway")
public class RunwayController {
	
	@Autowired
	private RunwayService service;
	
	

	@GetMapping("/all")
	public List<Runway> getRunway(){
	    return service.findAllRunway();
	    
	}
	

	@PostMapping("add")
	public void  CreateRunway(@RequestBody Runway runway){
	     service.createRunway(runway);
	    
	}

}
