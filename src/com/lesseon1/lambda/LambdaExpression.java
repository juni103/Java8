package com.lesseon1.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaExpression {

	private static final Integer FIRST_VAL = 20;
	private static final Integer SECOND_VAL = 30;

	public void test() {
		// a simple way to write a lambda expression
		BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
		System.out.println("SUM: " + sum.apply(FIRST_VAL, SECOND_VAL));

		// if the only one argument
		Function<Integer, Integer> identity = x -> x; // (x) -> x; is valid too
		System.out.println( "IDENTITY: " + identity.apply(FIRST_VAL) );

		// without the interface
		Function<Integer, Integer> mult = (Integer x) -> x * 2;
		System.out.println( "MULTIPLY: " + mult.apply(FIRST_VAL) );

		// with multiple statements
		Function<Integer, Integer> adder = (x) -> {
			x += 5;
			x += 10;
			return x;
		};

		System.out.println( "ADDER: " + adder.apply(FIRST_VAL) );
	}
}
