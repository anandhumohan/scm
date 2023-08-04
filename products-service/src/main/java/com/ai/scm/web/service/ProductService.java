package com.ai.scm.web.service;

import org.springframework.stereotype.Service;

import com.ai.scm.web.dao.ProductDAO;
import com.ai.scm.web.model.Product;

@Service
public class ProductService {

	private final ProductDAO productRepository;

	public ProductService(ProductDAO productRepository) {
		this.productRepository = productRepository;
	}

	public Product createProduct(Product product) {

		return productRepository.save(product);
	}

}
