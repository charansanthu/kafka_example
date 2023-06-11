package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.model.Price;
import com.example.demo.repository.PriceRepository;

@Service
public class KafkaConsumer {

	@Autowired
	PriceRepository repository;
	String consumedmessage;

	//Price price;
	
	@KafkaListener(topics="productprice",groupId="G1")
	public void consume(Price productPrice)
	{
		Logger log=LoggerFactory.getLogger(KafkaConsumer.class);
		consumedmessage= "id:"+productPrice.getId()+" Price:"+productPrice.getPrice();
		log.info("Consumed Message---->"+productPrice);
		
		repository.save(productPrice);
	}
	
	public Price addPrice(Price price)
	{
		return repository.save(price);
	}
	
	public String getConsumedmessage() {
		return consumedmessage;
	}
	
	
	
	
	
}
