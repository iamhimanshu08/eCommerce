package com.himanshu.eCommerce.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/")
@Tag(name = "Product Rest  Endpoint")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	
	@PostMapping("/addproduct")
	@ResponseStatus(code= HttpStatus.CREATED)
	public Product addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
	
	@GetMapping("/{id}")
	@Operation(summary = "Return Product's single id", description = "Take id return single product")
	public @ApiResponse(description = "Product Object") Product getProductById(@Parameter(description = "Id of the product")@PathVariable long id) {
		LOGGER.info(" Finding Product by id: "+id);
		return service.getProductById(id);		
	}
	
	@GetMapping("/")
	public List<Product> getproductbyId() {
		return service.getProduct();
	}
	
	@DeleteMapping("/delete/{id}")
	public Product deleteProductById( @PathVariable long id) {
		return service.deleteProductById(id);
	}
	
	@PutMapping("/")
	public Product updateProduct(@RequestBody Product product){
		return service.updateProduct(product);
	}

}
