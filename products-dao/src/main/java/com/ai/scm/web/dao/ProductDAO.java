package com.ai.scm.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ai.scm.web.model.Product;

public interface ProductDAO extends JpaRepository<Product, Long>{

	

}
