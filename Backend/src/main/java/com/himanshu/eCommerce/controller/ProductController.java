package com.himanshu.eCommerce.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.himanshu.eCommerce.model.Product;
import com.himanshu.eCommerce.service.ProductService;


@RestController
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/addproduct")
	@ResponseStatus(code= HttpStatus.CREATED)
	public Product addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable long id) {
		return service.getProductById(id);		
	}
	
	@GetMapping("/")
	public List<Product> getproductbyId() {
		return service.getProduct();
	}
	
	@DeleteMapping("/delete/{id}")
	public Product deleteProductById(@PathVariable long id) {
		return service.deleteProductById(id);
	}
	
	@PutMapping("/")
	public Product updateProduct(@RequestBody Product product){
		return service.updateProduct(product);
	}

}
