package com.codurance.primeFactors;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
  public static List<Integer> of(int n) {
    final List<Integer> factors = Lists.newArrayList();
    int divisor = 2;
    while (n > 1) {
      while (n % divisor == 0){
        factors.add(divisor);
        n /= divisor;
      }

      divisor++;
    }

    return factors;
  }
}
