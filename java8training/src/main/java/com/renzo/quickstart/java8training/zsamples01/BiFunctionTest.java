package com.renzo.quickstart.java8training.zsamples01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BiFunctionTest {

	public static void main(String[] args) {

		Map<String, Integer> puntuaciones = new ConcurrentHashMap<String, Integer>();
		puntuaciones.put("Baldomero", 100);
		puntuaciones.put("German", 90);
		puntuaciones.put("Godolfredo", 110);
		System.out.println(puntuaciones);
		puntuaciones.computeIfPresent("Rodolfo", BiFunctionTest::incrementaPuntuacion);
		puntuaciones.computeIfPresent("Baldomero", BiFunctionTest::incrementaPuntuacion);
		System.out.println(puntuaciones);
		
	}
	
	private static Integer incrementaPuntuacion(String key, Integer value) {
		System.out.printf("Incrementando la puntuacion de %s\n", key);
		return value + key.length();
	}
}
