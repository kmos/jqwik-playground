package io.mosfet.playground.jqwik.examples.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created with love.
 * User: mosfet
 * Date: 23/03/20
 * github: kmos
 * twitter: nmosf
 */
class IntegerTest {

  @Test
  void onePlusOneShouldBeTwo() {
    Integer aInteger = new Integer(1);
    assertEquals(2,aInteger.add(new Integer(1)).value());
  }
}
