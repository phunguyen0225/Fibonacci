package app;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public class FibonacciTest {

  @Test
  public void canary() {
    assertTrue(true);
  }

  @Test
  void imperativeFibonacci() {
    assertAll(
      () -> assertEquals(new BigInteger("1"), FibonacciImperative.fibonacciAtPosition(1)),
      () -> assertEquals(new BigInteger("2"), FibonacciImperative.fibonacciAtPosition(2)),
      () -> assertEquals(new BigInteger("8"), FibonacciImperative.fibonacciAtPosition(5)),
      () -> assertEquals(new BigInteger("89"), FibonacciImperative.fibonacciAtPosition(10)),
      () -> assertEquals(new BigInteger("20365011074"), FibonacciImperative.fibonacciAtPosition(50)),
      () -> assertEquals(new BigInteger("12200160415121876738"), FibonacciImperative.fibonacciAtPosition(92))
    );
  }

  @Test
  void functionalFibonacci() {
    assertAll(
      () -> assertEquals(new BigInteger("1"), FibonacciFunctional.fibonacciAtPosition(1)),
      () -> assertEquals(new BigInteger("2"), FibonacciFunctional.fibonacciAtPosition(2)),
      () -> assertEquals(new BigInteger("8"), FibonacciFunctional.fibonacciAtPosition(5)),
      () -> assertEquals(new BigInteger("89"), FibonacciFunctional.fibonacciAtPosition(10)),
      () -> assertEquals(new BigInteger("20365011074"), FibonacciFunctional.fibonacciAtPosition(50)),
      () -> assertEquals(new BigInteger("12200160415121876738"), FibonacciFunctional.fibonacciAtPosition(92))
    );
  }
}