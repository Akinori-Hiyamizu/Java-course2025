package kotei.taimen03;

public class Taimen03Main {

  public static void main(String[] args) {
    kadai1();
    kadai2();
    kadai3();
  }

  public static void kadai1() {

    int num1 = 10;
    int num2 = 5;
    System.out.println(
        "四則演算結果：" + (num1 + num2) + "," + (num1 - num2) + ","
            + (num1 * num2) + "," + (num1 / num2));
  }

  public static void kadai2() {

    String moji1 = "かがわ";
    if (moji1.length() >= 5) {
      System.out.println("５文字以上です。");
    } else {
      System.out.println("５文字未満です。");
    }
  }

  public static void kadai3() {

    int sum = 0;
    for (int i = 0; i <= 10; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
  }
}
