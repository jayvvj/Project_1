package com.abc.BackEnd1.dao;

import java.util.List;

import com.abc.BackEnd1.model.Customer;

public interface CustomerDAO
{
	boolean addCustomer(Customer c);
	boolean delCustomer(String email);
	boolean updCustomer(Customer c);
	Customer getCustomerByEmail(String email);
	List<Customer> getAllCustomers();
}