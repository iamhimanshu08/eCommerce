package com.himanshu.eCommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info= @Info(title = "Product API", version = "1.0", description= "This api is for Products" ))
public class eCommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(eCommerceApplication.class, args);
	}

}
