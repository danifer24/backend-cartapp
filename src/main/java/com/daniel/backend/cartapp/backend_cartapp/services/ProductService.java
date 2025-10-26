package com.daniel.backend.cartapp.backend_cartapp.services;

import java.util.List;

import com.daniel.backend.cartapp.backend_cartapp.models.entities.Product;

public interface ProductService {
    List<Product> findAll();
}
