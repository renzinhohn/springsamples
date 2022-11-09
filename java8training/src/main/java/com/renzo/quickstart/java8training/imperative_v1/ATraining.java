package com.renzo.quickstart.java8training.imperative_v1;

import java.util.ArrayList;
import java.util.List;

public class ATraining {
	
	private final static Integer NUMBER_TWO=2;
	
	public static void main(String[] args) {
		new ATraining();
	}
	
	public ATraining() {
		// What we want to do
		// 1 Build number list
		List<Integer> numbers = buildingFibonacciNumbers();
		System.out.println(numbers);
		// 2 Filter number list and get even numbers
		List<Integer> evenNumbers = filteringEvenNumbers(numbers);
		System.out.println(evenNumbers);
		// 3 Square each value of the even number list
		List<Integer> squareNumbers = squaringNumbers(evenNumbers);
		System.out.println(squareNumbers);
		// 4 Show new numbers
		List<Integer> newNumbers = showingNewNumbers(squareNumbers);
		// 5 Get the sum of all new numbers
		int total = summingNumbers(newNumbers);
		System.out.println(total);
		
	}

	private List<Integer> buildingFibonacciNumbers() {
		return List.of(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
	}
	
	private List<Integer> filteringEvenNumbers(List<Integer> numbers) {
		List<Integer> result = new ArrayList<>();
		
		for (Integer number : numbers) {
			if (number%2 == 0)
				result.add(number);
		}
		return result;
	}
	
	private List<Integer> squaringNumbers(List<Integer> evenNumbers) {
		List<Integer> result = new ArrayList<>();
		
		for (Integer number : evenNumbers) {
			result.add( (int)Math.pow( (double)number, (double)NUMBER_TWO) );
		}
		return result;
	}
	
	private List<Integer> showingNewNumbers(List<Integer> squareNumbers) {
		
		for (Integer number : squareNumbers) {
			System.out.println(number);
		}
		return squareNumbers;
	}
	
	private int summingNumbers(List<Integer> newNumbers) {
		int result=0;
		for (Integer number : newNumbers) {
			result=result+number;
		}
		return result;
	}
}
