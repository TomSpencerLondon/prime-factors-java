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

  @Test
  void of_2Is2() {
    assertThat(PrimeFactors.of(2), is(ImmutableList.of(2)));
  }

  @Test
  void of_3Is3() {
    assertThat(PrimeFactors.of(3), is(ImmutableList.of(3)));
  }
}
