package com.codurance.primeFactors;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
  public static List<Integer> of(int n) {
    final List<Integer> factors = Lists.newArrayList();
    if (n == 2) {
      factors.add(n);
    }
    return factors;
  }
}
