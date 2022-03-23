package app;

public class SimpleRecursionTest implements FibonacciTest {
  @Override
  public Fibonacci createFibonacci() {
    return new FibonacciSimpleRecursion();
  }
}
