package com.company.stud.lessons.les9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

  public static void main(String[] args) {

    Map<String, Integer> map1 = new HashMap();

    map1.put("Vasily", 10);
    map1.put("Irina", 15);
    map1.put("Tatyana", 5);
    map1.put("Vasily", 30);

    System.out.println(map1);

    System.out.println(map1.get("Irina"));
    System.out.println(map1.get("qwe"));

    Map<Integer, List<String>> map2 = new HashMap<>();

    List<String> list1 = new ArrayList<>();
    list1.add("abc1");
    list1.add("cde1");
    List<String> list2 = new ArrayList<>();
    list2.add("abc2");
    list2.add("cde2");

    map2.put(1, list1);
    map2.put(2, list2);

    System.out.println(map2);

    System.out.println(map2.get(2).get(0));

    
  }

}
