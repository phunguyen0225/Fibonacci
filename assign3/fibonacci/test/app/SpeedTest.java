package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpeedTest {
  @Test
  public void compareSimpleAndMemoizedRecursion() {
    long startTimeSimple = System.nanoTime();
    new FibonacciSimpleRecursion();
    long endTimeSimple = System.nanoTime();

    long timeTakenSimple = endTimeSimple - startTimeSimple;

    long startTimeMemoized = System.nanoTime();
    new FibonacciMemoizedRecursion();
    long endTimeMemoized = System.nanoTime();

    long timeTakenMemoized = (endTimeMemoized - startTimeMemoized);

    assertTrue(timeTakenSimple > timeTakenMemoized);
  }
}
