package com.renzo.quickstart.java8training.superfunctions_v2_classes.classes;

import com.renzo.quickstart.java8training.superfunctions_v2_classes.interfaces.Predicate;

public class FilteringOnlyOdd implements Predicate{

	@Override
	public boolean evaluateNumber(Integer value) {
		return value%2!=0;
	}

}
