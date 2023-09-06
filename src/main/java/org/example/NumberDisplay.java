package org.example;

/**
 * Represents a display showing a value with 2 digits.
 * The format of the display is NN and rolls over to 0 at the limit
 * Value should always be positive
 *
 * @author Matrh
 * @version 2023-09-04
 */
public class NumberDisplay {
  private int value = 0;
  private int limit = 60;

  /**
   * Creates an instance of NumberDisplay with specified upper limit.
   *
   * @param limit Higher bound limit for the rolling counter
   */
  public NumberDisplay(int limit) {
    setLimit(limit);
  }

  /**
   * Creates an instance of NumberDisplay with specified upper limit and start value.
   *
   * @param limit Higher bound limit for the rolling counter.
   * @param value Start value for the NumberDisplay instance.
   */
  public NumberDisplay(int limit, int value) {
    setLimit(limit);
    setValue(value);
  }

  /**
   * Increments the value by 1.
   * Rolls over if value has reached limit
   *
   */
  public void increment() {
    // Uses modulo operator
    value++;
    setValue(value % limit);
  }

  /**
   * Gets the current value of the object.
   *
   * @return Current value of the number display
   */
  public int getValue() {
    return value;
  }

  /**
   * Gets the upper limit of the NumberDisplay class.
   *
   * @return The limit variable of the NumberDisplay.
   */
  public int getLimit() {
    return limit;
  }

  /**
   * Converts the current value to String.
   * Prepends a 0 to the start if value is less than 10.
   *
   * @return Value represented as string.
   */
  public String getDisplayValue() {
    String valueToDisplay;

    if (value < 10) {
      valueToDisplay = "0" + value;
    } else {
      valueToDisplay = "" + value;
    }

    return valueToDisplay;
  }

  /**
   * Sets the current numeric value.
   * Should be positive and lower than limit.
   *
   * @param value Current value of the object.
   */
  public void setValue(int value) {
    if (value >= 0 && value < limit) {
      this.value = value;
    }
  }

  /**
   * Upper bound limit for the value before rollover.
   * Should be positive value.
   *
   * @param limit Upper bound limit for the value
   */
  public void setLimit(int limit) {
    if (limit > 0) {
      this.limit = limit;
    }
  }
}
