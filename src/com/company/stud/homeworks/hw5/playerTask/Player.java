package com.company.stud.homeworks.hw5.playerTask;

public class Player extends Object{

  private int x,y;
  private double distance;

  public Player(int x, int y) {
    this.x = x;
    this.y = y;
    this.distance = 0;
  }

  public void move(int newX, int newY) {
    this.distance += countDistance(newX, newY);
    this.x = newX;
    this.y = newY;
  }

  public void move(double xDelta, double yDelta) {
    //
  }

  private double countDistance(int newX, int newY) {
    return Math.sqrt(Math.pow(this.x - newX, 2) + Math.pow(this.y - newY, 2));
  }

  public void printPlayersData() {
    System.out.printf("%d:%d [%.2f]\n", x, y, distance);
  }

  /*public void moveX(int x) {
    distance += countDistance(x, this.y);
    this.x = x;
  }

  public void moveY(int y) {
    this.y = y;
  }*/

  @Override
  public String toString() {
    return "Player{" + x + ":" + y + "}, distance: " + distance;
  }
}
