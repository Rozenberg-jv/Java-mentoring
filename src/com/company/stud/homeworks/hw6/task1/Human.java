package com.company.stud.homeworks.hw6.task1;

public class Human {

  private String name;
  private Pet pet;

  public Human(String name, Pet pet) {
    this.name = name;
    this.pet = pet;
  }

  public Human(String name) {
    this.name = name;
  }

  public void play() {

    System.out.println(this.name + " is playing with his OWN pet " + this.pet.getName() + ": " + this.pet.play());
  }

  public void play(Pet pet) {
    System.out.println(this.name + " is playing with ANY pet " + pet.getName() + ": " + pet.play());
  }

  public void setPet(Pet pet) {
    this.pet = pet;
  }

  public Pet getPet() {
    return pet;
  }
}
