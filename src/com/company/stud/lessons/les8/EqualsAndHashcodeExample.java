package com.company.stud.lessons.les8;

import java.text.Format;
import java.util.Formatter;

public class EqualsAndHashcodeExample {

  public static void main(String[] args) {

    /*EqualityObject o1 = new EqualityObject("object1", 1);
    EqualityObject o2 = new EqualityObject("object1", 1);

    System.out.println(o1 == o2);

    System.out.println(o1.equals(o2));

    System.out.println(o1.hashCode() == o2.hashCode());*/

//    System.out.println(o1.equals(o1));
//    System.out.println(o1.equals(new Person()));

    int a = 15;

    String s1 = "abc1";
    String s2 = "abc1"; // immutable

    s1 = s1 + "2"; // string pool

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    System.out.println(Math.PI);

    System.out.printf("\tval1: %s\n\tval2: %s\n\tval3: %-10.3f\n", s1, s2, Math.PI);

    String format = String.format("\tval1: %s\n\tval2: %s\n\tval3: %-10.3f\n", s1, s2, Math.PI);
    System.out.println(format);
  }

}
