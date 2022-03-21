package com.company.stud.lessons.les6;

import java.util.Random;

public class ExampleLes6 {

  public static void main(String[] args) {

    double random = Math.random();

    System.out.println((int) (random * 100));

    int a = 5;
    Integer b = 50000;
    // 0 1
    // 0 1 2 3 4 5 6 7 8 9
    // 0 1 2 3 4 5 6 7 8 9 A B C D E F
    System.out.println(Integer.toHexString(14));

    String str = "126";
    int c = Integer.parseInt(str);
    System.out.println(c);

    Random random1 = new Random();

    random1.nextInt(100);

  }

}
