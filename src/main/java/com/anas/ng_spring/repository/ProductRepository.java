package com.anas.ng_spring.repository;

import com.anas.ng_spring.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findAllByCategoryId(Integer categoryId, Pageable pageable);

    Page<Product> findByTitleContaining(String key, Pageable pageable);
}
