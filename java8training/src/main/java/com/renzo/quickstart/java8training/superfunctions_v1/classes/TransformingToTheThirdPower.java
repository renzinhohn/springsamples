package com.renzo.quickstart.java8training.superfunctions_v1.classes;

import com.renzo.quickstart.java8training.superfunctions_v1.interfaces.Function;

public class TransformingToTheThirdPower implements Function{

	private final static Integer NUMBER_THREE=3;
	
	@Override
	public Integer aplying(Integer value) {
		return (int)Math.pow( (double)value, (double)NUMBER_THREE);
	}

}
