package com.pattern.structural.bridge.shape2;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color color){
		this.color = color;
	}
	
	abstract public void applyColor();
	
}