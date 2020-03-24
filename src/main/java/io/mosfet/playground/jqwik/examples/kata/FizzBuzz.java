package io.mosfet.playground.jqwik.examples.kata;

/**
 * Created with love.
 * User: mosfet
 * Date: 25/03/20
 * github: kmos
 * twitter: nmosf
 */
public class FizzBuzz {

  private final int value;

  public FizzBuzz(int value) {
    this.value = value;
  }

  String print() {

    if (value % 3 == 0 && value % 5 == 0) {
      return "fizzBuzz";
    }

    if (value % 3 == 0) {
      return "fizz";
    }
    if (value % 5 == 0) {
      return "buzz";
    }
    return String.valueOf(value);
  }

}
