package com.renzo.quickstart.java8codechallenges;

/* BinarySearch Sum of odd numbers
 */
public class EjercicioC2 {
	public static int solve(final int n) {
        int sum = 0;
        for (int i = 1; i < n + 1; ++i) {
            final int tmp = 2 * i - 1;
            if (tmp % 2 != 0) {
                System.out.println("tmp " + tmp);
                sum += tmp;
            }
        }
        return sum;
    }
    
    public static void main(final String[] args) {
        final double a = Math.log10(1000.0);
        System.out.println(a);
    }
}
