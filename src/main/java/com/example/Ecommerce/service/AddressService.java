package com.example.Ecommerce.service;

import com.example.Ecommerce.model.Address;
import com.example.Ecommerce.repo.IAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddress addressRepo;

    public void createAddress(List<Address> address) {
        addressRepo.saveAll(address);
    }
}
