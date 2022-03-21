package com.company.stud.lessons.les2;

public class Table {

  int x, y;
  int length, width;

  int legsNumber;

  String color;

  void move(int x, int y) {
    this.x = x;
    this.y = y;
  }

  void recolor(String newColor) {
    this.color = newColor;
  }

  void broke() {
    System.out.println("Сломался");
  }

}
