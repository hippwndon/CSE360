package cse360assignment02;

/**
 * @author      Hannah Edge <haedge@asu.edu>
 */
public class AddingMachine {
  private int total;
  private String formatter;
  /**
 * program that adds and subtracts
 * constructor for AddingMachine
 */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    formatter = '0';
  }
  
  /**
 * obtains sum of values from add/subtract
 * @return total
 */
  public int getTotal () {
    return total;
  }
  
  /**
 * adds value to sum, computes addition
 * @param  value added (self explanatory)
 */
  public void add (int value) {
    total += value;
    formatter += " + " + value;
  }

/**
 * subtracts value from sum 
 * @param  value added
 */
  public void subtract (int value) {
      total -= value;
      formatter += " - " + value;
  }

/**
 * converts to string
 * @return formatter (self explanatory)
 */
  public String toString () {
    return formatter;
  }

/**
 * clears memory
 */
  public void clear() {
      total = 0;
      formatter = "0";
  }
}