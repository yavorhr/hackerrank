
import java.io.*;

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int intNumber = Integer.parseInt(bufferedReader.readLine());
    double doubleNum = Double.parseDouble(bufferedReader.readLine());
    String string = bufferedReader.readLine();

    System.out.println("String: " + string);
    System.out.println("Double: " + doubleNum);
    System.out.println("Int: " + intNumber);

  }
}




