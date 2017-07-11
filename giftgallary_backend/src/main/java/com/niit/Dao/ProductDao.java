package com.niit.Dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDao
{
	void saveProduct(Product product);

public List<Product> getAllProducts();
}
	


