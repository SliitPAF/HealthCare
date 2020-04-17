package com.healthcare.HealthCareWebAppplication;

public class PatientDetails {

	private int Patient_id;
	private String Fname;
	private String Lname;
	private String Email;
	private int Age;
	private int Pnumber;
	private String Password;
	private String Address;
	
	
	public int getPatient_id() {
		return Patient_id;
	}
	public void setPatient_id(int patient_id) {
		Patient_id = patient_id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getPnumber() {
		return Pnumber;
	}
	public void setPnumber(int pnumber) {
		Pnumber = pnumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	@Override
	public String toString() {
		return "Patient [Patient_id=" + Patient_id + ", Fname=" + Fname + ", Lname=" + Lname + ", Email=" + Email
				+ ", Age=" + Age + ", Pnumber=" + Pnumber + ", Password=" + Password + ", Address=" + Address + "]";
	}
	
	
	
}
