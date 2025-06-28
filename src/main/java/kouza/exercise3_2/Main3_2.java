package kouza.exercise3_2;

import java.util.List;
import kouza.exercise2_3.Main.Greeting;

public class Main3_2 {
  //IntelliJの便利機能（ショートカットキー）

  public static void main(String[] args) {
    System.out.println(createstudentList());

    int number1 = 3;
    int number2 = 5;
    int sum = number1 + number2;
    System.out.println(sum);

    Greeting greeting = new Greeting();
    greeting.sayHello("山田");

  }

  private static List<String> createstudentList() {
    return List.of("山田", "井上", "田中", "佐藤");
  }


}
