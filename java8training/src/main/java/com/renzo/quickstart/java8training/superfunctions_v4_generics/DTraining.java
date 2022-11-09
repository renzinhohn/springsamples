package com.renzo.quickstart.java8training.superfunctions_v4_generics;

import java.util.List;
import java.util.Random;

import com.renzo.quickstart.java8training.superfunctions_v4_generics.interfaces.Consumer;
import com.renzo.quickstart.java8training.superfunctions_v4_generics.interfaces.Function;
import com.renzo.quickstart.java8training.superfunctions_v4_generics.interfaces.OperatorBinary;
import com.renzo.quickstart.java8training.superfunctions_v4_generics.interfaces.OperatorUnary;
import com.renzo.quickstart.java8training.superfunctions_v4_generics.interfaces.Predicate;
import com.renzo.quickstart.java8training.superfunctions_v4_generics.interfaces.Provider;

public class DTraining {
	
	public static void main(String[] args) {
		new DTraining();
	}
	
	public DTraining() {
		// What we want to do
		// 1 Build number list
		List<Integer> numbers = SuperFunctions.providing(10, new Provider<Integer>() {
			Random random = new Random();
			
			@Override
			public Integer getNumber() {
				return random.nextInt(0, 9);
			}
		});
		System.out.println(numbers);
		
		// 2 Filter number list and get even numbers
		List<Integer> evenNumbers = SuperFunctions.filtering(numbers, new Predicate<Integer>() {
			
			@Override
			public boolean evaluateNumber(Integer value) {
				return value%2==0;
			}
		});
		System.out.println(evenNumbers);
		
		// 3 Square each value of the even number list
//		List<Integer> transformedNumbers = SuperFunctions.transforming(evenNumbers, new OperatorUnary<Integer>() {
//
//			@Override
//			public Integer aplying(Integer value) {
//				// TODO Auto-generated method stub
//				return value*value;
//			}
//		});
		List<Integer> transformedNumbers = SuperFunctions.transforming(evenNumbers, new Function<Integer, Integer>() {

			@Override
			public Integer aplying(Integer value) {
				// TODO Auto-generated method stub
				return value*value;
			}
		});
		System.out.println(transformedNumbers);
		
		
		List<String> transformedToString = SuperFunctions.transforming(evenNumbers, new Function<Integer, String>() {

			@Override
			public String aplying(Integer value) {
				// TODO Auto-generated method stub
				return "Value: "+value;
			}
		});
		System.out.println(transformedToString);
		
		// 4
		Consumer<Integer> temporalConsumer = new Consumer<Integer>() {
			
			@Override
			public void accepting(Integer value) {
				System.out.println(value);
			}
		};		
		// 4a Show new numbers in the console and returning List
		List<Integer> newNumbers = SuperFunctions.acting(transformedNumbers, temporalConsumer);
		// 4a Show new numbers in the console and returning nothing
		SuperFunctions.consuming(transformedNumbers, temporalConsumer);
		
		// 5 Get the sum of all new numbers
		Integer total = SuperFunctions.reducing(newNumbers, 0, new OperatorBinary<Integer>() {
			
			@Override
			public Integer applying(Integer value1, Integer value2) {
				return value1+value2;
			}
		});
		System.out.println(total);
		
	}
	
}
