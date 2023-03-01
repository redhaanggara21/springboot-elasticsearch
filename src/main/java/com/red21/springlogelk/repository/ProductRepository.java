package com.red21.springlogelk.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.red21.springlogelk.entity.Product;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {
}
