package com.company.stud.homeworks.hw6.task2;

import java.util.List;

public class Task2 {

  public static void main(String[] args) {

    PersonList personsList = new PersonList();

//    personsList.getList().add();

    personsList.addPerson(new PersonTask2("person1", 1));
    personsList.addPerson(new PersonTask2("person2", 2));
    personsList.addPerson(new PersonTask2("person3", 3));
    personsList.addPerson(new PersonTask2("person2", 4));
    personsList.addPerson(new PersonTask2("person1", 5));

    List<PersonTask2> result = personsList.getPersonByName("person2");
//    System.out.println(person == null ? "Nothing was found" : person.toString());
    System.out.println(result.isEmpty() ? "Nothing was found" : result.toString());
  }

}
