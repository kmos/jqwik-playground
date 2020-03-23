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
    return new Integer(integer.value() + 1);
  }

  public int value() {
    return value;
  }
}
