package model;

import java.sql.Date;

public class Customer {
	
	String CustomerID;
	String FName;
	String LName;
	String Mobile;
	String NIC;
	String Address;
	String Gender;
	Date DOB;
	Boolean Register;
	
	
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getNIC() {
		return NIC;
	}
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date date) {
		DOB = date;
	}
	public Boolean getRegister() {
		return Register;
	}
	public void setRegister(Boolean register) {
		Register = register;
	}
	
	

}
