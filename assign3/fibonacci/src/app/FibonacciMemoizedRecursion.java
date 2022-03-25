package app;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoizedRecursion extends FibonacciSimpleRecursion {
  private static final Map<Integer, BigInteger> memoizedStorage = new HashMap<>();

  @Override
  public BigInteger fibonacciAtPosition(int position) {
    if (memoizedStorage.containsKey(position)) {
      return memoizedStorage.get(position);
    }

    BigInteger result = super.fibonacciAtPosition(position);

    memoizedStorage.put(position, result);

    return result;
  }
}
