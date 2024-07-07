
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    StringBuilder sb = new StringBuilder("================================");

    for (int i = 0; i < 3; i++) {
      String s1 = scanner.next();
      int x = scanner.nextInt();
      appendString(sb, String.format("%-15s%03d", s1, x));
    }

    appendString(sb, "================================");
    System.out.println(sb);
  }

  private static void appendString(StringBuilder sb, String string) {
    sb.append(string).append(System.lineSeparator());
  }
}


