package com.company.stud.homeworks.hw6.task1;

public class PetsAndHumans {

  public static void main(String[] args) {

    Pet murka = new Cat("Murka");
    Pet sharik = new Dog("Sharik");
    Pet nemo = new Fish("Nemo");

    Human human1 = new Human("Vasily", murka);
    Human human2 = new Human("Tatyana", sharik);

    human1.play();
    human2.play(human1.getPet());
    human2.play(nemo);
    list
    // mvp - minimum viable product
  }

}
