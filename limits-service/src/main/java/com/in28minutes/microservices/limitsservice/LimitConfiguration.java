package com.in28minutes.microservices.limitsservice;

public class LimitConfiguration {
	private int minimum;
	private int maximum;
	
	protected LimitConfiguration() {
		
	}
	public LimitConfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMin(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMax(int maximum) {
		this.maximum = maximum;
	}
	
	

}
