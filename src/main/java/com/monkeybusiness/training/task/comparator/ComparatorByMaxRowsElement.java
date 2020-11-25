package com.monkeybusiness.training.task.comparator;

import java.util.Comparator;

public class ComparatorByMaxRowsElement implements Comparator<int[]> {

  @Override
  public int compare(int[] raw1, int[] raw2) {
    int max1 = raw1[0];
    for (int i : raw1) {
      if (max1 < i) {
        max1 = i;
      }
    }

    int max2 = raw2[0];
    for (int i : raw2) {
      if (max2 < i) {
        max2 = i;
      }
    }

    int result;

    if (max1 > max2) {
      result = 1;
    } else if (max1 == max2) {
      result = 0;
    } else {
      result = -1;
    }

    return result;
  }
}
