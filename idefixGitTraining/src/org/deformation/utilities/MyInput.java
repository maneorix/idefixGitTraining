package org.deformation.utilities;
/**
 * Basis til nedenstaaende 
 * er laant fra Y Daniel Liang: Introduction to Java programming
 * og tilpasset.
 *
 * MyInput.java: Contains the methods for reading
 * int, double, String
 * byte, short, long, and float
 *
 */
import java.io.*;

public class MyInput {
  // Read a string from the keyboard
  public static String readString() {
    BufferedReader br
      = new BufferedReader(new InputStreamReader(System.in), 1);

    // Declare and initialize the string
    String string = "";

    // Get the string from the keyboard
    try {
      string = br.readLine();
    }
    catch (IOException ex) {
      System.out.println(ex);
    }

    // Return the string obtained from the keyboard
    return string;
  }

  // Read an int value from the keyboard
  public static int readInt() {
    return Integer.parseInt(readString());
  }

  // Read a double value from the keyboard
  public static double readDouble() {
    return Double.parseDouble(readString());
  }

  // Read a byte value from the keyboard
  public static byte readByte() {
    return Byte.parseByte(readString());
  }

  // Read a short value from the keyboard
  public static short readShort() {
    return Short.parseShort(readString());
  }

  // Read a long value from the keyboard
  public static long readLong() {
    return Long.parseLong(readString());
  }

  // Read a float value from the keyboard
  public static float readFloat() {
    return Float.parseFloat(readString());
  }
}