package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.ProductDetails;
import com.example.demo.model.Price;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
@Service
public class KafkaSender {
	@Autowired
	ProductRepository repository;
	
		
	@Autowired
	private KafkaTemplate<String, Price> kafkaTemplateprod;
	int count=0;
	String kafkaTopic = "productprice";
	Logger log=LoggerFactory.getLogger(KafkaSender.class);
	
	
	public void sendPrice(Price price) {
	    
		  
	    kafkaTemplateprod.send(kafkaTopic, price);
	}
	
	
	public Product addProduct(ProductDetails productDetails)
	{
		Product product=new Product();
		product.setId(productDetails.getProdid());
		product.setName(productDetails.getProdname());
		
		Product prod =repository.save(product);
	
		
		
		Price price=new Price();
		price.setId(productDetails.getProdid());
		price.setPrice(productDetails.getProdprice());
		
		//calling another rest service
		/*RestTemplate restTemplate = new RestTemplate();
	    Price result = restTemplate.postForObject("http://localhost:8086/addprice", price,Price.class);

	    System.out.println(result);
		*/
		
		//send it Kafka
		sendPrice(price);
		 
		 return prod;
	}
	
}
