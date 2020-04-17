package com.healthcare.HealthCareWebAppplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class CustomerRepository {
	
	 Connection con = null ;
	
	 Statement statement ;
	
	 PreparedStatement preStatement ;
	
	public CustomerRepository(){
		
		String dbURL = "jdbc:mysql://127.0.0.1:3306/helthcare_db?useSSL=false" ;
		//String dbName = "" ;
		String dbUsername = "root" ;
		String dbPassword = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(dbURL,dbUsername , dbPassword);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
	public ArrayList<Customer> getCustomer() {
		ArrayList<Customer> CustomerList = new ArrayList <>() ;
		
		try {
			String sql = "SELECT * FROM patient";
			statement = con.createStatement();
			
			ResultSet rs = statement.executeQuery(sql) ;
			
			while(rs.next()) {
				Customer pd = new Customer();
				pd.setFname(rs.getString(1));
				pd.setLname(rs.getString(2));
				pd.setEmail(rs.getString(3));
				pd.setPatient_id(rs.getInt(4));
				pd.setAge(rs.getInt(5));
				pd.setGender(rs.getString(6));
				pd.setPnumber(rs.getInt(7));
				pd.setPassword(rs.getString(8));
				
				
				CustomerList.add(pd);
			}
			
		}catch(Exception e)	{
			System.out.println(e);
			
		}
	return CustomerList ;
	}

	

}
