package com.lesseon1.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// a simple way to write a lambda expression
		BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;

		// if the only one argument
		Function<Integer, Integer> identity = x -> x; // (x) -> x; is valid too

		// without the interface
		Function<Integer, Integer> mult = (Integer x) -> x * 2;

		// with multiple statements
		Function<Integer, Integer> adder = (x) -> {
			x += 5;
			x += 10;
			return x;
		};
	}
}
