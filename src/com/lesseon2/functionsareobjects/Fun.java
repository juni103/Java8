package com.lesseon2.functionsareobjects;

@FunctionalInterface
public interface Fun<T, R> {

	R apply(T t);

	static void doNothingStatic() {}
	default void doNothingByDefault() {}
}
