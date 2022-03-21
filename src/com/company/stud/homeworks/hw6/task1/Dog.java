package com.company.stud.homeworks.hw6.task1;

public class Dog extends Pet {

  private String reaction = "WOOF";

  public Dog(String name) {
    super(name);
  }

  @Override
  public String play() {
    return reaction;
  }
}
