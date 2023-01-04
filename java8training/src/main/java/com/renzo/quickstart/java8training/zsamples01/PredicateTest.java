package com.renzo.quickstart.java8training.zsamples01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		List<String> alumnos = 
				new ArrayList<>(Arrays.asList("Baldomero","German","Gaspar","Godolfredo", "Americo"));
		System.out.printf("Alumnos: %s\n", String.join(", ", alumnos));
		alumnos.removeIf(x -> x.contains("G"));
		System.out.printf("Alumnos sin G: %s\n", String.join(", ", alumnos));
		
		Predicate<Integer> p1 = x -> x > 7;
		Predicate<Integer> p2 = x -> x%2 == 1;
		System.out.println(
				p1
				.and(p2)
				.negate()
				.test(8)
				);
	}
}
