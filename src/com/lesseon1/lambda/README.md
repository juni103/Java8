

# Lesson 1 (Lamda expressions and method references)



#### Writing lambda expressions

- **BiFunction<T, U, R>**

   is an interface representing function with two arguments of types T and U. It returns value of type R.

- **Function<T, R>**

   is also a special interface but it has only one argument of type T and returns value of type R.

#### Writing method references

Another way to use code as data is writing method references.

Let's see some examples:

- reference to a static method

  `Function<Double, Double> sqrt = Math::sqrt;`

- reference to a non static method

  `BiFunction<Double, Double, Double> multip = calculator::mult;`

  where calculator is an instance of custom _Calculator_ class and _mult_ is a method that multiplies two doubles and returns the double result.

- reference to a constructor of String class

  `Supplier<String> generator = String::new;`

  as you can see, in this case, the method reference is more readable than the same lambda expression.

  `Supplier<String> generator = () -> new String();`

#### Usage of closures

In the body of a lambda expression we can capture values from a context where the lambda is defined. This technique is called **closure**.

Let's see an example

`final String hello = "Hello, ";`,<br/>
`Function<String, String> helloFunction = (name) -> `**hello**` + name;`

`System.out.println(helloFunction.apply("John")); System.out.println(helloFunction.apply("Anastasia"));`

The lambda expression captured the final variable **hello**.

The result of this code.

`Hello, John1`<br/>
`Hello, Anastasia`
