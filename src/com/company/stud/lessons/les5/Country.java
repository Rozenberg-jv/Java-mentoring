package com.company.stud.lessons.les5;

class Country {

  private String title;
  private int zipCode;

  Country(String title, int zipCode) {
    this.title = title;
    this.zipCode = zipCode;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getZipCode() {
    return zipCode;
  }

  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }
}
