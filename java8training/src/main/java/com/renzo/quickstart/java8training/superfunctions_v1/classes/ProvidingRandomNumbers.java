package com.renzo.quickstart.java8training.superfunctions_v1.classes;

import java.util.Random;

import com.renzo.quickstart.java8training.superfunctions_v1.interfaces.Provider;

public class ProvidingRandomNumbers implements Provider {

	Random random = new Random();
	
	@Override
	public int getNumber() {
		return random.nextInt(0, 1000);
	}

}
