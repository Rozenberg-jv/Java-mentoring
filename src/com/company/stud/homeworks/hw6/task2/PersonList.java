package com.company.stud.homeworks.hw6.task2;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

  private List<PersonTask2> list = new ArrayList<>();

  public List<PersonTask2> getList() {
    return list;
  }

  public void addPerson(PersonTask2 person) {
    this.list.add(person);
  }

  public List<PersonTask2> getPersonByName(String name) {

    List<PersonTask2> result = new ArrayList<>();

    for (PersonTask2 person : list) {
      if (person.getName().equals(name)) {
        result.add(person);
      }
    }

    return result;
  }

}
