package app;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoizedRecursion extends FibonacciSimpleRecursion {
  private final Map<Integer, BigInteger> fibonacciSeries = new HashMap<>();

  @Override
  public BigInteger fibonacciAtPosition(int position) {
    if (!fibonacciSeries.containsKey(position)) {
      fibonacciSeries.put(position, super.fibonacciAtPosition(position));
    }

    return fibonacciSeries.get(position);
  }
}