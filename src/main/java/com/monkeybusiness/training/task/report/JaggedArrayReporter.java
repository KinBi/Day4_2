package com.monkeybusiness.training.task.report;

import java.util.Arrays;

public class JaggedArrayReporter {
  public void printSortedJaggedArray(int[][] array) {
    System.out.println("Sorted array ");
    for (int[] arr : array) {
      System.out.println(Arrays.toString(arr));
    }
  }
}
