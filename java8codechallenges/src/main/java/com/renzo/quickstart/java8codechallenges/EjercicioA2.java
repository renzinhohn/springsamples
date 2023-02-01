package com.renzo.quickstart.java8codechallenges;

/* Cracking the Coding Interview : 189 Programming Questions and Solutions
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2blc5a3.
 * If the "compressed" string would not become smaller than the original string, your method should return the original string.
 */
public class EjercicioA2 {
	public static String comprimiendo(final String cadena) {
        final StringBuffer sbNuevaCadena = new StringBuffer();
        char caracter = cadena.charAt(0);
        int contador = 1;
        for (int i = 1; i <= cadena.length(); ++i) {
            if (i != cadena.length() && cadena.charAt(i) == caracter) {
                ++contador;
            }
            else {
                sbNuevaCadena.append(caracter);
                sbNuevaCadena.append(contador);
                contador = 1;
                if (i == cadena.length()) {
                    break;
                }
                caracter = cadena.charAt(i);
            }
        }
        if (sbNuevaCadena.length() < cadena.length()) {
            return sbNuevaCadena.toString();
        }
        return cadena;
    }
    
    public static void main(final String[] args) {
        final String s = "aabcccccaaa******   ";
        System.out.print(comprimiendo(s));
    }
}
