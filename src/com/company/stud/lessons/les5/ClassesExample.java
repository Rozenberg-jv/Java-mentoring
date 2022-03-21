package com.company.stud.lessons.les5;

public class ClassesExample {

  public static void main(String[] args) {

    System.out.println(Math.PI);

    Person.setCounter(100);
    System.out.println(Person.counter);

    // person1
    Person person1 =
      new Person("Maxim", 100, new Country("Belarus", 220113), Sex.MALE); // рассказать про сравнение объектов
//    Country countryTemp = new Country("Tmp", 1000);
    // CRUD Create Read Update Delete
//    person1.country = new Country("Not default country", 200000);
    Country countryMaxim = person1.getCountry();
    countryMaxim.setTitle("Ukraine");
    countryMaxim.setZipCode(55555);

    System.out.println(person1.getCountry().getTitle() + " " + person1.getCountry().getZipCode());

    // person2
    Person person2 = new Person();

    person2.setName("Tanya");
    person2.age = 30;
//    person2.setCountry(new Country("Belarus", 220113));
    person2.setSex(Sex.FEMALE);

    //
    System.out.println(person1.getName() + " is " + person1.getAge() + " years old");

    person1.walk();
    person2.walk();
    person1.walk(5, "park");
    person2.walk("skirt", 10);
    person1.eat("fish");
    int newAge = person1.growOld();
    System.out.println(newAge);
    System.out.println(person1.getAge());

    person2.eat("meat");

    System.out.println();

    System.out.println(Person.counter);
    Person.setCounter(5);
  }
}
