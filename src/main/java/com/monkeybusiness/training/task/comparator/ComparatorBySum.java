package com.monkeybusiness.training.task.comparator;

import java.util.Comparator;

public class ComparatorBySum implements Comparator<int[]> {

  @Override
  public int compare(int[] raw1, int[] raw2) {
    int sum1 = raw1[0];
    for (int i : raw1) {
      sum1 += i;
    }

    int sum2 = raw2[0];
    for (int i : raw2) {
      sum2 += i;
    }

    int result;

    if (sum1 < sum2) {
      result = 1;
    } else if (sum1 == sum2) {
      result = 0;
    } else {
      result = -1;
    }

    return result;
  }
}
