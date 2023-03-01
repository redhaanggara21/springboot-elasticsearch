package com.red21.springlogelk.service;

import java.util.List;
import java.util.Optional;
import com.red21.springlogelk.entity.Product;

public interface SpringDataProductService {

  Product createProduct(Product product);

  Optional<Product> getProduct(Integer id);

  void deleteProduct(Integer id);

  Iterable<Product> insertBulk(List<Product> products);

  List<Product> getProductsByName(String name);

  List<Product> getProductsByNameUsingAnnotation(String name);
}
