package app;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.IntStream;

public class FibonacciFunctional implements Fibonacci {
  @Override
  public BigInteger fibonacciAtPosition(int position) {
    return IntStream.range(1, position)
      .mapToObj(values -> List.of(BigInteger.ONE, BigInteger.ONE))
      .reduce(List.of(BigInteger.ONE, BigInteger.ONE), (values, ignore) -> List.of(values.get(1), values.get(0).add(values.get(1))))
      .get(1);
  }
}
