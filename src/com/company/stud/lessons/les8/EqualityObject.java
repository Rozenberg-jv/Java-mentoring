package com.company.stud.lessons.les8;

import java.util.Objects;

public class EqualityObject {

  private String name;
  private int value;

  public EqualityObject(String name, int value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (!(o instanceof EqualityObject)) {
      return false;
    }

    EqualityObject that = (EqualityObject) o;

    if (value != that.value) {
      return false;
    }

    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + value;
    return result;
  }

  @Override
  public String toString() {
    return "EqualityObject{" +
      "name='" + name + '\'' +
      ", value=" + value +
      '}';
  }
}
