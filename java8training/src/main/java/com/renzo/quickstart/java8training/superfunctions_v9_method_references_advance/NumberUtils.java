package com.renzo.quickstart.java8training.superfunctions_v9_method_references_advance;

public class NumberUtils {

	public static boolean esPrimo(int value) {
		for (int i=2; i<value; i++) {
			if (value%i==0) {
				return false;
			}								
		}
		return true;
	}
	
	public static int elevarAlCuadrado(int value) {
		return value*value;
	}
}
