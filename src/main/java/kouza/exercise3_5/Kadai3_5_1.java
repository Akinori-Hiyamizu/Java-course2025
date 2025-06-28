package kouza.exercise3_5;

import java.util.Scanner;

public class Kadai3_5_1 {
  //基本構文を使用して、簡単な計算機プログラムを作成
  //四則演算ができ、ユーザーから入力を受け取り、結果を表示する。
  //一番目の数字を入力、演算子を入力、二番目の数字を入力できるようにする。

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("数字を入力してください：");
    int number1 = scanner.nextInt();

    System.out.print("演算子（+-*/）を入力してください：");
    String operator = scanner.next();

    System.out.print("数字を入力してください：");
    int number2 = scanner.nextInt();

    int result = 0;
    switch (operator) {
      case "+":
        result = number1 + number2;
        break;
      case "-":
        result = number1 - number2;
        break;
      case "*":
        result = number1 * number2;
        break;
      case "/":
        if (number2 != 0) {
          result = number1 / number2;
        } else {
          System.out.println("エラー：０で割ることはできません。");
          scanner.close();
          return;
        }
        break;
      default:
        System.out.println("演算子が無効です。");
        scanner.close();
    }
    System.out.println("計算結果：" + result);
    scanner.close();
  }
}
