package com.himanshu.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.himanshu.eCommerce.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
