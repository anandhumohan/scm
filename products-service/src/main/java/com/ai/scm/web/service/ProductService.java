package com.ai.scm.web.service;

import org.springframework.stereotype.Service;

import com.ai.scm.web.dao.ProductDAO;
import com.ai.scm.web.model.Product;

@Service
public class ProductService {

	// Assuming you have a productRepository for database operations
    private final ProductDAO productRepository;

    public ProductService(ProductDAO productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        // Your business logic for creating a product here. 
        // Typically this involves saving the product to your database.
        // This is a simple save operation for the purpose of this example.
        
        return productRepository.save(product);
    }

}
