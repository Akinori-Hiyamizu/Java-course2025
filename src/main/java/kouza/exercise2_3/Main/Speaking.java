package kouza.exercise2_3.Main;

public interface Speaking {

  public default String say(String message) {

    return message;
  }
}
