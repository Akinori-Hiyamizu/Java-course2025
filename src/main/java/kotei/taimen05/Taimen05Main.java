package kotei.taimen05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Taimen05Main {

  public static final double TAX_RATE = 0.1;

  public static void main(String[] args) {
    kadai1();
    kadai2();
    kadai3();
  }

  public static void kadai1() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("郵便番号を入力してください（例: 123-4567）:");
    String postalCode = scanner.nextLine();

// 正規表現パターンを使って郵便番号の形式をチェック
    boolean isValid = Pattern.matches(
        "^\\d{3}-?\\d{4}$", postalCode);

    if (isValid) {
      System.out.println("有効な郵便番号です");
    } else {
      System.out.println("無効な郵便番号です");
    }

    scanner.close();
  }

  public static void kadai2() {
    int number1 = 5;
    int number2 = 3;

    calculateAndPrintSum(number1, number2);

    int product = number1 * number2;
    System.out.println("積" + product);
  }

  private static void calculateAndPrintSum(int a, int b) {
    int sum = a + b;
    System.out.println("合計" + sum);
  }

  public static void kadai3() {
    double basePrise = 5000;
    double taxAmount = basePrise * TAX_RATE;
    double totalPrice = basePrise + taxAmount;
    System.out.println("税込価格" + totalPrice);
  }
}
