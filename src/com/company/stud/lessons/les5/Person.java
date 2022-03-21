package com.company.stud.lessons.les5;

public class Person {

  public static int counter = 0;

  private String name;
  public int age;
  private final Country country;
  public Sex sex;

  public Person() {
    this.sex = Sex.UNKNOWN;
    age = 18;
    this.country = new Country("Default Country", 10000);

    Person.counter++;
  }

  public Person(String name, int age, Country country, Sex sex) {
    this.name = name;
    this.age = age;
    this.country = country;
    this.sex = sex;

    Person.counter++;
  }

  public static void setCounter(int counter) {
    Person.counter = counter;
  }

  public void walk() {
    if (age > 90) {
      return;
    }
    System.out.println();
    System.out.println(this.name + " is walking");
  }

  public void walk(int time, String place) {
//    System.out.println(this.name + " is walking for " + time + " minutes" + " on " + place);
    this.walk();
    System.out.println("Time: " + time + ", place: " + place);
  }

  public void walk(String clothes, int time) {
    System.out.println(this.name + " is walking for " + time + " wearing " + clothes);
  }

  public void eat(String dish) {
    System.out.println(this.name + " is eating " + dish);
  }

  public int growOld() {
    return ++age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public Country getCountry() {
    return country;
  }

//  public void setCountry(Country country) {
//    this.country = country;
//  }

  public void setSex(Sex sex) {
    this.sex = sex;
  }
}