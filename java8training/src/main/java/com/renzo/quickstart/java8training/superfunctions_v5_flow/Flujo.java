package com.renzo.quickstart.java8training.superfunctions_v5_flow;

import java.util.ArrayList;
import java.util.List;

import com.renzo.quickstart.java8training.superfunctions_v5_flow.interfaces.Consumer;
import com.renzo.quickstart.java8training.superfunctions_v5_flow.interfaces.Function;
import com.renzo.quickstart.java8training.superfunctions_v5_flow.interfaces.OperatorBinary;
import com.renzo.quickstart.java8training.superfunctions_v5_flow.interfaces.OperatorUnary;
import com.renzo.quickstart.java8training.superfunctions_v5_flow.interfaces.Predicate;
import com.renzo.quickstart.java8training.superfunctions_v5_flow.interfaces.Provider;

public class Flujo<T> {
	
	private final List<T> valores;
	
	public Flujo(List<T> valores) {
		this.valores=valores;
	}	

	public static <T> Flujo<T> providing(int size, Provider<T> provider) {
		List<T> result = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			result.add(provider.getNumber());
		}
		return new Flujo<>(result);
	}

	public Flujo<T> filtering(Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for (T value : valores) {
			if (predicate.evaluateNumber(value)) {
				result.add(value);
			}
		}
		return new Flujo<>(result);
	}
	
	public <R> Flujo<R> transforming(Function<T, R> function) {
		List<R> result = new ArrayList<>();
		for (T value : valores) {
			result.add(function.aplying(value));
		}
		return new Flujo<>(result);
	}
	
	public Flujo<T> transformingTwo(OperatorUnary<T> function) {
		List<T> result = new ArrayList<>();
		for (T value : valores) {
			result.add(function.aplying(value));
		}
		return new Flujo<>(result);
	}
	
	public Flujo<T> acting(Consumer<T> consumer) {
		for (T value : valores) {
			consumer.accepting(value);
		}
		return new Flujo<>(valores);
	}
	
	public void consuming(Consumer<T> consumer) {
		for (T value : valores) {
			consumer.accepting(value);
		}
	}
	
	public T reducing(T identity, OperatorBinary<T> functionBinary) {
		T total = identity;
		for (T value : valores) {
			total = functionBinary.applying(total, value);
		}
		return total;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return valores.toString();
	}
}
