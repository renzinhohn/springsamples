package com.renzo.quickstart.java8training.superfunctions_v2_classes.classes;

import com.renzo.quickstart.java8training.superfunctions_v2_classes.interfaces.Consumer;

public class ConsumingPrinting implements Consumer {

	@Override
	public void accepting(Integer value) {
		System.out.println(value);
	}

}
