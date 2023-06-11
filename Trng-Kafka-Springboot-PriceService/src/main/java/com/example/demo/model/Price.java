package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Price {
@Id
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id:"+id+" Price: "+price;
	}


public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


private int  price;
}
