package com.renzo.quickstart.java8codechallenges;

/* BinarySearch Reversing the order of words in a sentence
 */
public class EjercicioD {
	public static String solve(final String sentence) {
        final String[] tmpArray = sentence.split(" ");
        StringBuffer result = new StringBuffer();
        for (int i = tmpArray.length - 1; i >= 0; --i) {
            result = result.append(tmpArray[i]);
            if (i > 0) {
                result = result.append(" ");
            }
        }
        return result.toString();
    }
    
    public static void main(final String[] args) {
        final String sentence = "hello there my friend";
        System.out.println(solve(sentence));
    }
}
