package com.healthcare.HealthCareWebAppplication;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("Doctors")
public class DoctorResource {

DoctorServices ds = new DoctorServices();
	
	//View patient details
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<DoctorDetails> getDoctors(){
		System.out.println("get patients...");
		
		return ds.getDoctors();
	}
		
	
}
