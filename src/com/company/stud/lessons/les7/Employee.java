package com.company.stud.lessons.les7;

public abstract class Employee {

  private String name;
  private int age;

  public Employee() {

  }

  public Employee(String name) {
    this(name, 18);
  }

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
//    System.out.println("Employee constructor");
  }

  public abstract void eat(String dish);

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "name='" + name + '\'' +
      ", age=" + age +
      '}';
  }
}
