package com.pattern.structural.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
	
	private static DbSingleton instance = null;
	
	private Connection conn = null;
	
	private DbSingleton(){
		try{
			DriverManager.deregisterDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static DbSingleton getInstance(){
		if(instance == null){
			synchronized (DbSingleton.class) {
				if(instance == null){
					instance = new DbSingleton();
				}
				
			}
		}
		
		return instance;
	}
	
	public Connection getConnections(){
		if(conn == null){
			synchronized (DbSingleton.class) {
				if(conn == null){
					try{
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						
						conn = DriverManager.getConnection(dbUrl);
					}catch(SQLException e){
						e.printStackTrace();
					}
				}
			}
		}
	
		return conn;
	}
}
