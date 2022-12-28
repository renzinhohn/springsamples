package com.renzo.quickstart.java8training.superfunctions_v5_flow;

import java.util.Random;

import com.renzo.quickstart.java8training.superfunctions_v5_flow.interfaces.Consumer;
import com.renzo.quickstart.java8training.superfunctions_v5_flow.interfaces.OperatorBinary;
import com.renzo.quickstart.java8training.superfunctions_v5_flow.interfaces.OperatorUnary;
import com.renzo.quickstart.java8training.superfunctions_v5_flow.interfaces.Predicate;
import com.renzo.quickstart.java8training.superfunctions_v5_flow.interfaces.Provider;

public class ETraining {
	
	public static void main(String[] args) {
		new ETraining();
	}
	
	public ETraining() {
		// java 1.6 reducing(acting(transforming(filtering(providing()))))		
		// java 1.8 buildList().onlyEven().getSquare().printingAndShowing().reducing();
		
		// What we want to do
		// java 1.8 providing().filtering().transforming().acting().reducing();
		
		Integer newTotal = Flujo.providing(10, new Provider<Integer>() {
			Random random = new Random();
			
			@Override
			public Integer getNumber() {
				return random.nextInt(0, 9);
			}
		}).filtering(new Predicate<Integer>() {
			
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
}

/*
		// What we want to do
		// 1 Build number list
		Flujo<Integer> numbers = Flujo.providing(10, new Provider<Integer>() {
			Random random = new Random();
			
			@Override
			public Integer getNumber() {
				return random.nextInt(0, 9);
			}
		});
		System.out.println("1 numbers:\n"+numbers);
		
		// 2 Filter number list and get even numbers
		Flujo<Integer> evenNumbers = numbers.filtering(new Predicate<Integer>() {
			
			@Override
			public boolean evaluateNumber(Integer value) {
				return value%2==0;
			}
		});
		System.out.println("2 evenNumbers:\n"+evenNumbers);		
		
		// 3a Square each value of the even number list as Integer
		Flujo<Integer> transformedNumbers = evenNumbers.transforming(new OperatorUnary<Integer>() {

			@Override
			public Integer aplying(Integer value) {
				return value*value;
			}
		});
		System.out.println("3a transformedNumbers:\n"+transformedNumbers);
		
		// 3b Square each value of the even number list as String
		Flujo<String> transformedNumbersToString = evenNumbers.transforming(new Function<Integer, String>() {
			
			@Override
			public String aplying(Integer value) {
				return "Valor: "+value;
			}
		});
		System.out.println("3b transformedNumbersToString:\n"+transformedNumbersToString);
		
		// 4
		Consumer<Integer> temporalConsumer = new Consumer<Integer>() {
			
			@Override
			public void accepting(Integer value) {
				System.out.println(value);
			}
		};		
		// 4a Show new numbers in the console and returning List
		System.out.println("4a return method newNumbers:");
		Flujo<Integer> newNumbers = transformedNumbers.acting(temporalConsumer);
		// 4a Show new numbers in the console and returning nothing
		System.out.println("4b void method newNumbers:");
		transformedNumbers.consuming(temporalConsumer);
		
		// 5 Get the sum of all new numbers
		Integer total = newNumbers.reducing(0, new OperatorBinary<Integer>() {
			
			@Override
			public Integer applying(Integer value1, Integer value2) {
				return value1+value2;
			}
		});
		System.out.println("5 total:\n"+total);
*/