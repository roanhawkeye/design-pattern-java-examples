package com.pattern.structural.composite;

import java.util.HashMap;
import java.util.Map;

public class CompositeEveryDayDemo {
	
	public static void main(String[] args) {
		
		Map<String, String> personAttributes = new HashMap<>();
		
		personAttributes.put("site_role", "person");
		personAttributes.put("access_role", "liited");
		
		Map<String, String> groupAttributes = new HashMap<>();
		
		groupAttributes.put("group_role", "claims");
		
		Map<String, String> secAttributes = new HashMap<>();
		
		secAttributes.putAll(personAttributes);
		secAttributes.putAll(groupAttributes);
		
		System.out.println(secAttributes);
	}
}
