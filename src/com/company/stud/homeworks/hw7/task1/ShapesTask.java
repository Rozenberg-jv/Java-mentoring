package com.company.stud.homeworks.hw7.task1;

import java.util.ArrayList;
import java.util.List;

public class ShapesTask {

  public static void main(String[] args) {

    double area;
    double perimeter;

    List<Shape> shapes = new ArrayList<>();
    try {
      shapes.add(new Circle(-10));
    } catch (RuntimeException e) {
      System.err.println("Invalid input value");
    }
      shapes.add(new Square(-100));
      shapes.add(new Rectangle(-10, -5));

//    shapes.add(new Triangle(1,2,3));

    for (Shape shape : shapes) {
      /*area = CalcUtils.getShapeArea(shape);
      perimeter = CalcUtils.getShapePerimeter(shape);*/
      area = shape.getArea();
      perimeter = shape.getPerimeter();
      System.out.printf("%s, area = %.2f, perimeter = %.2f\n", shape, area, perimeter);
    }

    System.out.println(shapes.get(0).getArea());

  }

}
