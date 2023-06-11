package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Price;
import com.example.demo.service.KafkaConsumer;

@RestController
public class PriceController {
@Autowired
KafkaConsumer consumer;
@PostMapping("/addprice")
Price addProductPrice(@RequestBody Price price)
{
	return consumer.addPrice(price);
}
}
