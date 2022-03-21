package com.company.stud.lessons.les1;

public class ExampleClassname {

  static String hello;

  public static void main(String[] args) {//0

    long l;
    String str = "3";
//        method0();
    int s = 3;
    int i = method1(s, 2);
    l = 5;
    System.out.println(i);
    System.out.println(str);
    System.out.println();
    System.out.println(method1(6, 2) + method2(10));
    byte t = (byte) 129;

    char c1 = 'a';
    /*{//1
      {//2
        int qwe = 5;
      }
      c1 = 'a';
    }*/
//    double qwe = 1;
    System.out.println();
    System.out.println("char c1 = 'a': " + c1);
    char c2 = 97;
    System.out.println("char c2 = 97: " + c2);
    System.out.println("(c1 + 2): " + (c1 + 2));
    System.out.println("(char) (c1 + 2): " + (char) (c1 + 2));
    System.out.println();
    int w;
    byte b = 127;
    b = (byte) (b + 2);
    System.out.println("byte: " + b);

    System.out.println();
    int a1 = 35;
    double a2 = 10;
    System.out.println(a1 / a2);

    System.out.println();
    System.out.println(a1++);
    System.out.println(a1);

    /**/

    System.out.println(hello);

    String str3 = 15 + (b + "fwefg");

  }
/*
    private static void method0() {
        method0();
    }*/

  private static int method1(int q1, int q2) {

    int i = method2(q1);
    System.out.println(q1);
    return i + method2(q2 * 2);
  } //

  //
  private static int method2(int w) {

    return w - 1;
  }
}
