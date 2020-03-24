package io.mosfet.playground.jqwik.examples.kata;

import net.jqwik.api.*;

/**
 * Created with love.
 * User: mosfet
 * Date: 25/03/20
 * github: kmos
 * twitter: nmosf
 */
class FizzBuzzPBTest {

  @Property
  boolean everyNumberDivisibleByThreeIsFizz(@ForAll("divisibleOnlyBy3") int i) {
    return "fizz".equals(new FizzBuzz(i).print());
  }

  @Property
  boolean everyNumberDivisibleByFiveIsBuzz(@ForAll("divisibleOnlyBy5") int i) {
    return "buzz".equals(new FizzBuzz(i).print());
  }

  @Property
  boolean everyNumberDivisibleByFiveAndThreeIsFizzBuzz(@ForAll("divisibleBy3And5") int i) {
    return "fizzBuzz".equals(new FizzBuzz(i).print());
  }

  @Provide
  Arbitrary<Integer> divisibleOnlyBy3() {
    return Arbitraries.integers().between(1, 100).filter(i -> i % 3 == 0 && i % 5 != 0);
  }

  @Provide
  Arbitrary<Integer> divisibleOnlyBy5() {
    return Arbitraries.integers().between(1, 100).filter(i -> i % 5 == 0 && i % 3 != 0);
  }

  @Provide
  Arbitrary<Integer> divisibleBy3And5() {
    return Arbitraries.integers().between(1, 100).filter(i -> i % 5 == 0 && i % 3 == 0);
  }

}
