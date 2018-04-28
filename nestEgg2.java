import java.io.*;
import java.util.*;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class nestEgg2 {
  public static void main(String args[]) throws IOException
   {
    double salary;
    int save;
    int nretirement;
    double growthRate;
    salary = Double.parseDouble(args[0]);//Inputs your salary
    save = Integer.parseInt(args[1]);//Inputs percentage of your salary put into your retirement fund
    nretirement = Integer.parseInt(args[2]);//Inputs number of remaining years to retirement

    FileReader fr = new FileReader("growthRate.txt");//Reads txt file
    BufferedReader textReader = new BufferedReader(fr);
			
    for (int i = 1; i <= 60; i++){
      growthRate = Double.parseDouble(textReader.readLine());
      System.out.println(growthRate);
    }
  }
}
