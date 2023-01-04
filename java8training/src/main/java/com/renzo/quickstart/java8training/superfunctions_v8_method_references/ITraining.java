package com.renzo.quickstart.java8training.superfunctions_v8_method_references;

import java.util.Random;

public class ITraining {
	
	Random random = new Random();
	
	public ITraining() {
		// java 1.6 reducing(acting(transforming(filtering(providing()))))		
		// java 1.8 buildList().onlyEven().getSquare().printingAndShowing().reducing();
		
		// What we want to do
		// java 1.8 providing().filtering().transforming().acting().reducing();
		
		Integer newTotal =
				//Flujo.providing(10, () -> randomInt()).
				Flujo.providing(10, this::randomInt).
				//filtering(value -> NumberUtils.esPrimo(value)).
				filtering(NumberUtils::esPrimo).
				//transforming(value -> NumberUtils.elevarAlCuadrado(value)).
				transforming(NumberUtils::elevarAlCuadrado).
				//acting(value -> System.out.println(value)).
				acting(System.out::println).
				//reducing(0, (value1, value2) -> Integer.sum(value1, value2));
				reducing(0, (Integer::sum));
		System.out.println("Reducing: "+newTotal);
	}
	
	private int randomInt() {
		return random.nextInt(10);
	}
	

	public static void main(String[] args) {
		new ITraining();
	}
}