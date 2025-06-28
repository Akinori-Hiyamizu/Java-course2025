package kouza.exercise1_3;

import java.time.LocalDate;

public class Kadai1_3_2 {

  public static void main(String[] args) {

    LocalDate now = LocalDate.now();
    LocalDate deadline = LocalDate.of(2025, 6, 30);

    if (now.isAfter(deadline)) {
      System.out.println("締切日は過ぎました。");
    } else if (now.isEqual(deadline)) {
      System.out.println("今日は締切日です。");
    } else {
      System.out.println("今日はまだ締切日前です。");
    }
  }
}
