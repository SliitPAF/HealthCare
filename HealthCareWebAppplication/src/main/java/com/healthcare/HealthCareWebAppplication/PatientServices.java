package com.healthcare.HealthCareWebAppplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class PatientServices {

Connection con = null;
	
	public PatientServices() {
		String dbURL = "jdbc:mysql://localhost:3306/healthcare_db" ;
		String dbUsername = "root" ;
		String dbPassword = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	//Display all the Details of the patients 
	
public List<PatientDetails> getPatients() {
		
		List<PatientDetails> PatientDetails = new ArrayList<>();
		
		String sql = "SELECT * FROM patient";
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				PatientDetails p = new PatientDetails();
				
				p.setPatient_id(rs.getInt(1));
				p.setFname(rs.getString(2));
				p.setLname(rs.getString(3));
				p.setEmail(rs.getString(4));
				p.setAge(rs.getInt(5));
				p.setPnumber(rs.getInt(6));
				p.setPassword(rs.getString(7));
				p.setAddress(rs.getString(8));
				
				PatientDetails.add(p);
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return PatientDetails;
	}
	
	

	//Create Patients to the database

public void create(PatientDetails p) {
	
	String inserQuery = "Insert into patient values(?,?,?,?,?,?,?,?)";
	
	
	try {
		
		PreparedStatement ps = con.prepareStatement(inserQuery);
		
		ps.setInt(1, p.getPatient_id());
		ps.setString(2, p.getFname());
		ps.setString(3, p.getLname());
		ps.setString(4, p.getEmail());
		ps.setInt(5, p.getAge());
		ps.setInt(6, p.getPnumber());
		ps.setString(7, p.getPassword());
		ps.setString(8, p.getAddress());
		
		ps.executeUpdate();
		
	}catch(Exception e) {
		
		System.out.println(e);
	}
	
}



	


	//search Patients by their ID

public PatientDetails getPatient(int Patient_id) {
	
	
	String sql = "SELECT * FROM patient WHERE Patient_id="+Patient_id;
	PatientDetails p = new PatientDetails();
	
	try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		if (rs.next()) {
			p.setPatient_id(rs.getInt(1));
			p.setFname(rs.getString(2));
			p.setLname(rs.getString(3));
			p.setEmail(rs.getString(4));
			p.setAge(rs.getInt(5));
			p.setPnumber(rs.getInt(6));
			p.setPassword(rs.getString(7));
			p.setAddress(rs.getString(8));
		}
		
	} catch (Exception e) {
		System.out.println(e);
	}
	return p;
}

//Delete patient by ID

public void DeletePatient(int Patient_id) {
	
	String deleteQuery = "Delete from patient where Patient_id=?";
	
	try {
		PreparedStatement pr = con.prepareStatement(deleteQuery);
		
		pr.setInt(1, Patient_id);
		
		pr.executeUpdate();
	}catch(Exception e) {
		
		System.out.println(e);
		
	}
	
}


//Update the patient with ID 
public void update(PatientDetails pd) {
	
	String sql = "UPDATE patient SET Fname=?,Lname=?,Email=?,Age=?,Pnumber=?,Password=?,Address=? WHERE Patient_id=?";
	
	try {
		PreparedStatement st = con.prepareStatement(sql);
		
		
		st.setString(1, pd.getFname());
		st.setString(2, pd.getLname());
		st.setString(3, pd.getEmail());
		st.setInt(4, pd.getAge());
		st.setInt(5, pd.getPnumber());
		st.setString(6, pd.getPassword());
		st.setString(7, pd.getAddress());
		st.setInt(8, pd.getPatient_id());
		
		st.executeUpdate();
	
	} catch (Exception e) {
		System.out.println(e);
	}
}

//search by Doctor's First name
	public DoctorDetails getDoctor(String Fname) {

		DoctorDetails dr = new DoctorDetails();
		String sql = "SELECT * FROM doctors where Fname='" +Fname+"'";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			

			if (rs.next()) {
				
				dr.setDocotr_id(rs.getInt(1));
				dr.setFname(rs.getString(2));
				dr.setLname(rs.getString(3));
				dr.setSpecialty(rs.getString(4));
				dr.setPnumber(rs.getInt(5));

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return dr;
	}
	
	//search doctors by their category
	public DoctorDetails getCategory(String Specialty) {

		DoctorDetails dr = new DoctorDetails();
		String sql = "SELECT * FROM doctors where Specialty='" +Specialty+"'";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			

			if (rs.next()) {
				
				dr.setDocotr_id(rs.getInt(1));
				dr.setFname(rs.getString(2));
				dr.setLname(rs.getString(3));
				dr.setSpecialty(rs.getString(4));
				dr.setPnumber(rs.getInt(5));

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return dr;
	}
	

}
