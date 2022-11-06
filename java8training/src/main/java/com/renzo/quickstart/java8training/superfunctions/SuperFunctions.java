package com.renzo.quickstart.java8training.superfunctions;

import java.util.ArrayList;
import java.util.List;

import com.renzo.quickstart.java8training.superfunctions.interfaces.Predicate;
import com.renzo.quickstart.java8training.superfunctions.interfaces.Provider;

public class SuperFunctions {
	
	public static List<Integer> buildingNumberList(int size, Provider provider) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			result.add(provider.getNumber());
		}
		return result;
	}

	public static List<Integer> filteringNumberList(List<Integer> values, Predicate predicate) {
		List<Integer> result = new ArrayList<Integer>();
		for (Integer value : values) {
			if (predicate.evaluateNumber(value)) {
				result.add(value);
			}
		}
		return result;
	}
}
