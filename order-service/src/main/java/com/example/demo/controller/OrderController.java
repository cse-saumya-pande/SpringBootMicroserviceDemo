package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{productId}")
    public String placeOrder(@PathVariable int productId) {

        String productUrl = "http://localhost:8080/products/" + productId;

        Object product = restTemplate.getForObject(productUrl, Object.class);

        return "Order placed for product: " + product.toString();
    }
}