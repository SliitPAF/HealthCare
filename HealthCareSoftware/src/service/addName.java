package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.addTest;
import util.DBConnection;

public class addName implements addTestInterface {
	
	private static final String system = null;

	private static Connection connection ;
	
	private static Statement statement ;
	
	private PreparedStatement preStatement ;
	
	@Override
	public void addNames(addTest addTest) {
		
		try {
			connection = DBConnection.getDBConnection();
			String Excu_query3 ="insert into teast(name) values (?)"; 
				
			preStatement = connection.prepareStatement(Excu_query3);
			connection.setAutoCommit(false);
			
			preStatement.setString(1, addTest.getName());
			preStatement.executeUpdate() ;
			connection.commit();
		
		
		}catch(SQLException | ClassNotFoundException e) {
			
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
	}

}
