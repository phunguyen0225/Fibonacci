package app;

import java.math.BigInteger;

public class FibonacciSimpleRecursion implements Fibonacci{
  @Override
  public BigInteger fibonacciAtPosition(int position) {
    return (position < 2) ? BigInteger.ONE :
      fibonacciAtPosition(position - 1).add(fibonacciAtPosition(position - 2));
  }
}