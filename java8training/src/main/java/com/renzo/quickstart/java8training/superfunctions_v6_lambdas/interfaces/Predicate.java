package com.renzo.quickstart.java8training.superfunctions_v6_lambdas.interfaces;

@FunctionalInterface
public interface Predicate<T> {

	boolean evaluateNumber(T value);
}
