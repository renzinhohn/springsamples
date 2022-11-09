package com.renzo.quickstart.java8training.superfunctions_v2_classes.classes;

import com.renzo.quickstart.java8training.superfunctions_v2_classes.interfaces.Function;

public class TransformingToTheSecondPower implements Function{

	private final static Integer NUMBER_TWO=2;
	
	@Override
	public Integer aplying(Integer value) {
		return (int)Math.pow( (double)value, (double)NUMBER_TWO);
	}

}
