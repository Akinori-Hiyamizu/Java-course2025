package kotei.taimen04;

import java.util.Arrays;
import java.util.List;

public class Taimen04_1Main {
  //１．以下の名前のリストから、"a"を含む名前のみをフィルタリングし、大文字に
  //変換して出力するプログラムをStream APIとラムダ式を使って作成しましょう。

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Tanaka", "Suzuki", "Yamada", "Sato", "Nakamura");
    names.stream()
        .filter(n -> n.contains("a"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
  }
}
