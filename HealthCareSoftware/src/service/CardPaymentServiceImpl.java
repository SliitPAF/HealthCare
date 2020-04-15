package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.CardPayment;
import model.Customer;
import util.DBConnection;

public class CardPaymentServiceImpl implements IPaymentService {

	  private static Connection connection ;
		
	  private static Statement statement ;
		
	  private PreparedStatement preStatement ;
	
	  public static void createPaymentDetailsTable() {
			try {
				connection = DBConnection.getDBConnection();
				statement = connection.createStatement() ;

				String Excu_query = "CREATE TABLE payment(" + 
						"				PaymentID INT not null," + 
						"				FName VARCHAR(45) null," + 
						"				LName VARCHAR(45) null," + 
						"				creditCardNumber VARCHAR(30) null," + 
						"				amount float null," + 
						"               cvc           INT null," + 
						"				primary key (PaymentID)" + 
						"			)" ;
				
				
				
				//statement.executeUpdate(Excu_query1);
				statement.executeUpdate(Excu_query);
			}catch(SQLException | ClassNotFoundException e) {
				
			}
			
		}
	  
	  
	  
	@Override
	public ArrayList<CardPayment> getCartPayments() {
		// TODO Auto-generated method stub
		return actionOnPayment(null);
	}

	@Override
	public CardPayment getCardPaymentByID(String PaymentID) {
		return actionOnPayment(PaymentID).get(0);
	}
	
	private ArrayList<CardPayment> actionOnPayment(String PaymentID){
		ArrayList<CardPayment> PaymentList = new ArrayList <CardPayment>() ;
		
		try {
			connection = DBConnection.getDBConnection();
			
			if(PaymentID != null && !PaymentID.isEmpty()) {
				
				String Excu_query1 = "select * from payment where payment.PaymentID = ?";
				
				preStatement = connection.prepareStatement(Excu_query1);
				
				preStatement.setString(1, PaymentID);
				
			}else {
				
				String Excu_query2 = "select * from payment";
				preStatement = connection.prepareStatement(Excu_query2);
			}
			
			ResultSet paymentResultSet = preStatement.executeQuery() ;
			
			while(paymentResultSet.next()) {
				CardPayment pay = new CardPayment();
				pay.setPaymentID(paymentResultSet.getString(1));
				pay.setFName(paymentResultSet.getString(2));
				pay.setLName(paymentResultSet.getString(3));
				pay.setMobile(paymentResultSet.getString(4));
				pay.setNIC(paymentResultSet.getString(5));
				pay.setAddress(paymentResultSet.getString(6));
				
				PaymentList.add(pay);
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
	return PaymentList ;
	}

}
