package com.company.stud.lessons.les11;

public class ExceptionsExample {

  public static void main(String[] args) {

    System.out.println("Main start");

    staticMethod();

    System.out.println("Main end");
  }
  // # октоторп
  // ^ циркумфлекс
  public static void staticMethod() {
    System.out.println("staticMethod start");
    try {
      new ExampleClass().exampleMethod1();
    } catch (MyOwnException | NullPointerException e) {
      System.out.println("NPE or MyOwnException " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Common Exception");
      for (StackTraceElement el : e.getStackTrace()) {
        System.out.println(el);
      }
    } finally {
      System.out.println("finally");
    }

    // try catch
    // try catch catch
    // try finally
    // try catch finally

    System.out.println("staticMethod end");
  }
}
