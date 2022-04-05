package com.company.stud.homeworks.hw7.interface_example;

import java.util.List;

public class IntExample {

  public static void main(String[] args) {
    System.out.println(ExInt.VALUE);
    System.out.println(ExInt.getInt());

    ExInt clazz1 = new Clazz1();
    ExInt clazz2 = new Clazz2();

    System.out.println(clazz1.getValue(""));
    System.out.println(clazz2.getValue(""));
    System.out.println(ExInt.getInt());

    System.out.println(clazz1.getDefaultInt(100));
    System.out.println(clazz2.getDefaultInt(100));

    System.out.println();

  }

}
