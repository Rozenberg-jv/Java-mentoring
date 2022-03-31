package com.company.stud.lessons.les11;

public class ExampleClass {

  public void exampleMethod1() {
    System.out.println("exampleMethod1 start");
    exampleMethod2();
    System.out.println("exampleMethod1 end");
  }

  public void exampleMethod2() {
    System.out.println("exampleMethod2 start");
    if (true) {
      throw new MyOwnException("lalala");
    }
    System.out.println("exampleMethod2 end");
  }

}
