package com.renzo.quickstart.java8training.superfunctions_v2_classes.classes;

import com.renzo.quickstart.java8training.superfunctions_v2_classes.interfaces.FunctionBinary;

public class ReducingMultiplyingAll implements FunctionBinary {

	@Override
	public int applying(Integer value1, Integer value2) {
		return value1 * value2;
	}

}
