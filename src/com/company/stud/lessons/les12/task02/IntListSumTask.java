package com.company.stud.lessons.les12.task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntListSumTask {

  public static void main(String[] args) {

    List<Integer> list1 = Arrays.asList(1, 5, 3);
    List<Integer> list2 = Arrays.asList(2, -5, 4, 10);

    List<Integer> result = sumLists(list1, list2);
    System.out.println(result);
  }

  private static List<Integer> sumLists(List<Integer> list1, List<Integer> list2) {

    List<Integer> result = new ArrayList<>();

    int minSize = Math.min(list1.size(), list2.size());

    for (int i = 0; i < minSize; i++) {
      result.add(list1.get(i) + list2.get(i));
    }

    result.addAll(list1.size() > list2.size() ?
      list1.subList(minSize, list1.size()) :
      list2.subList(minSize, list2.size()));

    return result;
  }

}
