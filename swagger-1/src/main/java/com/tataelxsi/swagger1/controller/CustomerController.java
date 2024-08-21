
package com.tataelxsi.swagger1.controller;

	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.tataelxsi.swagger1.service.CustomerDetails;

	@RestController
	@RequestMapping("/customerdetails")
	public class CustomerController {
		CustomerDetails customer;
	   @GetMapping("{customerName}")
	   public CustomerDetails getCustomerDetails(String customerId) {
		return customer;
	   }
	   @PostMapping
	   public String createCustomerDetails(@RequestBody CustomerDetails customer) {
		   this.customer = customer;
		   return "The details were created successfully";
	   }
	   @PutMapping
	   public String updateCustomerDetails(@RequestBody CustomerDetails customer) {
		   this.customer = customer;
		   return "The details were updated successfully";
	   }
	   @DeleteMapping("{customerName}")
	   public String deleteCustomerDetails() {
		   this.customer = null;
		   return "The details were deleted successfully";
	   }
	}