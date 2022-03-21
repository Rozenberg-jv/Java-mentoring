package com.company.stud.homeworks.hw6.task2;

public class PersonTask2 {

  private String name;
  private int number;

  public PersonTask2(String name, int number) {
    this.name = name;
    this.number = number;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name + " " + number;
  }
}
