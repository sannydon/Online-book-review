package com.book.dao;
import java.util.List;

import com.book.model.Customer;

/**
 * Created by Le on 1/25/2016.
 */
public interface CustomerDao {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);

}
