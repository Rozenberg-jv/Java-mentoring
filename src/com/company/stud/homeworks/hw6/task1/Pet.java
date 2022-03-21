package com.company.stud.homeworks.hw6.task1;

public abstract class Pet {

  private final String name;
//  private final String type;
//  private final String reaction;

  public Pet(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract String play();
}
