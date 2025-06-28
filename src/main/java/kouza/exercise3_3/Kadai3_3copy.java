package kouza.exercise3_3;

import java.util.List;

public class Kadai3_3copy {


  public static void main(String[] args) {
    //パターン①
    Librarycopy librarycopy = new Librarycopy();

    for (Bookcopy b : librarycopy.lookupTitle("学")) {
      System.out.println(b);
    }

    for (Bookcopy b : librarycopy.lookupAuthor("家")) {
      System.out.println(b);
    }

    Bookcopy b = librarycopy.lookupNumber(4);
    System.out.println(b);

    //パターン②
    List<Bookcopy> title = librarycopy.lookupTitle("学");
    for (Bookcopy bookcopy : title) {
      System.out.println(bookcopy);
    }

    List<Bookcopy> author = librarycopy.lookupAuthor("家");
    for (Bookcopy bookcopy : author) {
      System.out.println(bookcopy);
    }

    Bookcopy number = librarycopy.lookupNumber(3);
    System.out.println(number);

  }

}

