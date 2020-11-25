package com.monkeybusiness.training.task.main;

import com.monkeybusiness.training.task.report.JaggedArrayReporter;
import com.monkeybusiness.training.task.service.JaggedArrayService;
import com.monkeybusiness.training.task.creator.JaggedArrayCreator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
  private static final Logger logger = LogManager.getLogger();

  public static void main(String[] args) {
    logger.info("Program started");
    JaggedArrayCreator creator = new JaggedArrayCreator();
    int[][] array = creator.createArray(10);

    JaggedArrayService service = new JaggedArrayService();
    int[][] result = service.sortBySum(array);

    JaggedArrayReporter reporter = new JaggedArrayReporter();
    reporter.printSortedJaggedArray(result);

    result = service.sortByMaxRowsElement(array);
    reporter.printSortedJaggedArray(result);

    result = service.sortByMinRowsElement(array);
    reporter.printSortedJaggedArray(result);
    logger.info("Program finished");
  }
}
