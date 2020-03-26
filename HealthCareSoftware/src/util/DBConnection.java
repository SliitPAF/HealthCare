package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection connection ;

	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		String dbURL = "jdbc:mysql://127.0.0.1:3306/helthcare_db" ;
		String dbDriver = "com.mysql.jdbc.Driver" ;
		//String dbName = "" ;
		String dbUsername = "root" ;
		String dbPassword = "3edc$RFV";
		
		if(connection == null || connection.isClosed()) {
			
			Class.forName(dbDriver) ;
			
			connection = DriverManager.getConnection(dbURL,dbUsername , dbPassword);
			
		}
		
		return connection ;
		
	}
	
	

}
