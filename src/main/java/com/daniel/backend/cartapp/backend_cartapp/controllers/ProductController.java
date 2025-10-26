package com.daniel.backend.cartapp.backend_cartapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.backend.cartapp.backend_cartapp.services.ProductService;
import com.daniel.backend.cartapp.backend_cartapp.models.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public List<Product> list(){
        return service.findAll();
    }
}
