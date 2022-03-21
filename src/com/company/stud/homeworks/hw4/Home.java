package com.company.stud.homeworks.hw4;

public class Home {

  private String purpose;
  private Address address; // HAS-A
  private int floors;
  private boolean hasElevator;
  private Material material;
  private int yearOfBuilding;

  public Home(String purpose, Address address, int floors, boolean hasElevator,
    Material material, int yearOfBuilding) {
    this.purpose = purpose;
    this.address = address;
    this.floors = floors;
    this.hasElevator = hasElevator;
    this.material = material;
    this.yearOfBuilding = yearOfBuilding;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public int getFloors() {
    return floors;
  }

  public void setFloors(int floors) {
    this.floors = floors;
  }

  public boolean isHasElevator() {
    return hasElevator;
  }

  public void setHasElevator(boolean hasElevator) {
    this.hasElevator = hasElevator;
  }

  public Material getMaterial() {
    return material;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public int getYearOfBuilding() {
    return yearOfBuilding;
  }

  public void setYearOfBuilding(int yearOfBuilding) {
    this.yearOfBuilding = yearOfBuilding;
  }

  @Override
  public String toString() {
    return "Home{" +
      "purpose='" + purpose + '\'' +
      ", address=" + address +
      ", hasElevator=" + hasElevator +
      '}';
  }
}
