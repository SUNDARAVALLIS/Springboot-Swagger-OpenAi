package com.tataelxsi.swagger1.service;


public class CustomerDetails {
  private String customerId;
  private String customerName;
  private String customerAddress;
  private String customerNumber;
  public CustomerDetails() {
  }
  
public CustomerDetails(String customerId, String customerName, String customerAddress, String customerNumber) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
	this.customerNumber = customerNumber;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public String getCustomerNumber() {
	return customerNumber;
}
public void setCustomerNumber(String customerNumber) {
	this.customerNumber = customerNumber;
}
  
}