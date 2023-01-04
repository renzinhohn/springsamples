package com.renzo.quickstart.java8training.zsamples01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		
		List<String> alumnos = 
				new ArrayList<>(Arrays.asList("Baldomero","German","Gino","Godolfredo"));
		System.out.printf("Alumnos: %s\n", String.join(", ", alumnos));
		alumnos.sort(
				(alumno1, alumno2) -> alumno1.length() - alumno2.length()
				);
		System.out.printf("Alumnos ordenados por longitud de nombre: %s\n", String.join(", ", alumnos));
	}
}
