package com.renzo.quickstart.java8training.superfunctions_v6_lambdas;

import java.util.Random;

public class FTraining {
	
	public static void main(String[] args) {
		new FTraining();
	}
	
	public FTraining() {
		// java 1.6 reducing(acting(transforming(filtering(providing()))))		
		// java 1.8 buildList().onlyEven().getSquare().printingAndShowing().reducing();
		
		// What we want to do
		// java 1.8 providing().filtering().transforming().acting().reducing();
		
		Random random = new Random();
		Integer newTotal = //new Flujo<Integer>(List.of(1,2,3,4,5,6,7,8))
				Flujo.providing(10,
				() -> random.nextInt(10)
				/*new Provider<Integer>() {
					Random random = new Random();
					@Override
					public Integer getNumber() {						
						return random.nextInt(10);
					}
				}*/
				).filtering(
				/*
				new Predicate<Integer>() {
						
					@Override
					public boolean evaluateNumber(Integer value) {
						return value%2==0;
					}
				}
				
				(Integer value) -> {
					return value%2==0;
				}
				*/
				value -> value%2==0
				).transforming(/*new OperatorUnary<Integer>() {
		
			@Override
			public Integer aplying(Integer value) {
				return value*value;
			}
		}*/
				value -> value*value
				).acting(/*new Consumer<Integer>() {
			
			@Override
			public void accepting(Integer value) {
				System.out.println(value);
			}
		}*/
				value -> System.out.println(value)
				).reducing(  0, (value1, value2) -> value1+value2				
		/*new OperatorBinary<Integer>() {
			
			@Override
			public Integer applying(Integer value1, Integer value2) {
				return value1+value2;
			}
		}*/);
		System.out.println("Reducing: "+newTotal);
	}
}
/*
	Integer newTotal = new Flujo<Integer>(List.of(1,2,3,4,5,6,7,8)).filtering(new Predicate<Integer>() {
			
			@Override
			public boolean evaluateNumber(Integer value) {
				return value%2==0;
			}
		}).transforming(new OperatorUnary<Integer>() {

			@Override
			public Integer aplying(Integer value) {
				return value*value;
			}
		}).acting(new Consumer<Integer>() {
			
			@Override
			public void accepting(Integer value) {
				System.out.println(value);
			}
		}).reducing(0, new OperatorBinary<Integer>() {
			
			@Override
			public Integer applying(Integer value1, Integer value2) {
				return value1+value2;
			}
		});
		System.out.println("Reducing: "+newTotal);
	}
*/