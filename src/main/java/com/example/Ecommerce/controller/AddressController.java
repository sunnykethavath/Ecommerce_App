package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.Address;
import com.example.Ecommerce.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AddressController {

    @Autowired
    AddressService addressService;
    @PostMapping("/address")
    public String createAddress(List<Address> address){
        addressService.createAddress(address);
        return "address created";
    }
}
