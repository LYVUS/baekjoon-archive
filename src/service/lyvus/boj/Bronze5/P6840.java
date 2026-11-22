package service.lyvus.boj.Bronze5;

import java.util.Scanner;

public class P6840 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numA = scanner.nextInt();
    int numB = scanner.nextInt();
    int numC = scanner.nextInt();

    int result = (numA + numB + numC) - Math.max(numA, Math.max(numB, numC)) - Math.min(numA, Math.min(numB, numC));
    System.out.println(result);
  }
}
