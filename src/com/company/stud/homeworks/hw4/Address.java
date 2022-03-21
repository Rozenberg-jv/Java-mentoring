package com.company.stud.homeworks.hw4;

public class Address {

  private int houseNumber;
  private String streetName;

  public Address(int houseNumber, String streetName) {
    this.houseNumber = houseNumber;
    this.streetName = streetName;
  }

  public int getHouseNumber() {
    return houseNumber;
  }

  public String getStreetName() {
    return streetName;
  }

  @Override
  public String toString() {
    return "Address{" +
      "houseNumber=" + houseNumber +
      ", streetName='" + streetName + '\'' +
      '}';
  }
}
