package kotei.taimen04;

public class Taimen04_2Main {

  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();

    PetShop petShop = new PetShop();

    petShop.add(dog);
    petShop.add(cat);

    petShop.makeSounds();

  }

}
