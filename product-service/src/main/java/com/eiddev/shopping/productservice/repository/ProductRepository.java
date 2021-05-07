package com.eiddev.shopping.productservice.repository;

import com.eiddev.shopping.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
