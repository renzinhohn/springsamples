package com.renzo.quickstart.java8training.zrenzinho;

import com.renzo.quickstart.java8training.zrenzinho.interfaces.Auto;

public class AutoAudi implements Auto{

	@Override
	public Integer running() {
		int b = 0;
		for (int i = 0; i < 5; i++) {			
			b++;
			
		}
		System.out.println("AutoAudi is running...!");
		return b;
	}

}
