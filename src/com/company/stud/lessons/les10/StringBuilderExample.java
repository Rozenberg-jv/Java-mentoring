package com.company.stud.lessons.les10;

import java.util.HashMap;
import java.util.Map;

public class StringBuilderExample {

  public static void main(String[] args) {

    // StringBuffer
    StringBuilder sb = new StringBuilder();

    sb.append("abc");
    sb.append(1);
    sb.append('R');

    String s = sb.toString();

    System.out.println(s + "ffew" + "r123f");
    Map<Object, Object> map = new HashMap<>();

    map.forEach((k,v) -> System.out.println(k + " " + v));

  }
}