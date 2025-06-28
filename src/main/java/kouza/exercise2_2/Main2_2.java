package kouza.exercise2_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main2_2 {
  //入出力処理と例外処理

  public static void main(String[] args) throws IOException {

    Path path = Path.of("JavaCourse.txt");
    try {
      Files.writeString(path, "Javaコース最高！！", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
    } catch (IOException e) {
      System.out.println("例外が発生した。");
      e.printStackTrace();
    }
  }
}
