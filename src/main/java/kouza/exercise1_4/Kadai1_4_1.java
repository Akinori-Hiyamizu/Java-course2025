package kouza.exercise1_4;

import java.util.List;

public class Kadai1_4_1 {
  //生徒名のような文字列のリストを作成　要素数１０個
  //リストをループさせて繰り返し処理を実施し、文字数が３文字以上のものを表示

  public static void main(String[] args) {
    List<String> studentNameList = List.of("山一", "井上次郎", "佐藤衆",
        "藤守", "田中浩", "嶺亮", "吉田優斗", "香川健", "斎藤隆二", "申龍");
    for (String name : studentNameList) {
      if (name.length() >= 3) {
        System.out.println(name);
      }
    }

    //または
    studentNameList.stream()
        .filter(name -> name.length() >= 3)
        .forEach(System.out::println);
  }
}
