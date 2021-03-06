package com.luv2code.springdemo.dao;

import com.luv2code.springdemo.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomers();

    public Customer getCustomer(int theId);
    void saveCustomer(Customer theCustomer);

    public void deleteCustomer(int theId);
}

