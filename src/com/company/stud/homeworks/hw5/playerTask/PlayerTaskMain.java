package com.company.stud.homeworks.hw5.playerTask;

public class PlayerTaskMain {

  public static void main(String[] args) {

    Player player0 = new Player(0, 0);
    player0.printPlayersData();
    player0.move(10, 10);
    player0.move(20, 20);
//    player0.countDistance(20, 20);

    Player player1 = new Player(0, 0);
    player1.printPlayersData();
    player1.move(3,4);
    player1.printPlayersData();
    player1.move(9,12);
    player1.printPlayersData();
    player1.move(0,0);
    player1.printPlayersData();
    System.out.println(player1.toString());

    Object player2 = new Player(3, 5);
    player2.toString();

//    System.out.println(player1.getX() + ":" + player1.getY());
    /*System.out.println(player1);
    player1.setX(10);
    System.out.println(player1);
    System.out.println();


    player1.move(20, 20);
    System.out.println(player1);
    player1.printCurrentPosition();

    */

  }
}
