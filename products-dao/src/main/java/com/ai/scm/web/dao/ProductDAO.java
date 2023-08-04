package com.ai.scm.web.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ai.scm.web.model.Product;

@Repository
public interface ProductDAO extends MongoRepository<Product, Long> {

}
