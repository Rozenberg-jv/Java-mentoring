package com.company.stud.lessons.les4;

public class SwitchExample {

  public static void main(String[] args) {

    int dayOfWeek = 6;

    String t = null;

    switch (dayOfWeek) {
      case 1:
        t = "monday";
        break;
      case 2:
        t = "tuesday";
        break;
      case 3:
        t = "wednesday";
        break;
      case 4:
        t = "thursday";
        break;
      case 5:
        t = "friday";
        break;
      case 6:
      case 7:
        t = "HOLIDAYS!";
        break;
      default:
        t = "! WRONG INPUT !";
        break;
    }

    System.out.println(t);
  }
}
