package com.blit.http;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blit.Service.BrandsService;
import com.blit.entity.Brands;
import com.blit.repository.BrandsRepository;

@RestController
@RequestMapping("api/v1/brands")
public class BrandsControllers{
	
	
	@Autowired
	private BrandsService service;

	@GetMapping("/all")
	public List<Brands> getBrands(){
	    return service.findAllBrands();
	    
	}
	

	@PostMapping("add")
	public void  CreateBrands(@RequestBody Brands brands){
	     service.createBrands(brands);
	    
	}
	
	@DeleteMapping("/{id}")
	public void  removeBranch(@PathVariable("id") Long id){
	     service.deleteBranch(id);
	    
	}
	
	
	
	
} 
