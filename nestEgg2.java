//Calculates your retirement fund each year
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class nestEgg2
{
 public static void main(String args[]) throws IOException
 {
  double salary;
  int save;
  int nretirement;
  int expenses;
  double growthRate;
  salary = Double.parseDouble(args[0]);//Inputs your salary
  save = Integer.parseInt(args[1]);//Inputs percentage of your salary put into your retirement fund
  nretirement = Integer.parseInt(args[2]);//Inputs number of remaining years to retirement
  expenses = Integer.parseInt(args[3]);//Inputs your expenses

  FileReader fr = new FileReader("growthRate.txt");//Reads txt file
  BufferedReader textReader = new BufferedReader(fr);
  double GrowthRates[] = new double[60];
  for (int i = 0; i <= 59; i++)
  {
	GrowthRates[i] = Double.parseDouble(textReader.readLine());//Changes txt file to a double
  }
  double G = 0;
  double F = 0;
  int year;
  for (year = 0; year < nretirement; year++)
  {
   F = G * (1 + 0.01 * GrowthRates[year]) + salary * save * 0.01; //Calculates the value of this year
   G = F;
   System.out.println("Year: " + year + ", F=" + F + ", Rate=" +  GrowthRates[year]);
  }
 }
}
