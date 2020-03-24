package io.mosfet.playground.jqwik.examples.composed;

/**
 * Created with love.
 * User: mosfet
 * Date: 24/03/20
 * github: kmos
 * twitter: nmosf
 */
public class DataSourceService {

  void publish(Person person) {
    /**
     * I have already check the validity of person
     */
    System.out.println(person.fullName());
  }
}
