package app;

public class MemoizedRecursionTest implements FibonacciTest {
  @Override
  public Fibonacci createFibonacci() {
    return new FibonacciMemoizedRecursion();
  }
}
