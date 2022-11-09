package com.renzo.quickstart.java8training.superfunctions_v2_classes;

import java.util.List;

import com.renzo.quickstart.java8training.superfunctions_v2_classes.classes.ConsumingPrinting;
import com.renzo.quickstart.java8training.superfunctions_v2_classes.classes.FilteringOnlyEven;
import com.renzo.quickstart.java8training.superfunctions_v2_classes.classes.ProvidingNaturalNumbers;
import com.renzo.quickstart.java8training.superfunctions_v2_classes.classes.ReducingSummingAll;
import com.renzo.quickstart.java8training.superfunctions_v2_classes.classes.TransformingToTheThirdPower;

public class BTraining {
	
	public static void main(String[] args) {
		new BTraining();
	}
	
	public BTraining() {
		// What we want to do
		// 1 Build number list
		List<Integer> numbers = SuperFunctions.providing(10, new ProvidingNaturalNumbers());
		System.out.println(numbers);
		// 2 Filter number list and get even numbers
		List<Integer> evenNumbers = SuperFunctions.filtering(numbers, new FilteringOnlyEven());
		System.out.println(evenNumbers);
		// 3 Square each value of the even number list
		List<Integer> transformedNumbers = SuperFunctions.transforming(evenNumbers, new TransformingToTheThirdPower());
		System.out.println(transformedNumbers);
		// 4a Show new numbers in the console and returning List
		List<Integer> newNumbers = SuperFunctions.acting(transformedNumbers, new ConsumingPrinting());
		// 4a Show new numbers in the console and returning nothing
		SuperFunctions.consuming(transformedNumbers, new ConsumingPrinting());
		// 5 Get the sum of all new numbers
		int total = SuperFunctions.reducing(newNumbers, 0, new ReducingSummingAll());
		System.out.println(total);
		
	}
	
}
