package com.blit.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import com.blit.entity.Brands;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandsRepository extends JpaRepository<Brands,Long> {
		
}

