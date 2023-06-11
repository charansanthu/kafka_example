package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductDetails;
import com.example.demo.model.Product;
import com.example.demo.service.KafkaSender;

@RestController
public class ProductController {
@Autowired
KafkaSender kafkaservice;

@PostMapping("/addproduct")
public Product addProduct(@RequestBody ProductDetails productdetails)
{
	return kafkaservice.addProduct(productdetails);
}
}
