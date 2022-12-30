package com.renzo.quickstart.java8training.zrenzinho.interfaces;

@FunctionalInterface
public interface Auto {
	public default Integer defaultMethod() {
		return null;
	}
	public static Integer staticMethod() {
		return null;
	}
	public abstract Integer running();
}