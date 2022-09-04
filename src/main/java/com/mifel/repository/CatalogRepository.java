package com.mifel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mifel.entity.Catalog;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Long>{
	
}
