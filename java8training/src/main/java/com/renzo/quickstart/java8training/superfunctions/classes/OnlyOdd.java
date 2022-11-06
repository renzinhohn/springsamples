package com.renzo.quickstart.java8training.superfunctions.classes;

import com.renzo.quickstart.java8training.superfunctions.interfaces.Predicate;

public class OnlyOdd implements Predicate{

	@Override
	public boolean evaluateNumber(Integer value) {
		return value%2!=0;
	}

}
