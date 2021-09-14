package com.codurance.primeFactors;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimeFactorsTest {
  @Test
  public void of_1isNone() {
    assertThat(PrimeFactors.of(1), is(ImmutableList.of()));
  }
}
