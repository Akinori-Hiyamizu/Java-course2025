package programming.exercise2_3.Main;

public class Greeting implements Speaking {

  public String sayHello(String name) {
    return "Hello," + name + "!";
  }

  @Override
  public String say(String message) {
    return message;
  }
}
