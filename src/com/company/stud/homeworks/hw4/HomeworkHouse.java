package com.company.stud.homeworks.hw4;

public class HomeworkHouse {

  public static void main(String[] args) {

    Home home = new Home(
      "office",
      new Address(15, "Lenina"),
      9,
      true,
      Material.CONCRETE,
      1979
    );

    System.out.println(home.getMaterial());

//    System.out.println(String.valueOf(home.getFloors()));

    System.out.println(home);

  }

}
