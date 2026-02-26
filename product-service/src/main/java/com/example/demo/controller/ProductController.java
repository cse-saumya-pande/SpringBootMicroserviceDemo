package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {

        return new Product(id, "Laptop", 50000);
    }
}