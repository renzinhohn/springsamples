package com.renzo.quickstart.java8training.superfunctions_v10_optional;

import java.util.Comparator;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class ETraining {
	
	Random random = new Random();
	
	public ETraining() {
		// java 1.6 reducing(acting(transforming(filtering(providing()))))		
		// java 1.8 buildList().onlyEven().getSquare().printingAndShowing().reducing();
		
		// What we want to do
		// java 1.8 providing().filtering().transforming().acting().reducing();
		
//		Optional<Integer> result = 
				Flujo.providing(10, this::randomInt)
				//filtering(NumberUtils::esPrimo)
				.filtering(valor -> valor >= 10)
				//sorting((value1, value2) -> value1 - value2)
				//sorting(Integer::compare)
				//sorting((value1, value2) -> value1.compareTo(value2))
				.sorting(Integer::compareTo)
				.transforming(NumberUtils::elevarAlCuadrado)
				//transforming(value -> new Description(value))
				.transforming(Description::new)
				.acting(System.out::println)
				//transforming(description -> description.getValue())
				.transforming(Description::getValue)
				//max((v1, v2) -> v1 - v2);
				.max(Comparator.naturalOrder())
				//.ifPresent(valor -> System.out.println("Maximum: "+valor.doubleValue()));
				.ifPresentOrElse(
						valor -> System.out.println("Maximum: "+valor.doubleValue()),
						() -> System.out.println("There aren't a maximum number because the Flujo is empty")
						);
				//max(Integer::compareTo);
				//reducing(0, (Integer::sum));
		
//		double maxDouble = result.orElseGet(() -> getValorSiNoHayMaximo()).doubleValue();
//		double maxDouble = result.orElseThrow();
//		double maxDouble = result.orElse(0);
		
//		double maxDouble;
//		if (result.isPresent()) {
//			maxDouble = result.get().doubleValue();			
//		} else {
//			maxDouble = 0;
//		}
		
//		result.ifPresent(valor -> System.out.println("Maximum: "+valor.doubleValue()));
//		System.out.println("Maximum: "+maxDouble);
	}
	
	private Integer getValorSiNoHayMaximo() {
		return 0;
	}

	private int randomInt() {
		return random.nextInt(10);
	}
	
	public static void main(String[] args) {
		new ETraining();
	}
}