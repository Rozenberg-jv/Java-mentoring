package com.company.stud.lessons.les4;

import com.company.stud.lessons.les5.Person;
import com.company.stud.lessons.les5.Sex;

import java.util.Arrays;

public class Stepi12 {

  public static void main(String[] args) {

    int inp = 5;

    int[] array = new int[inp];

    for (int i = 0, k = 0; k < inp; i++) {
      for (int j = 0; j <= i; j++) {
        array[k++] = i;
      }
    }
    /*Person person1 = new Person();
    person1.sex = Sex.UNKNOWN;
    person1.ea*/

    System.out.println(Arrays.toString(array));
  }

}
