package service.lyvus.boj.Bronze5;

import java.util.Scanner;

public class P27433 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int input = scanner.nextInt();

    if (input == 0) {
      System.out.println(1);
      return;
    }

    long result = 1;
    for (int i = input; i >= 1; i--) {
      result *= i;
    }

    System.out.println(result);
  }

}
