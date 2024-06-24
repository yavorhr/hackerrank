import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);

    int firstNumber = readNumber(scanner);
    int secondNumber = readNumber(scanner);
    int thirdNumber = readNumber(scanner);

    printOutput(firstNumber,secondNumber,thirdNumber);
  }

  private static void printOutput(int firstNumber, int secondNumber, int thirdNumber) {
    System.out.println(firstNumber);
    System.out.println(secondNumber);
    System.out.println(thirdNumber);
  }

  private static int readNumber(Scanner scanner) {
    return Integer.parseInt(scanner.nextLine());
  }
}



