package com.example;

/**
 * Reverses a string using a recursive function.
 *
 * @author Christopher Di Bert
 * @version 1.0
 * @since 2024-04-10
 */

// ReverseString class
public final class ReverseString {

  /** Private constructor to prevent instantiation. */
  private ReverseString() {
    throw new UnsupportedOperationException("Cannot instantiate");
  }

  /**
   * This is the main method.
   *
   * @param args Unused
   */
  public static void main(final String[] args) {
    String reversedString = StringReverser("null");
    System.out.println(reversedString);
  }

  /**
   * Recursive method that reverses its input string.
   *
   * @param inputString passed.
   * @return inputString.
   */
  private static String StringReverser(String inputString) {
    // Returns the reversed string once its length is zero.
    if (inputString.length() == 0) {
      return inputString;
    }
    /* Otherwise, return the input string passed into the
     * string reverser again but with its index shifted over one
     * added to the first character of the input string.
     */
    else {
      return StringReverser(inputString.substring(1)) + inputString.charAt(0);
    }
  }
}
