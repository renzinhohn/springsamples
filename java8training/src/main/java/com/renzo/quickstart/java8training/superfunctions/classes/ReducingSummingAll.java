package com.renzo.quickstart.java8training.superfunctions.classes;

import com.renzo.quickstart.java8training.superfunctions.interfaces.FunctionBinary;

public class ReducingSummingAll implements FunctionBinary {

	@Override
	public int applying(Integer value1, Integer value2) {
		return value1 + value2;
	}

}
