package app;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public interface FibonacciImperative {

  static BigInteger fibonacciAtPosition(int position) {
    List<BigInteger> values = new ArrayList<BigInteger>() {{
      add(BigInteger.ONE);
      add(BigInteger.ONE);
    }};

    for (int i = 2; i <= position; i++) {
      values = List.of(values.get(1), values.get(0).add(values.get(1)));
    }

    return values.get(1);
  }
}