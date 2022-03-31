package com.company.stud.homeworks.hw7.interface_example;

public interface ExInt {

  double VALUE = 5;

  double getValue(String param);

  static int getInt() {
    return 11;
  }

  default int getDefaultInt(int param) {
    return privMethod(param);
  }

  private int privMethod(int param) {
    return param + 10;
  }

}
