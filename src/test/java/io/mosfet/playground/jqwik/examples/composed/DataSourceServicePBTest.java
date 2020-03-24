package io.mosfet.playground.jqwik.examples.composed;

import net.jqwik.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created with love.
 * User: mosfet
 * Date: 24/03/20
 * github: kmos
 * twitter: nmosf
 */
class DataSourceServicePBTest {


  @Property
  void executeTestWithValidPersonData(@ForAll("validPerson") Person aPerson) {
    DataSourceService dataSourceService = new DataSourceService();
    dataSourceService.publish(aPerson);
  }

  @Provide
  Arbitrary<Person> validPerson() {
    Arbitrary<String> firstName = Arbitraries.strings()
      .withCharRange('a', 'z')
      .ofMinLength(2).ofMaxLength(10)
      .map(this::capitalize);
    Arbitrary<String> lastName = Arbitraries.strings()
      .withCharRange('a', 'z')
      .ofMinLength(2).ofMaxLength(20);
    return Combinators.combine(firstName, lastName).as(Person::new);
  }

  public String capitalize(String str) {
    if(str == null || str.isEmpty()) {
      return str;
    }

    return str.substring(0, 1).toUpperCase() + str.substring(1);
  }

}
