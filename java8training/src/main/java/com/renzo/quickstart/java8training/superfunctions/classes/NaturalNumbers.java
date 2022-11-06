package com.renzo.quickstart.java8training.superfunctions.classes;

import com.renzo.quickstart.java8training.superfunctions.interfaces.Provider;

public class NaturalNumbers implements Provider {

	private static int naturalNumber;
	
	@Override
	public int getNumber() {
		return naturalNumber++;
	}

}
