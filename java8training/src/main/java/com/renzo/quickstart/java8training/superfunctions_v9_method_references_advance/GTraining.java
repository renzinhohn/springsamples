package com.renzo.quickstart.java8training.superfunctions_v9_method_references_advance;

import java.util.Comparator;
import java.util.Random;

public class GTraining {
	
	Random random = new Random();
	
	public GTraining() {
		// java 1.6 reducing(acting(transforming(filtering(providing()))))		
		// java 1.8 buildList().onlyEven().getSquare().printingAndShowing().reducing();
		
		// What we want to do
		// java 1.8 providing().filtering().transforming().acting().reducing();
		
		Integer newTotal = 
				Flujo.providing(10, this::randomInt).
				filtering(NumberUtils::esPrimo).
				//sorting((value1, value2) -> value1 - value2).
				//sorting(Integer::compare).
				//sorting((value1, value2) -> value1.compareTo(value2)).
				sorting(Integer::compareTo).
				transforming(NumberUtils::elevarAlCuadrado).
				//transforming(value -> new Description(value)).
				transforming(Description::new).
				acting(System.out::println).
				//transforming(description -> description.getValue()).
				transforming(Description::getValue).
				reducing(0, (Integer::sum));
		System.out.println("Reducing: "+newTotal);
	}
	
	private int randomInt() {
		return random.nextInt(10);
	}
	

	public static void main(String[] args) {
		new GTraining();
	}
}