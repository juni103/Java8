package com.lesseon1.lambda;

import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		//a simple way to write a lambda expression
		BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
	}
}
