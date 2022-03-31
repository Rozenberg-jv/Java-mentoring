package com.company.stud.homeworks.hw7.task1;

public class Circle implements Shape {

  private double radius;

  public Circle(double radius) {
    if (radius <= 0)
      throw new RuntimeException();
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double getPerimeter() {
    return Math.PI * 2 * radius;
  }

  @Override
  public String toString() {
    return "Circle{" +
      "radius=" + radius +
      '}';
  }
}
