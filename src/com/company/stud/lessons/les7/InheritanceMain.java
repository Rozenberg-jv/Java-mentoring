package com.company.stud.lessons.les7;

public class InheritanceMain {

  public static void main(String[] args) {

//    Employee empl1 = new Employee("Maxim", 20);

//    Employee empl2 = new Employee("Igor");

    Worker worker1 = new Worker("Maxim", 20, "pickaxe");

    Manager manager = new Manager("Tanya", 19, 123456789);

    /*Class<? extends Employee> aClass = empl2.getClass();
    aClass.*/ // Java Reflection API

    /*empl2.eat("bread");
    worker1.eat("meat");
    manager.eat("rise");*/
//    new Manager("Marina", 30, 5431487);
    Employee empl3 = worker1;
    empl3.eat("potato");
//    empl3.work("afe");
    ((Worker) empl3).work();
    System.out.println(worker1.getName());

    empl3 = manager;
    empl3.eat("potato");
    ((Manager) empl3).ring(12346736);

    Object o = worker1;

    ToolWorker toolWorker = worker1;
//    toolWorker.getName();

    /*Manager man2 = (Manager) new Employee(); // to cast = приводить
    man2.ring(123456);*/

    System.out.println(empl3 instanceof Worker);
    System.out.println(empl3 instanceof Employee);
    System.out.println(empl3 instanceof Manager);
  }

}
