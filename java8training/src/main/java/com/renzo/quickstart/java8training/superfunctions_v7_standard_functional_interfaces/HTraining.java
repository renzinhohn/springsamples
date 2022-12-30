package com.renzo.quickstart.java8training.superfunctions_v7_standard_functional_interfaces;

import java.util.Random;

public class HTraining {
	
	public static void main(String[] args) {
		new HTraining();
	}
	
	public HTraining() {
		// java 1.6 reducing(acting(transforming(filtering(providing()))))		
		// java 1.8 buildList().onlyEven().getSquare().printingAndShowing().reducing();
		
		// What we want to do
		// java 1.8 providing().filtering().transforming().acting().reducing();
		
		Random random = new Random();
		Integer newTotal = //new Flujo<Integer>(List.of(1,2,3,4,5,6,7,8))
				Flujo.providing(10, () -> random.nextInt(8)).
				filtering(value -> value%2==0).
				transforming(value -> value*value).
				acting(value -> System.out.println(value)).
				reducing(0, (value1, value2) -> value1+value2);
		System.out.println("Reducing: "+newTotal);
	}
}