package com.red21.springlogelk.service;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.red21.springlogelk.entity.Product;
import com.red21.springlogelk.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class SpringDataProductServiceImpl {

  // private final ProductRepository productRepository;

  // public Product createProduct(Product product) {
  //   return productRepository.save(product);
  // }

  // public Optional<Product> getProduct(Integer id) {
  //   return productRepository.findById(id);
  // }

  // public void deleteProduct(Integer id) {
  //   productRepository.deleteById(id);
  // }

  // public Iterable<Product> insertBulk(List<Product> products) {
  //   return productRepository.saveAll(products);
  // }

  // public List<Product> getProductsByName(String name) {
  //   return productRepository.findAllByName(name);
  // }

  // public List<Product> getProductsByNameUsingAnnotation(String name) {
  //   return productRepository.findAllByNameUsingAnnotations(name);
  // }

}
