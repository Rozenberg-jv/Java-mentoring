package com.company.stud.lessons.les2;

public class Lesson2 {

  public static void main(String[] args) {

    int i;
    Table table1 = new Table();

    table1.x = 10;
    table1.y = 20;
    System.out.println(table1.x + " " + table1.y);

    table1.move(15, 50);
    System.out.println(table1.x + " " + table1.y);

    Table table2 = new Table();
    Table table3 = new Table();

    table2.x = -100;
    table2.move(100, 500);
  }
}
