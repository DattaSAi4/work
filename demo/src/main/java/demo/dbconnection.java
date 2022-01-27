package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {
	
	private  Connection dconnection;
	private dbconnection(String dburl,String username, String password) throws ClassNotFoundException, SQLException
	{
		//registerdriver
		Class.forName("com.mysql.jdbc.Driver");
		//get connection object
	         DriverManager.getConnection(dburl,username,password);
		
	}
	public Connection getconnectionobject() {
		return this.dconnection;
	}
	public void closeconnection()
	{
		this.closeconnection();
	}
	
	

}
