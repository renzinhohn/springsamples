package com.renzo.quickstart.java8training.zsamples01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FunctionTest {

	public static void main(String[] args) {

		Map<String, Integer> puntuaciones = new ConcurrentHashMap<String, Integer>();
		puntuaciones.put("Baldomero", 100);
		puntuaciones.put("German", 90);
		puntuaciones.put("Godolfredo", 110);
		System.out.println(puntuaciones);
		puntuaciones.computeIfAbsent("Rodolfo", FunctionTest::initPuntuacion);
		puntuaciones.computeIfAbsent("Micky", FunctionTest::initPuntuacion);
		System.out.println(puntuaciones);
		
	}
	
	private static Integer initPuntuacion(String nombre) {
		System.out.printf("Inicializando la puntuacion de %s\n", nombre);
		return 0;
	}
}
