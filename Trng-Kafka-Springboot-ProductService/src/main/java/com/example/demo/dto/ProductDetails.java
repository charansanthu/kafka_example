package com.example.demo.dto;

import org.springframework.stereotype.Component;


public class ProductDetails {
private int prodid;
private String prodname;
private int prodprice;
public int getProdid() {
	return prodid;
}
public void setProdid(int prodid) {
	this.prodid = prodid;
}
public String getProdname() {
	return prodname;
}
public void setProdname(String prodname) {
	this.prodname = prodname;
}
public int getProdprice() {
	return prodprice;
}
public void setProdprice(int prodprice) {
	this.prodprice = prodprice;
}


}
