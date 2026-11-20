package service.lyvus.boj.Bronze5;

import java.util.Scanner;

public class P3733 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()) {
      String[] inputArr = scanner.nextLine().split(" ");
      System.out.println((Integer.parseInt(inputArr[1]) / (Integer.parseInt(inputArr[0]) + 1)));
    }
  }
}
