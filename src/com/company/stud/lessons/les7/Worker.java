package com.company.stud.lessons.les7;

public class Worker extends Employee implements ToolWorker {

  private String tool;

  public Worker(String name, int age, String tool) {
    super(name, age);
//    System.out.println("Worker constructor");
    this.tool = tool;
  }

  public void eat(String dish) {
//    super.eat(dish);
    System.out.println(super.getName() + " is eating " + dish.toUpperCase() + " like a worker");
  }

  @Override
  public void work(String tool) {
    System.out.println(super.getName() + " works hard with " + tool);
  }

  public void work() {
    System.out.println(super.getName() + " works hard");
  }

  public String getTool() {
    return tool;
  }

  public void setTool(String tool) {
    this.tool = tool;
  }

  @Override
  public String toString() {
    return super.toString() + " " + this.tool;
  }
}
