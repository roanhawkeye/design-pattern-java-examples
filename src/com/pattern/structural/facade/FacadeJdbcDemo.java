package com.pattern.structural.facade;

import java.util.List;

public class FacadeJdbcDemo {
	
	public static void main(String[] args) {
		
		JdbcFacade jdbcFacade = new JdbcFacade();
		
		jdbcFacade.createTable();
		
		System.out.println("Table Created.");
		
		jdbcFacade.insertIntoTable();
		
		System.out.println("Recorded inserted");
		
		List<Address> addresses = jdbcFacade.getAddresses();
		
		for(Address address: addresses){
			System.out.println(address.getId());
		}
		
	}
	
}
