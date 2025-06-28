package kouza.exercise2_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Kadai2_2_1 {
  //入出力処理を実装し、作ったファイルに文章を追加
  //作ったファイルを削除して、もう一度実行すると例外になるため、キャッチして例外処理を行う
  //キャッチした中でさらにファイルを書き込もうとして例外になった場合、どうなるか確認

  public static void main(String[] args) throws IOException {

    Path path = Path.of("JavaCourse.txt");
    try {
      Files.writeString(path, "Javaコース最高！！", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("例外が発生した。");
      Files.writeString(path, "Javaコース最高！！", StandardOpenOption.APPEND);
    }
  }
}
