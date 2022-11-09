package com.renzo.quickstart.java8training.superfunctions_v2_classes.classes;

import java.util.Random;

import com.renzo.quickstart.java8training.superfunctions_v2_classes.interfaces.Provider;

public class ProvidingRandomNumbers implements Provider {

	Random random = new Random();
	
	@Override
	public Integer getNumber() {
		return random.nextInt(0, 1000);
	}

}
