package com.renzo.quickstart.java8training.superfunctions_v6_lambdas.interfaces;

@FunctionalInterface
public interface FunctionBinary<T, U, R> {

	R applying(T value1, U value2);

}
