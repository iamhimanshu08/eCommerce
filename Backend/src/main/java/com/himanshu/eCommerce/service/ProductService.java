package com.himanshu.eCommerce.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himanshu.eCommerce.model.Product;
import com.himanshu.eCommerce.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;
	
	public Product addProduct(Product product){
		return repo.save(product);		
	}
	
	public Product getProductById(long id) throws RuntimeException {
		Product product = repo.findById(id).get();
		if(product == null) {
			throw new RuntimeException("Product not found");
		}
		return product;
	}
	
	public Product deleteProductById(long id) throws RuntimeException {
		Product product = repo.findById(id).get();
		if(product == null) {
			throw new RuntimeException("Product not found");
		}
		repo.deleteById(id);
		return product;
	}
	
	public List<Product> getProduct(){
		return repo.findAll();
		
	}
	
	public Product updateProduct(Product product) {
		return repo.save(product);
	}
	
	

}
