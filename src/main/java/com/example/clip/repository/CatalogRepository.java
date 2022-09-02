package com.example.clip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.clip.entity.Catalog;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Long>{
	
}
