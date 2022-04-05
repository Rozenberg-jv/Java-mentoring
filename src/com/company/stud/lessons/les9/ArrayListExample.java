package com.company.stud.lessons.les9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListExample {

  public static void main(String[] args) {

    // queue, dequeue

    Collection<String> list1 = new ArrayList<>();

    list1.add("abc");
    list1.add("!! new Person");
    list1.add("5");

    List<String> list2 = new ArrayList<>();
    list2.add("abc");
    list2.add("5");
    list2.add("weger");

    list1.forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });
    list1.forEach((String el) -> {
      System.out.println(el);
    });
    list1.forEach(System.out::println);

    List<String> list = Arrays.asList();

    // Ctrl + Ins
    // Shift + Ins

    /*System.out.println(list1.get(1));
    System.out.println(list1.size());

    list1.remove("abc");
    System.out.println(list1.size());

    list1.removeAll(list2);
    System.out.println(list1.size());
    System.out.println(list1);

    System.out.println(list1.contains("!! new Person"));
    System.out.println(list1.contains("abc"));*/

    /*list1.addAll(list2);
    System.out.println(list1.size());

    System.out.println(list1.indexOf("abc"));
    System.out.println(list1.lastIndexOf("abc"));

    list1.add(3, "qwerty");
    System.out.println(list1);

    list1.set(3, "QAWSED");
    System.out.println(list1);*/

    Integer a = 5;
    a *= 2;
    System.out.println(a);

    List<Integer> numberList = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      numberList.add(i);
    }
    System.out.println(numberList);

    /*for (int i = 0; i < numberList.size(); i++) {
      if (numberList.get(i) % 2 == 0) {
        numberList.remove(i);
      }
    }
    System.out.println(numberList);*/

    Iterator<Integer> iterator = numberList.iterator();

    while (iterator.hasNext()) {
      Integer next = iterator.next();
      if (next % 2 == 0) {
        iterator.remove();
      }
    }
    System.out.println(numberList);
  }

}
