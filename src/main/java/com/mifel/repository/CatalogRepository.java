package com.mifel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mifel.entity.Catalog;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Long>{
	List<Catalog> findByName(@Param(value="value") String value);
}
