package com.company.stud.homeworks.hw6.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5 {

  public static void main(String[] args) {

    Map<Entity, List<String>> entityMap = new HashMap<>();
    List<String> shoppingList1 = new ArrayList<>();
    shoppingList1.add("beer");
    shoppingList1.add("vodka");
    shoppingList1.add("fish");
    shoppingList1.add("bread");
    List<String> shoppingList2 = new ArrayList<>();
    shoppingList2.add("bread");
    shoppingList2.add("milk");
    shoppingList2.add("apple");
    shoppingList2.add("potato");
    List<String> shoppingList3 = new ArrayList<>();
    shoppingList3.add("potato");
    shoppingList3.add("bread");
    shoppingList3.add("solt");
    shoppingList3.add("chicken");
    List<String> shoppingList4 = new ArrayList<>();
    shoppingList4.add("beer");
    shoppingList4.add("fish");
    shoppingList4.add("chips");
    shoppingList4.add("solt");
    List<String> shoppingList5 = new ArrayList<>();
    shoppingList5.add("cucumbers");
    shoppingList5.add("tomatoes");
    shoppingList5.add("potato");
    shoppingList5.add("bread");
    shoppingList5.add("solt");

    Entity en1 = new Entity("Vasya");
    Entity en2 = new Entity("Olya");
    Entity en3 = new Entity("Maksim");
    Entity en4 = new Entity("Dima");
    Entity en5 = new Entity("Masha");
    entityMap.put(en1, shoppingList1);
    entityMap.put(en2, shoppingList2);
    entityMap.put(en3, shoppingList3);
    entityMap.put(en4, shoppingList4);
    entityMap.put(en5, shoppingList5);


   /* for (List lt : entityMap) {
      for (String st : entityMap.values) {
        if (!entityMap.containsKey(st)) {
          entityMap.put(st, 1);
        } else {
          entityMap.put(st, entityMap.get(st) + 1);
        }
      }
    }*/
    entityMap.forEach((k, v) -> System.out.printf("[%s] : %d\n", k, v));

  }

}
