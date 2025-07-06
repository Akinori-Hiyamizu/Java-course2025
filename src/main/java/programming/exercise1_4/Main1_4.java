package programming.exercise1_4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main1_4 {
  //繰り返し処理、配列、ListとMap、Switch式

  public static void main(String[] args) {

    int sum = 0;
    for (int i = 0; i <= 10; i++) {
      sum += i;
    }
    System.out.println(sum);

    String[] studentNames = new String[]{"山田", "井上", "佐藤", "加藤", "田中"};
    System.out.println(Arrays.toString(studentNames));

    List<String> studentNameList = List.of("山田", "井上", "佐藤", "加藤", "田中");
    System.out.println(studentNameList);

    Map<Integer, List<String>> studentNameMap = Map.of(1, List.of("山田", "次郎"),
        2, List.of("井上", "太郎"));
    System.out.println(studentNameMap);

    int number = 10;
    if (number == 1) {
      System.out.println(1);
    } else if (number == 2) {
      System.out.println(2);
    } else if (number == 3) {
      System.out.println(3);
    } else {
      System.out.println(10);
    }

    int num = 10;
    switch (num) {
      case 1 -> System.out.println(1);
      case 2 -> System.out.println(2);
      case 3 -> System.out.println(3);
      default -> System.out.println(10);
    }
  }
}
