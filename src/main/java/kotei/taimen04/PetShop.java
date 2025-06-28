package kotei.taimen04;

import java.util.ArrayList;

public class PetShop extends ArrayList<Pet> {

  public void makeSounds() {
    this.stream().map(Pet::makeSound).forEach(System.out::println);

    //ストリームで自分自身(ArrayList)の中にあるPetデータを順番に処理し、
    //Pet.makeSoundを実行して文字列（鳴き声）を取得し、forEachで標準出力する
  }
}
