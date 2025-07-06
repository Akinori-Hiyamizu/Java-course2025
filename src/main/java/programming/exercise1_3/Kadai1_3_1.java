package programming.exercise1_3;

public class Kadai1_3_1 {
  //基本型、標準ＡＰＩ、分岐処理

  public static void main(String[] args) {

    String name1 = "田中";
    String name2 = "一";

    if (name1.length() >= 2 && name2.length() >= 2) {
      System.out.println(name1 + name2);
    } else {
      System.out.println("条件に一致しませんでした。");
    }
  }
}
