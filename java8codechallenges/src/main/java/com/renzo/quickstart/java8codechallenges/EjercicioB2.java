package com.renzo.quickstart.java8codechallenges;

/* Cracking the Coding Interview : 189 Programming Questions and Solutions
 * This is solution to problem 1.1
 * Question: Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 */
public class EjercicioB2 {
	
	public static boolean chequeandoSiTieneCaracteresUnicos(final String s) {
        for (int i = 1; i < s.length(); ++i) {
            for (int j = 0; j < i; ++j) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(final String[] args) {
        final String ss = "holaaaa";
        System.out.println("la cadena es " + ss);
        if (chequeandoSiTieneCaracteresUnicos(ss)) {
            System.out.println("todos son unicos");
        }
        else {
            System.out.println("no, hay valores duplicados");
        }
    }
}
