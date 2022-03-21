package com.company.stud.lessons.les5;

public enum Sex {
// public static final Sex MALE = new Sex(true);
  MALE(true), FEMALE(true), UNKNOWN(false);

  private boolean b;

  Sex(boolean b) {
    this.b = b;
  }

  public boolean isB() {
    return b;
  }
}
