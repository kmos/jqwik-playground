package io.mosfet.playground.jqwik.examples.math;

/**
 * Created with love.
 * User: mosfet
 * Date: 21/03/20
 * github: kmos
 * twitter: nmosf
 */
public class Integer {

  private int value;

  public Integer(int value) {
    this.value = value;
  }

  public Integer add(Integer integer) {

    if (integer.value() == 1) {
      return new Integer(integer.value() + 1);
    }

    return new Integer(4);
  }

  public int value() {
    return value;
  }
}
