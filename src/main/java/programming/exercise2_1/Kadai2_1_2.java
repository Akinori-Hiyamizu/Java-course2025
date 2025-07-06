package programming.exercise2_1;

import java.util.List;

public class Kadai2_1_2 {
  //数値のリストを作成　要素数１０個
  //その数値の中の奇数だけを抽出して、平均値を出し、出力

  public static void main(String[] args) {
    List<Integer> numberList =
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    System.out.println(numberList.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(Integer::intValue)
        .average());

    numberList.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(Integer::intValue)
        .average()
        .ifPresent(System.out::println);
  }
}
