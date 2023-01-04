package com.renzo.quickstart.java8training.zsamples00.interfaces;

@FunctionalInterface
public interface OperacionBinariaEntera {
	public default int defaultMethod() {
		return (Integer) null;
	}
	public static int staticMethod() {
		return (Integer) null;
	}
	public abstract int operar(int valor1, int valor2);
}