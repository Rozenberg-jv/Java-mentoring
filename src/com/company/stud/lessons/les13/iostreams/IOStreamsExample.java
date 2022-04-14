package com.company.stud.lessons.les13.iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.Buffer;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

public class IOStreamsExample {

  private static final String END_COMMAND = "end";

  public static void main(String[] args) throws IOException {

//    File inputFile = new File("D:\\stud\\input.in");
    File outputFile = new File("D:\\stud\\input.out");
//    Path path = Path.of("");
//    path.toString();
    try (
      BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter out = new BufferedWriter(new FileWriter(outputFile))
    ) {

      int i = 1;

      String line;

      do {
        System.out.print(i + ") ");
        line = rdr.readLine(); //abc 13 2.21

        /*
        String[] splitted = line.split(" "); // ["abc", "13", "2.21"]
        String s = splitted[0];
        int c = Integer.parseInt(splitted[1]);
        double d = Double.parseDouble(splitted[2]);
        */

        out.write(i++ + " - " + line.toUpperCase().replaceAll("\\d", "*"));
        out.newLine();
      } while (!line.equals("end"));

      System.out.println();

      out.flush();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
