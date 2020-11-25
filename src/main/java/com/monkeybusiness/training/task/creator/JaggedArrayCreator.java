package com.monkeybusiness.training.task.creator;

import java.util.Random;

public class JaggedArrayCreator {
  public static final int MAX_VALUE = 100;
  public static final int MIN_COLUMN_SIZE = 1;

  public int[][] createArray(int size) {
    int[][] array = new int[size][];
    Random random = new Random();

    for (int i = 0; i < size; i++) {
      int columnSize = random.nextInt(size) + MIN_COLUMN_SIZE;
      array[i] = new int[columnSize];

      for (int j = 0; j < columnSize; j++) {
        int value = random.nextInt(MAX_VALUE);
        array[i][j] = value;
      }
    }

    return array;
  }
}
