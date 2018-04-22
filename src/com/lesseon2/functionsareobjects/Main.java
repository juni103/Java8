package com.lesseon2.functionsareobjects;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Fun<Double, Double> fun = (x) -> x * 2;
		System.out.println(fun.apply(20d));

		// Callback
		System.out.println("========== CALLBACK ============");
		List<String> fruits = Arrays.asList("apple", "pear", "orange", "banana");
		fruits.forEach(System.out::println);

		fruits.forEach(fruite -> {
			String doubleFruite = fruite.concat(fruite).toUpperCase();
			if(doubleFruite.length() > 10) {
				System.out.println(doubleFruite);
			}
		});

		System.out.println("========== ****** ============");

		ComposeFunction composition = new ComposeFunction();
		composition.componseFunction();
		composition.composePredicate();

		System.out.println("=============== ***** =================");
	}
}
