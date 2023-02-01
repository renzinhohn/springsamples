package com.renzo.quickstart.java8codechallenges;

/* Cracking the Coding Interview : 189 Programming Questions and Solutions
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2blc5a3.
 * If the "compressed" string would not become smaller than the original string, your method should return the original string.
 */
public class EjercicioA1 {	
	public static String comprimiendo(final String cadena) {
        if (cadena.length() < 3) {
            return cadena;
        }
        final int cadenaLongitud = cadena.length();
        int contadorA = 0;
        int contadorB = 0;
        final char[] salida = new char[cadenaLongitud + 1];
        salida[contadorB++] = cadena.charAt(0);
        salida[contadorB++] = '1';
        for (contadorA = 1; contadorA < cadenaLongitud && contadorB < cadenaLongitud; ++contadorA) {
            if (cadena.charAt(contadorA) == cadena.charAt(contadorA - 1) && salida[contadorB - 1] != '9') {
                final char[] array = salida;
                final int n = contadorB - 1;
                ++array[n];
            }
            else {
                salida[contadorB++] = cadena.charAt(contadorA);
                salida[contadorB++] = '1';
            }
        }
        if (contadorA == cadenaLongitud && contadorB < cadenaLongitud) {
            return new String(salida, 0, contadorB);
        }
        return cadena;
    }
	
	public static void main(String[] args) {
		System.out.println(comprimiendo("aabcccccaaa"));
	}
}
