package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    @PostMapping("/product")
    public String createProduct(List<Product> product){
        productService.createProduct(product);
        return "product created";
    }

    @GetMapping("/products/category")
    public List<Product> getProductsByCategory(@RequestParam("category") String category){
        return productService.getProductsByCategory(category);
    }
    @DeleteMapping("/delete/product")
    public String deleteProduct(@RequestParam Integer id){
        return productService.deleteProduct(id);
    }
}
