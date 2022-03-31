package com.company.stud.homeworks.hw7.task1;

public class Square implements Shape {

  private static final double DEFAULT_X = 10;

  protected double x;

  public Square(double x) {
    if (x <= 0)
      x = DEFAULT_X;
    this.x = x;
  }

  @Override
  public double getArea() {
    return x * x;
  }

  @Override
  public double getPerimeter() {
    return 4 * x;
  }

  @Override
  public String toString() {
    return String.format("Square[%.2f]", x);
  }
}
