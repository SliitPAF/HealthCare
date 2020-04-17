package com.healthcare.HealthCareWebAppplication;

public class DoctorDetails {

	private int Docotr_id;
	private String Fname;
	private String Lname;
	private String Specialty;
	private int Pnumber;
	
	
	public int getDocotr_id() {
		return Docotr_id;
	}
	public void setDocotr_id(int docotr_id) {
		Docotr_id = docotr_id;
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
	public String getSpecialty() {
		return Specialty;
	}
	public void setSpecialty(String specialty) {
		Specialty = specialty;
	}
	public int getPnumber() {
		return Pnumber;
	}
	public void setPnumber(int pnumber) {
		Pnumber = pnumber;
	}
	
	
	@Override
	public String toString() {
		return "Patient [Docotr_id=" + Docotr_id + ", Fname=" + Fname + ", Lname=" + Lname + ", Specialty=" + Specialty
				+ ", Pnumber=" + Pnumber + "]";
	}
	
}
