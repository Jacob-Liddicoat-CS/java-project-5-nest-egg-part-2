//Calculates your retirement fund each year
import java.io.*;
import java.util.*;
public class nestEgg2
{
 public static void main(String args[]) throws IOException
 {
  double salary;
  int save;
  int nretirement;
  double growthRate; 
  salary = Double.parseDouble(args[0]);//Inputs your salary
  save = Integer.parseInt(args[1]);//Inputs percentage of your salary put into your retirement fund
  nretirement = Integer.parseInt(args[2]);//Inputs number of remaining years to retirement
  growthRate = Double.parseDouble(args[3]);//Inputs growth rate

  Scanner sf = new Scanner(new File("./growthRate.txt"));
  int maxIndx = -1;
  String growthRate[] = new String[100];
  while(sf.hasNext())
  {
	maxIndx++;
	growthRate[maxIndx] = sf.nextLine();
  }
  sf.close();

  double G = 0;
  for (int year = 0; year < nretirement; year++)
  {
   F = G  * (1 + 0.01 * growthRate[year]) + salary * save * 0.01; //Calculates the value of this year
   G = F;
  }

  System.out.println(year + F + growthRate[year]);
 }
}


