package com.company.stud.homeworks.hw8.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

  public static void main(String[] args) {

    double sum = 0;

    try (BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in))) {

      int linesCount = Integer.parseInt(rdr.readLine());

      for (int i = 0; i < linesCount; i++) {
        String[] line = rdr.readLine().split(" ");
        sum += Double.parseDouble(line[1]) * Integer.parseInt(line[2]);
      }
    } catch (NumberFormatException e) {
      System.err.println("Can't parse number");
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println(sum);
  }
}