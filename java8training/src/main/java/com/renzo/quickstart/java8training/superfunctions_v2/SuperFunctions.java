package com.renzo.quickstart.java8training.superfunctions_v2;

import java.util.ArrayList;
import java.util.List;

import com.renzo.quickstart.java8training.superfunctions_v2.interfaces.Consumer;
import com.renzo.quickstart.java8training.superfunctions_v2.interfaces.Function;
import com.renzo.quickstart.java8training.superfunctions_v2.interfaces.FunctionBinary;
import com.renzo.quickstart.java8training.superfunctions_v2.interfaces.Predicate;
import com.renzo.quickstart.java8training.superfunctions_v2.interfaces.Provider;

public class SuperFunctions {
	
	public static List<Integer> providing(int size, Provider provider) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			result.add(provider.getNumber());
		}
		return result;
	}

	public static List<Integer> filtering(List<Integer> values, Predicate predicate) {
		List<Integer> result = new ArrayList<>();
		for (Integer value : values) {
			if (predicate.evaluateNumber(value)) {
				result.add(value);
			}
		}
		return result;
	}
	
	public static List<Integer> transforming(List<Integer> values, Function function) {
		List<Integer> result = new ArrayList<>();
		for (Integer value : values) {
			result.add(function.aplying(value));
		}
		return result;
	}
	
	public static List<Integer> acting(List<Integer> values, Consumer consumer) {
		for (Integer value : values) {
			consumer.accepting(value);
		}
		return values;
	}
	
	public static void consuming(List<Integer> values, Consumer consumer) {
		for (Integer value : values) {
			consumer.accepting(value);
		}
	}
	
	public static Integer reducing(List<Integer> values, Integer identity, FunctionBinary functionBinary) {
		int total = identity;
		for (Integer value : values) {
			total = functionBinary.applying(total, value);
		}
		return total;
	}
}
