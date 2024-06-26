package com.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

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
    File readFile = new File("input.txt");
    try {
      FileWriter fileWriter = new FileWriter("output.txt");
      BufferedWriter writer = new BufferedWriter(fileWriter);
      Scanner sc = new Scanner(readFile);
      // Passes input lines to the string reverser then writes them to output.
      while (sc.hasNextLine()) {
        String inputString = sc.nextLine();
        writer.write(stringReverser(inputString));
        writer.newLine();
      }
      writer.close();
      sc.close();
    } catch (Exception e) {
      System.out.println("Invalid path");
    }
  }

  /**
   * Recursive method that reverses its input string.
   *
   * @param inputString passed.
   * @return inputString.
   */
  private static String stringReverser(final String inputString) {
    // Returns the reversed string once its length is zero.
    if (inputString.length() == 0) {
      return inputString;
      /* Otherwise, return the input string passed into the
       * string reverser again but with its index shifted over one
       * added to the first character of the input string.
       */
    } else {
      return stringReverser(inputString.substring(1)) + inputString.charAt(0);
    }
  }
}
