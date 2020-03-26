package service;

import java.util.ArrayList;

import model.Customer;

public interface ICustomerService {

	ArrayList<Customer> getCustomers();

	Customer getCustomerByID(String CustomerID);

}
