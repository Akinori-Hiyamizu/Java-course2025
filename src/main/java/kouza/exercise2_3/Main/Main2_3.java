package kouza.exercise2_3.Main;

public class Main2_3 {
  //オブジェクト指向について

  public static void main(String[] args) {
    Greeting greeting = new Greeting();
    String message = greeting.sayHello("Taro Yamada");

    Printer printer = new Printer();
    printer.printMessage(message);

    Speaking speaking = new Greeting();
    speaking.say("テスト");

  }
}
