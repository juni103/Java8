<h3>Lesson 1 (Lamda expressions and method references)</h3>
<ul>
  <ol>
    <h4>Writing lambda expressions</h4>
    <ul>
      <li>
        <p>
          <b><code>BiFunction<T, U, R></code></b> is an interface representing function with two arguments of types T and U. It returns value of type R.
        </p>
      </li>
      <li>
        <p>
          <b><code>Function<T, R></code></b> s also a special interface but it has only one argument of type T and returns value of type R.
        </p>
      </li>
    </ul>
  </ol>
  <ol>
    <h4>Writing method references</h4>
    <p>Another way to use code as data is writing method references.</p>
    <p>Let's see some examples:</p>
    <ul>
      <li>
        <p>reference to a static method</p>
        <p><code>Function<Double, Double> sqrt = Math::sqrt;</code></p>
      </li>
      <li>
        <p>reference to a non static method</p>
        <p>
          <code>BiFunction<Double, Double, Double> multip = calculator::mult;</code>
        </p>
        <p>where calculator is an instance of custom <i>Calculator</i> class and <i>mult</i> is a method that multiplies two doubles and returns the double result.</p>
      </li>
      <li>
        <p>reference to a constructor of String class</p>
        <p><code>Supplier<String> generator = String::new;</code></p>
        <p>as you can see, in this case, the method reference is more readable than the same lambda expression.</p>
        <p>
          <code>Supplier<String> generator = () -> new String();</code>
        </p>
      </li>
    </ul>
  </ol>
  <ol>
    <h4>Usage of closures</h4>
    <p>In the body of a lambda expression we can capture values from a context where the lambda is defined. This technique is called <b>closure</b>.</p>
    <p>Let's see an example</p>
    <p>
      <code>
        final String hello = "Hello, ";
        Function <String, String> helloFunction = (name) -> <b>hello</b> + name;
      </code>
      <br></br>
      <code>
        System.out.println(helloFunction.apply("John"));
        System.out.println(helloFunction.apply("Anastasia"));
      </code>
    </p>
    <p>The lambda expression captured the final variable <b>hello</b>.</p>
    <p>The result of this code.</p>
    <p>Hello, John</p>
    <p>Hello, Anastasia</p>
  </ol>
</ul>
