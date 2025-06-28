package kouza.exercise1_4;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Kadai1_4_2 {
  //生徒名と番号の組み合わせのMapを作成　要素数１０個以上
  //Mapの中の番号が偶数のものを削除する繰り返し処理を行い、削除した状態のものを出力

  public static void main(String[] args) {
    Map<Integer, String> studentNameMap = new HashMap<>(Map.of(1, "山田", 2, "井上", 3, "佐藤",
        4, "加藤", 5, "田中", 6, "山本", 7, "吉田", 8, "太田",
        9, "斎藤", 10, "本田"));

    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        studentNameMap.remove(i);
      }
    }
    System.out.println(studentNameMap);

    //または
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0 && studentNameMap.containsKey(i)) {
        studentNameMap.remove(i);
      }
    }
    System.out.println(studentNameMap);

    //または
    IntStream.rangeClosed(1, 10)
        .filter(i -> i % 2 == 0)
        .forEach(studentNameMap::remove);
    System.out.println(studentNameMap);
  }
}
