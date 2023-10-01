package com.example.Ecommerce.service;

import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.repo.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProduct productRepo;

    public void createProduct(List<Product> product) {
        productRepo.saveAll(product);
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepo.getAllProductsByCategory(category);
    }

    public String deleteProduct(Integer id) {
        productRepo.deleteById(id);
        return "product deleted";
    }
}
