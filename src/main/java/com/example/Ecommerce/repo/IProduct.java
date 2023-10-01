package com.example.Ecommerce.repo;

import com.example.Ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProduct extends JpaRepository<Product, Integer> {
    List<Product> getAllProductsByCategory(String category);
}
