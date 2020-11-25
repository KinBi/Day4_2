package com.monkeybusiness.training.task.comparator;

import java.util.Comparator;

public class ComparatorByMinRowsElement implements Comparator<int[]> {

  @Override
  public int compare(int[] raw1, int[] raw2) {
    int min1 = raw1[0];
    for (int i : raw1) {
      if (min1 > i) {
        min1 = i;
      }
    }

    int min2 = raw2[0];
    for (int i : raw2) {
      if (min2 > i) {
        min2 = i;
      }
    }

    int result;

    if (min1 < min2) {
      result = 1;
    } else if (min1 == min2) {
      result = 0;
    } else {
      result = -1;
    }

    return result;
  }
}
