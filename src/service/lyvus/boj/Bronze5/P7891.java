package service.lyvus.boj.Bronze5;

import java.util.Scanner;

public class P7891 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCase = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < testCase; i++) {
      String[] input = scanner.nextLine().split(" ");
      System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
    }
  }
}
