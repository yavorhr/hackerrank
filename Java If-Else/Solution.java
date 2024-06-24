import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(bufferedReader.readLine().trim());
    String result = "";

    result = getResult(num);
    System.out.println(result);

    bufferedReader.close();
  }

  private static String getResult(int num) {
    String result;
    if (num % 2 != 0) {
      result = "Weird";
    } else {
      if (num >= 2 && num <= 5) {
        result = "Not Weird";
      } else if (num >= 6 && num <= 20) {
        result = "Weird";
      } else {
        result = "Not Weird";
      }
    }
    return result;
  }
}


