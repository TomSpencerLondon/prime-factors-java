package com.codurance.primeFactors;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
  public static List<Integer> of(int n) {
    final List<Integer> factors = Lists.newArrayList();
    if (n > 1) {
      if (n % 2 == 0){
        factors.add(2);
        n /= 2;
      }

      if (n > 1){
        factors.add(n);
      }
    }
    return factors;
  }
}
