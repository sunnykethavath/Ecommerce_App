package com.example.Ecommerce.repo;

import com.example.Ecommerce.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddress extends JpaRepository<Address, Integer> {
}
