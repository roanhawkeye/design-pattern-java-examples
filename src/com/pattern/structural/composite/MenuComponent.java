package com.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
	protected String name;
	protected String url;
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	
	public MenuComponent add(MenuComponent menuComponent){
		throw new UnsupportedOperationException("Feature not implemented at this lever");
	}
	
	public MenuComponent remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException("Feature not implemented at this lever");
	}
	
	public String getName() {
		return name;
	}
	public String getUrl() {
		return url;
	}
	
	public abstract String toString();
	
	String print(MenuComponent menuComponent){
		StringBuilder builder = new StringBuilder(name);
		builder.append(": ");
		builder.append("url");
		builder.append("\n");
		return builder.toString();
	}
	
}
