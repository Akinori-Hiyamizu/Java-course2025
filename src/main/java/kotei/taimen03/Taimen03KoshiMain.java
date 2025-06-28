package kotei.taimen03;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Taimen03KoshiMain {

  /*
  対面指導②課題
  Javaプログラミング演習①

  ■JDK 21ドキュメント
  https://docs.oracle.com/javase/jp/21/index.html
  ■Java SE Platformの基本API
  https://docs.oracle.com/javase/jp/21/docs/api/java.base/module-summary.html
   */

  public static void main(String[] args) {
    kadai1();
    //kadai2();
    //kadai3();
    //kadai4();
  }

  public static void kadai1() {
    /*
    1.
    変数に任意の数値を 2 つ代入して、その値を使って足し算・引き算・掛け
    算・割り算・余りを求めた結果を出力しましょう 。
     */

    int inum1 = 5;
    int inum2 = 12345;
    System.out.println("int型（整数型）の演算------------------");
    //System.out.println("足し算：" + (inum1 + inum2));
    //System.out.println("引き算：" + (inum1 - inum2));
    //System.out.println("掛け算：" + (inum1 * inum2));
    System.out.println("割り算：" + (inum1 / inum2));
    //System.out.println("余り　：" + (inum1 % inum2));

    double dnum1 = 5;
    double dnum2 = 12345;
    System.out.println("double型（浮動小数点）の演算--------");
    //System.out.println("足し算：" + (dnum1 + dnum2));
    //System.out.println("引き算：" + (dnum1 - dnum2));
    //System.out.println("掛け算：" + (dnum1 * dnum2));
    System.out.println("割り算：" + (dnum1 / dnum2));
    //四捨五入する場合はMath.roundを用いる
    //System.out.println("割り算：" + Math.round(dnum1 / dnum2));
    //System.out.println("余り　：" + (dnum1 % dnum2));

    /*
    JavaのBigDecimalは、浮動小数点数演算時に誤差を回避するために使用されるクラスです。
    特に金融計算や科学計算など、正確な数値計算が必要な場面で利用されます。
    doubleやfloatの誤差を気にせず、任意の精度で10進数（decimal）を扱うことができます。
     */
    BigDecimal bdnum1 = BigDecimal.valueOf(5);
    BigDecimal bdnum2 = BigDecimal.valueOf(12345);
    System.out.println("BigDecimalの演算---------------");
    //System.out.println("足し算：" + bdnum1.add(bdnum2));
    //System.out.println("引き算：" + bdnum1.subtract(bdnum2));
    //System.out.println("掛け算：" + bdnum1.multiply(bdnum2));
    //BigDecimalクラスは、ユーザーが丸め動作を完全に制御できるようにします。
    System.out.println("割り算：" + bdnum1.divide(bdnum2, 25, RoundingMode.HALF_UP));
    //System.out.println("余り　：" + bdnum1.remainder(bdnum2));

  }

  public static void kadai2() {
    /*
    2.
    if 文を用いて、以下の処理を記載しましょう 。
    変数に 1 〜 10 文字で任意の文字列を 代入
    文字列が 5 文字以上であれば「5文字以上です」と 出力
    文字列が 5 文字未満であれば「5文字未満です」と 出力
    以下の指示に従って、課題に取り組んでみましょう。

    クラスString
    https://docs.oracle.com/javase/jp/21/docs/api/java.base/java/lang/String.html
     */
    String moji1 = "あいうえ";
    //String moji1 = "かきくけこさしすせそ";

    if (moji1.length() >= 5) {
      System.out.println("5文字以上です");
    } else {
      System.out.println("5文字未満です");
    }
  }

  public static void kadai3() {
    /*
    3.
    1 から 10 までの値を全て足し算した結果を出力しましょう 。
    55と出力されることを確認しましょう。
     */
    //int num = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
    int num = 0;
    for (int i = 1; i <= 10; i++) {
      num = num + i;
    }
    System.out.println(num);
  }

  public static void kadai4() {
    /*
    4.
    List に 1 から 20 までの整数を代入し、素数の値のみを判定して出力しま
    しょう。出力後、実際に出力された数がいくつかを「素数の数は〇〇です」
    という形で最後に出力しましょう。

    クラスArrayList
    https://docs.oracle.com/javase/jp/21/docs/api/java.base/java/util/ArrayList.html
     */
    List<Integer> list = List.of(
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
    int cnt = 0;
    for (int i : list) {
      if (isPrime(i)) {
        System.out.println(i + "は素数");
        cnt++;
      }
    }
    System.out.println("素数の数は" + cnt + "です");
  }

  /*
  ＜ChatGPTなどに聞いた結果＞
  素数を求める方法はいくつかありますが、一番基本的なのは試し割り法です。
  試し割り法とは、ある数を1から順番に割っていき、割り切れる数が2つ（1と自身）
  しかない場合にその数が素数であると判断する方法です。
  もう少し詳細に説明すると：
  1. 試し割り法:
    2から、その数の平方根までの数で割っていきます。
    割り切れる数が見つかれば、その数は素数ではありません。
    割り切れる数が見つからなければ、その数は素数です。
   */
  // 素数判定用のメソッド
  public static boolean isPrime(int num) {
    if (num < 2) {
      return false; // 2未満は素数ではない
    }
    //numを、2から√numまでの数で割ってみて、割り切れる数が
    //見つかったら、numは素数ではない
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false; // 割り切れるなら素数ではない
      }
    }
    return true; // 割り切れる数がない場合は素数
  }
}
