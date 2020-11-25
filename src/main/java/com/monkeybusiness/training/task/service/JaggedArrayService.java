package com.monkeybusiness.training.task.service;

import com.monkeybusiness.training.task.comparator.ComparatorByMaxRowsElement;
import com.monkeybusiness.training.task.comparator.ComparatorByMinRowsElement;
import com.monkeybusiness.training.task.comparator.ComparatorBySum;

import java.util.Comparator;

public class JaggedArrayService {
  public int[][] sortBySum(int[][] array) {
    Comparator<int[]> comparator = new ComparatorBySum();
    int[][] result = sort(array, comparator);

    return result;
  }

   public int[][] sortByMaxRowsElement(int[][] array) {
    Comparator<int[]> comparator = new ComparatorByMaxRowsElement();
    int[][] result = sort(array, comparator);

    return result;
  }

  public int[][] sortByMinRowsElement(int[][] array) {
    Comparator<int[]> comparator = new ComparatorByMinRowsElement();
    int[][] result = sort(array, comparator);

    return result;
  }

  public int[][] sort(int[][] array, Comparator<int[]> comparator) {
    boolean sorted = false;

    while(!sorted) {
      sorted = true;

      for (int i = 0; i < array.length - 1; i++) {
        int compareResult = comparator.compare(array[i], array[i+1]);

        if (compareResult > 0) {
          int[] tmp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = tmp;
          sorted = false;
        }
      }
    }

    return array;
  }
}
