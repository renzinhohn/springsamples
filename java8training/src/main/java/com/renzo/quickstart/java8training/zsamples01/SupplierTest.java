package com.renzo.quickstart.java8training.zsamples01;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class SupplierTest {

	public static void main(String[] args) {
		
		Map<String, Integer> puntuaciones = new ConcurrentHashMap<String, Integer>();
		puntuaciones.put("Baldomero", 100);
		puntuaciones.put("German", 90);
		puntuaciones.put("Godolfredo", 110);
		System.out.println(puntuaciones);
		
		Optional<Integer> puntuacionBaldomero = Optional.ofNullable(puntuaciones.get("Baldomero"));
		System.out.printf("Baldomero: %d\n", puntuacionBaldomero.orElseGet(
				() -> getPuntuacionPorDefecto()
				));
		
		Optional<Integer> puntuacionRodolfo = Optional.ofNullable(puntuaciones.get("Rodolfo"));
		System.out.printf("Rodolfo: %d\n", puntuacionRodolfo.orElseGet(
				() -> getPuntuacionPorDefecto()
				));
	}
	
	private static Integer getPuntuacionPorDefecto() {
		System.out.println("Obteniendo puntuacion por defecto");
		return 0;
	}
}
