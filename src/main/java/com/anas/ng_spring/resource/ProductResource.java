package com.anas.ng_spring.resource;

import com.anas.ng_spring.model.Product;
import com.anas.ng_spring.model.ProductCategory;
import com.anas.ng_spring.service.ProductCategoryService;
import com.anas.ng_spring.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductResource {

    private final ProductService productService;
    private final ProductCategoryService pcs;

    @GetMapping("/all")
    public Page<Product> getAllProducts(@RequestParam int page, @RequestParam int size) {
        return this.productService.getAllProducts(page, size);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return this.productService.getProductById(id);
    }

    @GetMapping("/category")
    public List<ProductCategory> getAllProductCategories() {
        return this.pcs.getAllProductCategories();
    }

    @GetMapping("/search")
    public Page<Product> searchByKeyword(@RequestParam String key,
                                         @RequestParam int page,
                                         @RequestParam int size) {
        return this.productService.searchByKeyword(key, page, size);
    }

    @GetMapping("category/{id}")
    public Page<Product> getProductsByCategoryId(@PathVariable Integer id,
                                                 @RequestParam int page,
                                                 @RequestParam int size) {
        return this.productService.getProductsByCategoryId(id, page, size);
    }
}
