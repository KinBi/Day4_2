package com.monkeybusiness.training.task.service;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JaggedArrayServiceTest {
  JaggedArrayService service;
  int[][] array;

  @BeforeClass
  public void setUp() {
    service = new JaggedArrayService();
    array = new int[][]{{4, 6}, {7, 2}};
  }

  @Test
  public void testSortBySum() {
    int[][] expected = {{7, 2}, {4, 6}};

    int[][] actual = service.sortBySum(array);

    assertEquals(expected, actual);
  }

  @Test
  public void testSortByMaxRowsElement() {
    int[][] expected = {{4, 6}, {7, 2}};

    int[][] actual = service.sortByMaxRowsElement(array);

    assertEquals(expected, actual);
  }

  @Test
  public void testSortByMinRowsElement() {
    int[][] expected = {{4, 6}, {7, 2}};

    int[][] actual = service.sortByMinRowsElement(array);

    assertEquals(expected, actual);
  }
}