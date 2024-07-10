
import java.io.*;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    long number = Long.parseLong(scanner.nextLine());

  }

  private static String getResult(long number) {
    StringBuilder sb = new StringBuilder();

    if (canFitInByte(number)){

    } else if (canFitInShort(number)){

    } else if (canFitInInt(number)){

    } else if (canFitInLong(number)){

    } else if (canFitInDouble(number)) {

    } else {

    }

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println(canFitInFloat(number));


  }

  public static boolean canFitInByte(long number) {
    return number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE;
  }

  public static boolean canFitInShort(long number) {
    return number >= Short.MIN_VALUE && number <= Short.MAX_VALUE;
  }

  public static boolean canFitInInt(long number) {
    return number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE;
  }

  public static boolean canFitInLong(long number) {
    return number >= Long.MIN_VALUE && number <= Long.MAX_VALUE;
  }

  public static boolean canFitInFloat(long number) {
    return number >= -Float.MAX_VALUE && number <= Float.MAX_VALUE;
  }

  public static boolean canFitInDouble(long number) {
    return number >= -Double.MAX_VALUE && number <= Double.MAX_VALUE;
  }
}
  }
          }




