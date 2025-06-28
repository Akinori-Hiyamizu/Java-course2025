package kotei.taimen05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Taimen05KoshiMain {

  public static void main(String[] args) {
    kadai01();
    //kadai02();
    //kadai03();
  }


  public static void kadai01() {
    /*
    １．郵便番号を入力し、有効な郵便番号であれば「有効な郵便番号です」、
      無効な郵便番号であれば「無効な郵便番号です」と出力する処理を実装
      してください。
     */
    Scanner scanner = new Scanner(System.in);

    System.out.print("郵便番号を入力してください（例: 123-4567）:");
    String postalCode = scanner.nextLine();

    // 正規表現パターンを使って郵便番号の形式をチェック
    boolean isValid = Pattern.matches("\\d{3}-\\d{4}", postalCode);

    if (isValid) {
      System.out.println("有効な郵便番号です");
    } else {
      System.out.println("無効な郵便番号です");
    }

    scanner.close();
  }

  public static void kadai02() {
    /*
    ２．以下のJavaコードをコメント文の指示にしたがって、IntelliJの
       ショートカットを使ってコードを改善してください。
      public class Main{
        public static void main(String[] args){
          //変数名をnumber1とnumber2に変更する
          int a = 5;
          int b = 3;
          //足し算部分の2行をメソッド「calcurateAndPrintSum」として
          //抽出する
          int sum = a+b;
          System.out.println("合計："+sum);

          int product = a*b;
          System.out.println("積："+product);
        }
      }
     */
    //変数名をnumber1とnumber2に変更する
    //       ①変数名の変更
    //        Windows/Linux: Shift + F6
    //        macOS: Shift + F6
    int a = 5;
    int b = 3;

    //足し算部分の2行をメソッド「calcurateAndPrintSum」として
    //抽出する
    //      ②メソッドの抽出
    //        Windows/Linux: Ctrl + Alt + M
    //        macOS: ⌘ + ⌥ + M (Command + Option + M)
    int sum = a + b;
    System.out.println("合計：" + sum);

    int product = a * b;
    System.out.println("積：" + product);

  }

  //①定数名を tax_rate → TAX_RATE に修正（大文字のスネークケース）
  public static final double TAX_RATE = 0.1;

  public static void kadai03() {
    /*
    ３．以下のJavaコードをJavaの命名規則に基づいて修正してください。
      public class Main{
        public static final double tax_rate = 0.1;//10%の消費税
        public static void main(String[] args){
          double BasepRice = 5000;
          double Tax_amount = BasepRice * tax_rate;
          double totalPrice = BasepRice + Tax_amount;
          System.out.println("税込価格："+totalplice);
        }
      }
     */
    //②変数名を小文字始まりのbasePrice, taxAmount,
    // basePrice, totalPriceに修正（キャメルケース）
    double basePrice = 5000;
    double taxAmount = basePrice * TAX_RATE;
    double totalPrice = basePrice + taxAmount;

    System.out.println("税込価格: " + totalPrice);
  }
}

