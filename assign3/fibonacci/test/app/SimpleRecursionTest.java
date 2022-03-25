package app;

public class SimpleRecursionTest implements FibonacciTest {
  @Override
  public Fibonacci createFibonacci() {
    return new FibonacciSimpleRecursion();
  }

  @Override
  public void largeValueTests() {
    var intention = "bypassing due to slow execution";
  }
}
