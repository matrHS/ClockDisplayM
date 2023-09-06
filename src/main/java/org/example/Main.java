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
    NumberDisplay hours;
    hours = new NumberDisplay(24);

    NumberDisplay minutes;
    minutes = new NumberDisplay(60);

    minutes.setValue(46);
    hours.setValue(19);

    for (int i = 0; i < 500; i++) {
      minutes.increment();
      System.out.printf(hours.getDisplayValue() + ":" + minutes.getDisplayValue() + "\n");
      if (minutes.getValue() == (minutes.getLimit() - 1)) {
        hours.increment();
      }
    }




  }
}