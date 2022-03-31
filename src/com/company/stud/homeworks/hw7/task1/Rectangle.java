package com.company.stud.homeworks.hw7.task1;

public class Rectangle extends Square {

  private double y;

  public Rectangle(double x, double y) {
    super(x);
    if (y <= 0)
      y = Math.abs(y);
    this.y = y;
  }

  @Override
  public double getArea() {
    return x * y;
  }

  @Override
  public double getPerimeter() {
    return (x + y) * 2;
  }

  @Override
  public String toString() {
    return String.format("Rectangle[%.2f,%.2f]", x, y);
  }
}
