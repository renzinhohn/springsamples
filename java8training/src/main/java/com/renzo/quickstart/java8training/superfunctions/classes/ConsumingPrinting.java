package com.renzo.quickstart.java8training.superfunctions.classes;

import com.renzo.quickstart.java8training.superfunctions.interfaces.Consumer;

public class ConsumingPrinting implements Consumer {

	@Override
	public void accepting(Integer value) {
		System.out.println(value);
	}

}
