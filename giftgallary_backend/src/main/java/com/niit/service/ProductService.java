package com.niit.service;

import java.util.List;

import com.niit.model.Product;

public interface ProductService {
	
	void saveProduct(Product product);

public List<Product> getAllProducts();
}
