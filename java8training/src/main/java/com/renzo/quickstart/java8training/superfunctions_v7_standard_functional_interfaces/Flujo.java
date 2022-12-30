package com.renzo.quickstart.java8training.superfunctions_v7_standard_functional_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

//import com.renzo.quickstart.java8training.superfunctions_v7_standard_functional_interfaces.interfaces.Consumer;
//import com.renzo.quickstart.java8training.superfunctions_v7_standard_functional_interfaces.interfaces.Function;
//import com.renzo.quickstart.java8training.superfunctions_v7_standard_functional_interfaces.interfaces.OperatorBinary;
//import com.renzo.quickstart.java8training.superfunctions_v7_standard_functional_interfaces.interfaces.OperatorUnary;
//import com.renzo.quickstart.java8training.superfunctions_v7_standard_functional_interfaces.interfaces.Predicate;
//import com.renzo.quickstart.java8training.superfunctions_v7_standard_functional_interfaces.interfaces.Provider;

public class Flujo<T> {
	
	private final List<T> valores;
	
	public Flujo(List<T> valores) {
		this.valores=valores;
	}	

	public static <T> Flujo<T> providing(int size, Supplier<T> provider) {
		List<T> result = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			result.add(provider.get());
		}
		return new Flujo<>(result);
	}

	public Flujo<T> filtering(Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for (T value : valores) {
			if (predicate.test(value)) {
				result.add(value);
			}
		}
		return new Flujo<>(result);
	}
	
	public <R> Flujo<R> transforming(Function<T, R> function) {
		List<R> result = new ArrayList<>();
		for (T value : valores) {
			result.add(function.apply(value));
		}
		return new Flujo<>(result);
	}
	
	public Flujo<T> transformingTwo(UnaryOperator<T> function) {
		List<T> result = new ArrayList<>();
		for (T value : valores) {
			result.add(function.apply(value));
		}
		return new Flujo<>(result);
	}
	
	public Flujo<T> acting(Consumer<T> consumer) {
		for (T value : valores) {
			consumer.accept(value);
		}
		return new Flujo<>(valores);
	}
	
	public void consuming(Consumer<T> consumer) {
		for (T value : valores) {
			consumer.accept(value);
		}
	}
	
	public T reducing(T identity, BinaryOperator<T> functionBinary) {
		T total = identity;
		for (T value : valores) {
			total = functionBinary.apply(total, value);
		}
		return total;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return valores.toString();
	}
}
