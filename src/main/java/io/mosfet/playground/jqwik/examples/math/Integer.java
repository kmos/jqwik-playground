package io.mosfet.playground.jqwik.examples.math;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with love.
 * User: mosfet
 * Date: 21/03/20
 * github: kmos
 * twitter: nmosf
 */
public class Integer {

  private int value;

  private static final Map<java.lang.Integer, Integer> myMap;
  static {
    Map<java.lang.Integer, Integer> aMap = new HashMap<>();
    aMap.put(1, new Integer(1));
    aMap.put(2, new Integer(2));
    aMap.put(3, new Integer(3));
    aMap.put(4, new Integer(4));
    aMap.put(5, new Integer(5));
    aMap.put(6, new Integer(6));
    aMap.put(7, new Integer(7));
    aMap.put(8, new Integer(8));
    aMap.put(9, new Integer(9));
    myMap = Collections.unmodifiableMap(aMap);
  }


  public Integer(int value) {
    this.value = value;
  }

  public Integer add(Integer integer) {
    return myMap.get(integer.value() + this.value());
  }

  public int value() {
    return value;
  }
}
