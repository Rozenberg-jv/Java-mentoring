package com.company.stud.homeworks.hw6.task5;

public class Entity {

  private String name;

  Entity(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Entity{" +
      "name='" + name + '\'' +
      '}';
  }
}
