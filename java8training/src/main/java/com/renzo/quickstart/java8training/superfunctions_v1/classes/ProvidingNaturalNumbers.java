package com.renzo.quickstart.java8training.superfunctions_v1.classes;

import com.renzo.quickstart.java8training.superfunctions_v1.interfaces.Provider;

public class ProvidingNaturalNumbers implements Provider {

	private static int naturalNumber;
	
	@Override
	public int getNumber() {
		return naturalNumber++;
	}

}
