package app;

import java.math.BigInteger;
import java.util.stream.Stream;

public interface FibonacciFunctional {
  static BigInteger fibonacciAtPosition (int position) {
    return Stream.iterate(new BigInteger[] {BigInteger.ONE, BigInteger.ONE}, f -> new BigInteger[] { f[1], f[0].add(f[1])})
      .limit(position)
      .reduce((a, b) -> b)
      .get()[1];
  }
}
