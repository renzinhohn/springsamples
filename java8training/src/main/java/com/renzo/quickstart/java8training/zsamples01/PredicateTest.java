package com.renzo.quickstart.java8training.zsamples01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		
		List<String> alumnos = 
				new ArrayList<>(Arrays.asList("Baldomero","German","Gaspar","Godolfredo"));
		System.out.printf("Alumnos: %s\n", String.join(",", alumnos));
		alumnos.removeIf(x -> x.contains("G"));
		System.out.printf("Alumnos sin G: %s\n", String.join(",", alumnos));
	}
}
