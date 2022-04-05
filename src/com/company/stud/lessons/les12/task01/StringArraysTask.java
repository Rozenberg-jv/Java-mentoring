package com.company.stud.lessons.les12.task01;

import java.util.Arrays;
import java.util.List;

public class StringArraysTask {

  public static void main(String[] args) {
    List<String> list1 = Arrays.asList("String 1", "String 5", "String 8", "String 11");
    List<String> list2 = Arrays.asList("String 2");
    List<String> list3 = Arrays.asList("String 3", "String 6", "String 9", "String 12");
    List<String> list4 = Arrays.asList("String 4", "String 7", "String 10");

    List<List<String>> allList = Arrays.asList(list1, list2, list3, list4);

    // find max length of list
    int maxListSize = 0;
    for (List<String> list : allList) {
      if (list.size() > maxListSize) {
        maxListSize = list.size();
      }
    }

    for (int i = 0; i < maxListSize; i++) {
      for (List<String> list : allList) {
        if (list.size() <= i) {
          continue;
        }
        System.out.println(list.get(i));
      }
    }

  }

}
