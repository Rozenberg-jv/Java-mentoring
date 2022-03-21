package com.company.stud.lessons.les3;

import com.company.stud.lessons.les2.Table;

public class Main {

  static int b;
  static String s;

  public static void main(String... args) {

    int a = 5;
    long l1 = 123, l2 = 125, l3 = 90;

    Table[] tables = new Table[2];

    String[] strArray = {"1", "abc", "dqw", "123"};

    int[] array1 = new int[5];
//    System.out.println(array1.length);
    int[] array2 = new int[] {1, -4, 5, 0, 3};

    for (int i = 0; i < array1.length; i++) {
      array1[i] = i * 2 + 1;
//      array1[i] = (i + 1) * 2;
    }
    System.out.println();
    int sum = 0;

    for (int i = 0, k; i < array1.length; i++) {
      k = array1[i];
      System.out.println(k);
      sum = sum + array1[i];
    }
    System.out.println();
    System.out.println(sum);
    System.out.println();

    sum = 0;
    for (int k : array1) {
      System.out.println(k);
      sum += k;
    }
    System.out.println();
    System.out.println("Sum: " + sum);
    System.out.println();

    int[][] multiArray = new int[][] {{1, 2}, {1}, {1, 2, 3, 4}};
    for (int i = 0; i < multiArray.length; i++) {
      for (int j = 0; j < multiArray[i].length; j++) {
        System.out.print(multiArray[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println();

    // {{1, 2}, {1}, {1, 2, 3, 4}}
    // {{5, 6}, {3, -11}, {0, 22}}

    System.out.println("END");

    /*System.out.println();
    method("strArray", "f23", "f34", "abc");*/

    System.out.println();
    method(new String[] {"a", "b", "c"});
    method2();
  }

  public static void method0(String[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static void method(String[] array) {
    for (String s : array) {
      System.out.print(s + " ");
    }
    System.out.println();
  }

  public static void method2(String... array) {
    for (String arg : array) {
      System.out.print(arg + " ");
    }
    System.out.println();
  }


}
