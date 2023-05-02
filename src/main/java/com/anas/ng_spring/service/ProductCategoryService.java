package com.anas.ng_spring.service;

import com.anas.ng_spring.model.ProductCategory;
import com.anas.ng_spring.repository.ProductCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductCategoryService {
    @Autowired
    private final ProductCategoryRepository pcr;

    public List<ProductCategory> getAllProductCategories() {
        return this.pcr.findAll();
    }
}










