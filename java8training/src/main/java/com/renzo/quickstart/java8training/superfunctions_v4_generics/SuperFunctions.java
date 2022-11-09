package com.renzo.quickstart.java8training.superfunctions_v4_generics;

import java.util.ArrayList;
import java.util.List;

import com.renzo.quickstart.java8training.superfunctions_v4_generics.interfaces.Consumer;
import com.renzo.quickstart.java8training.superfunctions_v4_generics.interfaces.Function;
import com.renzo.quickstart.java8training.superfunctions_v4_generics.interfaces.OperatorBinary;
import com.renzo.quickstart.java8training.superfunctions_v4_generics.interfaces.OperatorUnary;
import com.renzo.quickstart.java8training.superfunctions_v4_generics.interfaces.Predicate;
import com.renzo.quickstart.java8training.superfunctions_v4_generics.interfaces.Provider;

public class SuperFunctions {
	

	public static <T> List<T> filtering(List<T> values, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for (T value : values) {
			if (predicate.evaluateNumber(value)) {
				result.add(value);
			}
		}
		return result;
	}
	
	public static <T> List<T> providing(int size, Provider<T> provider) {
		List<T> result = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			result.add(provider.getNumber());
		}
		return result;
	}
	
	public static <T, R> List<R> transforming(List<T> values, Function<T, R> function) {
		List<R> result = new ArrayList<>();
		for (T value : values) {
			result.add(function.aplying(value));
		}
		return result;
	}
	
	public static <T> List<T> transformingTwo(List<T> values, OperatorUnary<T> function) {
		List<T> result = new ArrayList<>();
		for (T value : values) {
			result.add(function.aplying(value));
		}
		return result;
	}
	
	public static <T> List<T> acting(List<T> values, Consumer<T> consumer) {
		for (T value : values) {
			consumer.accepting(value);
		}
		return values;
	}
	
	public static <T> void consuming(List<T> values, Consumer<T> consumer) {
		for (T value : values) {
			consumer.accepting(value);
		}
	}
	
	public static <T> T reducing(List<T> values, T identity, OperatorBinary<T> functionBinary) {
		T total = identity;
		for (T value : values) {
			total = functionBinary.applying(total, value);
		}
		return total;
	}
}
