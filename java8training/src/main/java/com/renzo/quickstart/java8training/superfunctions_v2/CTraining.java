package com.renzo.quickstart.java8training.superfunctions_v2;

import java.util.List;
import java.util.Random;

import com.renzo.quickstart.java8training.superfunctions_v2.interfaces.Consumer;
import com.renzo.quickstart.java8training.superfunctions_v2.interfaces.Function;
import com.renzo.quickstart.java8training.superfunctions_v2.interfaces.FunctionBinary;
import com.renzo.quickstart.java8training.superfunctions_v2.interfaces.Predicate;
import com.renzo.quickstart.java8training.superfunctions_v2.interfaces.Provider;

public class CTraining {
	
	public static void main(String[] args) {
		new CTraining();
	}
	
	public CTraining() {
		// What we want to do
		// 1 Build number list
		List<Integer> numbers = SuperFunctions.providing(10, new Provider() {
			Random random = new Random();
			
			@Override
			public int getNumber() {
				return random.nextInt(0, 9);
			}
		});
		System.out.println(numbers);
		// 2 Filter number list and get even numbers
		List<Integer> evenNumbers = SuperFunctions.filtering(numbers, new Predicate() {
			
			@Override
			public boolean evaluateNumber(Integer value) {
				return value%2==0;
			}
		});
		System.out.println(evenNumbers);
		// 3 Square each value of the even number list
		List<Integer> transformedNumbers = SuperFunctions.transforming(evenNumbers, new Function() {
			
			@Override
			public Integer aplying(Integer value) {
				// TODO Auto-generated method stub
				return value*value;
			}
		});
		System.out.println(transformedNumbers);
		
		
		Consumer temporalConsumer = new Consumer() {
			
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
		int total = SuperFunctions.reducing(newNumbers, 0, new FunctionBinary() {
			
			@Override
			public int applying(Integer value1, Integer value2) {
				return value1+value2;
			}
		});
		System.out.println(total);
		
	}
	
}
