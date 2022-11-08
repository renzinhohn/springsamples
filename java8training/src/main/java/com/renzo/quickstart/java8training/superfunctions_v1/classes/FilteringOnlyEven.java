package com.renzo.quickstart.java8training.superfunctions_v1.classes;

import com.renzo.quickstart.java8training.superfunctions_v1.interfaces.Predicate;

public class FilteringOnlyEven implements Predicate {

	@Override
	public boolean evaluateNumber(Integer value) {
		return value%2==0;
	}

}
