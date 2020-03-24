package io.mosfet.playground.jqwik.examples.math;

/**
 * Created with love.
 * User: mosfet
 * Date: 21/03/20
 * github: kmos
 * twitter: nmosf
 */
public class Integer {

  private final int value;
  public static final int ZERO = 0;

  public Integer() {
    this.value = 0;
  }

  public Integer(int value) {
    this.value = value;
  }

  public Integer add(Integer integer) {
    return new Integer(this.value + integer.value());
  }

  public Integer sqrt() {
    return new Integer((int) Math.sqrt(value));
  }

  public int value() {
    return this.value;
  }

}
