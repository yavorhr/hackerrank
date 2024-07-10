
import java.io.*;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int rows = scanner.nextInt();

    for (int i = 0; i < rows; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int n = scanner.nextInt();

      for (int j = 0; j < n; j++) {
        a = a + (int) Math.pow(2, j) * b;
        System.out.print(a + " ");
      }
      System.out.println("");
    }
    scanner.close();
  }
}




