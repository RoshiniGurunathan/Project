package com.niit.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Product;

@Repository
public class ProductDaoImp implements ProductDao {
	public void productDao()
	{
		System.out.println("ProductDao Object Is Created");
	}
@Autowired
	private SessionFactory sessionFactory;
	public void saveProduct(Product product)
	{
		Session session=sessionFactory.getCurrentSession();
		session.save(product);
	}
	public List<Product> getAllProducts(){
	Session session=sessionFactory.getCurrentSession();
	Query query=session.createQuery("from Product");
	List<Product> products=query.list();
	for(Product p:products)
	{
		System.out.println("----------------------------->"+p.getProductName());
		System.out.println("------------------------------->"+p.getPrice());
	}
	return products;
}
}