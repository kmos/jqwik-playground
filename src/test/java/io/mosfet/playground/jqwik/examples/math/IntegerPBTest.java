package io.mosfet.playground.jqwik.examples.math;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created with love.
 * User: mosfet
 * Date: 21/03/20
 * github: kmos
 * twitter: nmosf
 */
class IntegerPBTest {

  @Property
  void commutative(@ForAll int a, @ForAll int b) {
    Integer aInteger = new Integer(a);
    Integer bInteger = new Integer(b);
    assertEquals(aInteger.add(bInteger).value(), bInteger.add(aInteger).value());
  }

  @Property
  void associative(@ForAll int a, @ForAll int b, @ForAll int c) {
    Integer aInteger = new Integer(a);
    Integer bInteger = new Integer(b);
    Integer cInteger = new Integer(c);
    assertEquals(aInteger.add(bInteger).add(cInteger).value(), bInteger.add(cInteger).add(aInteger).value());
  }

  @Property
  void neutral(@ForAll int a) {
    Integer aInteger = new Integer(a);
    assertEquals(aInteger.add(new Integer(Integer.ZERO)).value(), aInteger.value());
  }

}
