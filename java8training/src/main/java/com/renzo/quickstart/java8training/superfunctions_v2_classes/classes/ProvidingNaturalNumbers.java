package com.renzo.quickstart.java8training.superfunctions_v2_classes.classes;

import com.renzo.quickstart.java8training.superfunctions_v2_classes.interfaces.Provider;

public class ProvidingNaturalNumbers implements Provider {

	private static int naturalNumber;
	
	@Override
	public Integer getNumber() {
		return naturalNumber++;
	}

}
