package com.lesseon2.functionsareobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class ComposeFunction {

	public static final Integer VAL1 = 10;
	public static final Integer VAL2 = 5;

	static {
		System.out.println("============== Function composition ===============");
	}

	public void componseFunction() {

		Function<Integer, Integer> adder = x -> x + VAL1;
		Function<Integer, Integer> multiplier = x -> x * VAL2;

		System.out.println("resutl: " + adder.compose(multiplier).apply(VAL2) );
		System.out.println("resutl: " + adder.andThen(multiplier).apply(VAL2) );

	}

	public void composePredicate() {

		List<Integer> numbers = new ArrayList<Integer>();
		for(int i = 1; i <= 30; i++) {
			numbers.add(i);
		}

		IntPredicate isEven = x -> x % 2 == 0;
		IntPredicate dividedBy3 = x -> x % 3 == 0;
		IntPredicate pred = isEven.negate().or(dividedBy3);

		numbers.forEach(val -> {
			if( pred.test(val) )
				System.out.println( val + " " + "done." );
		});
	}

}
