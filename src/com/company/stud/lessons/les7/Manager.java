package com.company.stud.lessons.les7;

public class Manager extends Employee implements ToolWorker {

  private int phoneNumber;

  public Manager(String name, int age, int phoneNumber) {
    super(name, age);
    this.phoneNumber = phoneNumber;
  }

  public void ring(int phoneNumber) {
    System.out.println("ring " + phoneNumber);
  }

  @Override
  public void work(String tool) {
    System.out.println(super.getName() + " works not hard with " + tool);
  }

  public void eat(String dish) {
    System.out.println(super.getName() + " is eating " + dish.toUpperCase() + " like a manager");
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return super.toString() + " " + this.phoneNumber;
  }
}
