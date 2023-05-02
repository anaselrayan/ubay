package com.anas.ng_spring.service;

import com.anas.ng_spring.model.Product;
import com.anas.ng_spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<Product> getAllProducts(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return this.productRepository.findAll(pageable);
    }

    public Product getProductById(Long id) {
        //TODO: validate the product id
        return this.productRepository.findById(id).get();
    }

    public Page<Product> getProductsByCategoryId(int categoryId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return this.productRepository.findAllByCategoryId(categoryId, pageable);
    }

    public Page<Product> searchByKeyword(String keyword, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return this.productRepository.findByTitleContaining(keyword, pageable);
    }
}
