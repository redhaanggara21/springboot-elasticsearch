package com.red21.springlogelk.service;
import java.util.Map;

import com.red21.springlogelk.entity.Product;

public interface HighLevelClientProductService {

  Product getProduct(Integer id);

  Map<Integer, Long> aggregateTerm(Integer term);

  Product createProduct(Product product);

  boolean deleteProduct(Integer id);

  boolean createProductIndex();
}