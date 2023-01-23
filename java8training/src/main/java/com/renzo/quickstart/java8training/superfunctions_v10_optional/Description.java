package com.renzo.quickstart.java8training.superfunctions_v10_optional;

public class Description {

	private final Integer value;
	
	public Description(int value) {
		this.value=value;
	}
	
	public Integer getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "V("+value+")";
	}
}
