package com.company.stud.lessons.les9;

public class Example {

  private int value;

  public Example(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Example)) {
      return false;
    }

    Example example = (Example) o;

    return value == example.value;
  }

  @Override
  public int hashCode() {
    return value;
  }

  @Override
  public String toString() {
    return "Example{" + value + '}';
  }
}
