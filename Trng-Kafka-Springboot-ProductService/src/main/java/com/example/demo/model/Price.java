package com.example.demo.model;

import org.springframework.stereotype.Component;


public class Price {
private int id;
private int price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " prod Id:"+id+" Price"+price;
	}
}
