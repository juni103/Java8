# Lesson 2 (Functions are Objects)

#### Functional interface

**Functional interface** is an interface with a single abstract method (SAM type). Static and default methods are allowed here. Any functional interface can be implemented using lambda expressions, ,methods references and anonymous classes.

Examples: **Runnable, Callback<V>, Comparator<T>, ActionListener** and others.

**IMPORTANT:** you can't extend class (even abstract), enum or annotation by a lambda expression or a method reference.

There is a special annotation **@FunctionalInterface** exists in **The Java Class Library**. It marks functional interfaces and indicates if the interface doesn't satisfy the requirements of a functional interface. The annotation is not mandatory for creating lambda expressions but it's recommended to mark functional interface.

**continue...**

#### The _java.util.function package_

Since java 8 JCL has a lot of functional interfaces that represent functions. The package contains more than 40 functional interfaces of five groups: **functions, operators, predicated, suppliers** and **consumers.**

Let's consider these groups.

- **Functions** accepts arguments and produce results.
- **Operators** preduce results of the same type as their arguments (special case of function).
- **Predicates** return boolean values and accept any arguments (boolean-valued function).
- **Suppliers** return values and accept nothing.
- **Consumers** accept arguments and return no result.

Main differences between functional interfaces in the same group are number of arguments and generic or not.

Some examples:

- **Function<T,R>**
- **BiFunction<T, U, R>**
- **LongFunction<R>**
- **IntToDoubleFunction**
- **IntPredicate**
- **Supplier< T>**
