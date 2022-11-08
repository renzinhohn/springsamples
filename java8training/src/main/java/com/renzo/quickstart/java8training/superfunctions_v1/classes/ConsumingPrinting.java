package com.renzo.quickstart.java8training.superfunctions_v1.classes;

import com.renzo.quickstart.java8training.superfunctions_v1.interfaces.Consumer;

public class ConsumingPrinting implements Consumer {

	@Override
	public void accepting(Integer value) {
		System.out.println(value);
	}

}
