package com.renzo.quickstart.java8training.zsamples01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {
		
		List<String> alumnos = 
				new ArrayList<>(Arrays.asList("Baldomero","German","Gaspar","Godolfredo"));
		alumnos.forEach(System.out::println);
	}
}
