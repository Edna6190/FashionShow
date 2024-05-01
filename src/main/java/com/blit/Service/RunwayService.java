package com.blit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blit.entity.Runway;
import com.blit.repository.RunwayRepository;

@Service
public class RunwayService {
	
	@Autowired
	private RunwayRepository repository;

	public List<Runway> findAllRunway() {
		return repository.findAll();
	}

	public void createRunway(Runway runway) {
		
		repository.save(runway);
		
	}

}
