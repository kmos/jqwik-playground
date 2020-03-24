package io.mosfet.playground.jqwik.examples.composed;

/**
 * Created with love.
 * User: mosfet
 * Date: 24/03/20
 * github: kmos
 * twitter: nmosf
 */
public class Person {

  private final String firstName;
  private final String lastName;

  Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String fullName() {
    return firstName + " " + lastName;
  }

  @Override
  public String toString() {
    return String.format("Person(%s:%s)", firstName, lastName);
  }
}
