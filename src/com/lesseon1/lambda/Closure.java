package com.lesseon1.lambda;

import java.util.function.Function;

public class Closure {

	// Usage of closure
	public void closure() {
		int constant = 100;

		Function<Integer, Integer> adder = x -> x + constant;
		System.out.println(adder.apply(200));
		System.out.println(adder.apply(300));
	}
}
