package org.example;

/**
 * Main method.
 */
public class Main {

  /**
   * Takes in two NumberDisplay objects and returns a string formatted like a digital clock.
   *
   * @param hours NumberDisplay object to represent hours.
   * @param minutes NumberDisplay object to represent minutes.
   * @return String value in format **:**
   */
  private static String getTimeAsString(NumberDisplay hours, NumberDisplay minutes) {
    String timeAsString;

    timeAsString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();

    return timeAsString;
  }

  /**
   * Takes in two NumberDisplay objects and returns a string formatted like a digital clock.
   *
   * @param hours NumberDisplay object to represent hours.
   * @param minutes NumberDisplay object to represent minutes.
   * @param seconds NumberDisplay object to represent seconds.
   * @return String value in format **:**.**
   */
  private static String getTimeAsString(NumberDisplay hours, NumberDisplay minutes, NumberDisplay seconds) {
    String timeAsString;

    timeAsString = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + "." + seconds.getDisplayValue();

    return timeAsString;
  }

  /**
   * Increments the clock by time tick.
   *
   * @param hours NumberDisplay to represent hours.
   * @param minutes NumberDisplay to represent minutes.
   */
  private static void incrementTime(NumberDisplay hours, NumberDisplay minutes) {
    minutes.increment();
    if (minutes.getValue() == 0) {
      hours.increment();
    }
  }

  /**
   * Increments the clock by time tick.
   *
   * @param hours NumberDisplay to represent hours.
   * @param minutes NumberDisplay to represent minutes.
   * @param seconds NumberDisplay to represent seconds.
   */
  private static void incrementTime(NumberDisplay hours, NumberDisplay minutes, NumberDisplay seconds) {
    seconds.increment();
    if (seconds.getValue() == 0) {
      minutes.increment();
      if (minutes.getValue() == 0) {
        hours.increment();
      }
    }
  }

  /**
   * Main Method.
   *
   * @param args Arguments to be passed.
   */
  public static void main(String[] args) {
    NumberDisplay hours = new NumberDisplay(24);
    NumberDisplay minutes = new NumberDisplay(60, 46);
    NumberDisplay seconds = new NumberDisplay(60, 56);

    hours.setValue(19);
    minutes.setValue(58);

    for (int i = 0; i < 500; i++) {
      System.out.println(getTimeAsString(hours,minutes,seconds));
      incrementTime(hours,minutes,seconds);
    }
  }
}