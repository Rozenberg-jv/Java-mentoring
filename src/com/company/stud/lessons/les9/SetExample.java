package com.company.stud.lessons.les9;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

  public static void main(String[] args) {

    Set<Example> set1 = new HashSet<>();

    set1.add(new Example(1));
    set1.add(new Example(2));
    set1.add(new Example(3));
    set1.add(new Example(1));

    System.out.println(set1.size());
    System.out.println(set1);

    /*for (Example example : set1) {
      if (example.getValue() % 2 == 0)
        set1.remove(example);
    }
    System.out.println(set1);*/



  }

}
