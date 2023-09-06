package org.example;

/**
 * Main method.
 */
public class Main {
  /**
   * Main Method.
   *
   * @param args Arguments to be passed.
   */
  public static void main(String[] args) {
    NumberDisplay hours = new NumberDisplay(24);
    NumberDisplay minutes = new NumberDisplay(60, 46);

    hours.setValue(19);

    for (int i = 0; i < 500; i++) {
      System.out.printf(hours.getDisplayValue() + ":" + minutes.getDisplayValue() + "\n");
      minutes.increment();
      if (minutes.getValue() == (minutes.getLimit() - 1)) {
        hours.increment();
      }
    }




  }
}