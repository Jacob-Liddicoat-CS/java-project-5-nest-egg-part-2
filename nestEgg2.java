import java.io.*;
import java.util.*;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class nestEgg2 {
  public static void main(String args[]) throws IOException {
    double salary;
    int save;
    int nretirement;
    double growthRate;
    FileReader fr = new FileReader("growthRate.txt");
    BufferedReader textReader = new BufferedReader(fr);
			
    for (int i = 1; i <= 60; i++){
      data = Double.parseDouble(textReader.readLine());
      System.out.println(data);
    }
  }
}
