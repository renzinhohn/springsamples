package com.renzo.quickstart.java8training.superfunctions.classes;

import java.util.Random;

import com.renzo.quickstart.java8training.superfunctions.interfaces.Provider;

public class ProvidingRandomNumbers implements Provider {

	Random random = new Random();
	
	@Override
	public int getNumber() {
		return random.nextInt(0, 1000);
	}

}
