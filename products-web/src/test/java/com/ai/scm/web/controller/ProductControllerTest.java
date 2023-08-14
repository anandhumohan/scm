package com.ai.scm.web.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ai.scm.web.model.Product;
import com.ai.scm.web.service.ProductService;

@ExtendWith(MockitoExtension.class)
public class ProductControllerTest {

	@Mock
	ProductService productService;

	@InjectMocks
	ProductController productController;

	@Test
	public void testCreateProduct() {
		Product product = new Product("Product Name", 10.0);
		when(productService.createProduct(any(Product.class))).thenReturn(product);

		ResponseEntity<Product> response = productController.createProduct(product);
		assertEquals(HttpStatus.CREATED, response.getStatusCode());
		assertEquals(product, response.getBody());
	}

}
