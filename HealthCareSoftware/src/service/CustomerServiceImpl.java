package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Customer;
import util.DBConnection;

public class CustomerServiceImpl implements ICustomerService{
	
    private static Connection connection ;
	
	private static Statement statement ;
	
	private PreparedStatement preStatement ;
	
	
	public static void createCustomerDetailsTable() {
		try {
			connection = DBConnection.getDBConnection();
			statement = connection.createStatement() ;

			String Excu_query = "CREATE TABLE customer(" + 
					"				CustomerID INT not null," + 
					"				FName VARCHAR(45) null," + 
					"				LName VARCHAR(45) null," + 
					"				Mobile VARCHAR(45) null," +
					"				NIC VARCHAR(45) null," + 
					"				Address VARCHAR(45) null," + 
					"               Gender VARCHAR(45) null," + 
					"               DOB DATETIME null," + 
					"               Register TINYINT null," + 
					"				primary key (CustomerID)" + 
					"			)" ;
			
			
			
			
			//statement.executeUpdate(Excu_query1);
			statement.executeUpdate(Excu_query);
		}catch(SQLException | ClassNotFoundException e) {
			
		}
		
	}
	
	@Override
	public Customer getCustomerByID(String CustomerID) {
		return actionOnCustomer(CustomerID).get(0);
		
	}

	@Override
	public ArrayList<Customer> getCustomers() {
		return actionOnCustomer(null);
	}
	
	
	private ArrayList<Customer> actionOnCustomer(String CustomerID){
		ArrayList<Customer> CustomerList = new ArrayList <Customer>() ;
		
		try {
			connection = DBConnection.getDBConnection();
			
			if(CustomerID != null && !CustomerID.isEmpty()) {
				
				String Excu_query1 = "select * from customer where customer.CustomerID = ?";
				
				preStatement = connection.prepareStatement(Excu_query1);
				
				preStatement.setString(1, CustomerID);
				
			}else {
				
				String Excu_query2 = "select * from customer";
				preStatement = connection.prepareStatement(Excu_query2);
			}
			
			ResultSet customerResultSet = preStatement.executeQuery() ;
			
			while(customerResultSet.next()) {
				Customer cus = new Customer();
				cus.setCustomerID(customerResultSet.getString(1));
				cus.setFName(customerResultSet.getString(2));
				cus.setLName(customerResultSet.getString(3));
				cus.setMobile(customerResultSet.getString(4));
				cus.setNIC(customerResultSet.getString(5));
				cus.setAddress(customerResultSet.getString(6));
				cus.setGender(customerResultSet.getString(7));
				cus.setDOB(customerResultSet.getDate(8));
				cus.setRegister(customerResultSet.getBoolean(9));
				
				
				CustomerList.add(cus);
			}
		}catch(SQLException |ClassNotFoundException e)	{
			
		}finally {
			try {
				if (preStatement != null) {
					preStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			}catch(SQLException e) {
				
			}
			
		}
	return CustomerList ;
	}
	
	

}
