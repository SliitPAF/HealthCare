package com.healthcare.HealthCareWebAppplication;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("customer")
public class CustomerResource {
	
	CustomerRepository cr = new CustomerRepository();
	
	@GET 
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON })
    public ArrayList<Customer> getCustomer() {
		System.out.println("You Got Your Customer...");
        return cr.getCustomer();
    }

}
