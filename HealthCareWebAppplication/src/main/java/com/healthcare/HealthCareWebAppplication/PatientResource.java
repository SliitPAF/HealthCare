package com.healthcare.HealthCareWebAppplication;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("Patientresource")
public class PatientResource {

	PatientServices ps = new PatientServices();
	DoctorServices dr = new DoctorServices();

	
	//Display all the values
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<PatientDetails> getPatients() {

		return ps.getPatients();

	}

	// Create patient
	@POST
	@Path("Add")
	public PatientDetails createPatient(PatientDetails p) {
		System.out.println(p);
		ps.create(p);

		return p;
	}

	// Search Diseases category by doctor's Name
	@GET
	@Path("search_name/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public DoctorDetails getDoctor(@PathParam("name") String name) {

		return ps.getDoctor(name);

	}
	
	// Search doctor's Name by Diseases category
		@GET
		@Path("search_Specialty/{Specialty}")
		@Produces(MediaType.APPLICATION_JSON)
		public DoctorDetails getCategory(@PathParam("Specialty") String Specialty) {

			return ps.getCategory(Specialty);

		}

	// delete the user
	@DELETE
	@Path("DeletePatient/{Patient_id}")
	public PatientDetails DeleteAccount(@PathParam("Patient_id") int Patient_id) {
		PatientDetails pd = ps.getPatient(Patient_id);

		if (pd.getPatient_id() != 0) {
			ps.DeletePatient(Patient_id);
		}

		return pd;

	}

	// Update Patient
	@PUT
	@Path("updatePatient")
	public PatientDetails update(PatientDetails pd) {
		System.out.println(pd);

		ps.update(pd);
		return pd;
	}

	
	

		
	
}
