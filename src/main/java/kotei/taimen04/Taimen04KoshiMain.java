package kotei.taimen04;

import java.util.Arrays;
import java.util.List;

public class Taimen04KoshiMain {

  public static void main(String[] args) {
    //kadai1();
    kadai2();
  }

  public static void kadai1() {
    //１．以下の名前のリストから、"a"を含む名前のみをフィルタリングし、大文字に
    //変換して出力するプログラムをStream APIとラムダ式を使って作成しましょう。
    List<String> names = Arrays.asList("Tanaka", "Suzuki", "Yamada", "Sato", "Nakamura");
    names.stream()
        .filter(name -> name.contains("a"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
  }

  public static void kadai2() {
    //２．以下手順でペットショップシミュレーションを作成しましょう。
    //Petインタフェースを作成し、鳴き声に関するmakeSound()メソッドを定義する
    //DogとCatクラスを作成し、Petインタフェースを実装する。
    //PetShopクラスを作成し、ペットを管理できるようにする。
    //MainクラスでDogとCatのインスタンスを作成し、PetShopに追加して動作を確認する。
    Dog dog = new Dog();
    Cat cat = new Cat();
    Elephant elephant = new Elephant();
    PetShop petShop = new PetShop();

    petShop.add(dog);
    petShop.add(cat);
    //Petインタフェースを実装していないElephantはaddするとエラーになる。
    //petShop.add(elephant);

    petShop.makeSounds();
  }
}
