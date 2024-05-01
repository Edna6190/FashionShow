package com.blit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blit.entity.Brands;
import com.blit.repository.BrandsRepository;

@Service
public class BrandsService {
	
	@Autowired
	private BrandsRepository repository;
	
	public List<Brands> findAllBrands(){
		return repository.findAll();
		
	}

	public void createBrands(Brands brands) {
		repository.save(brands);
	}

	public void deleteBranch(Long id) {
	repository.deleteById(id);
		
	}
	
} 

