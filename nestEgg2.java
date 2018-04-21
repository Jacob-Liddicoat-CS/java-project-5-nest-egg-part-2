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
  double F1 = salary * save * 0.01;//Calculates your retirement fund for the fi$
  double F2 = F1 * (1+0.01 * growthRate) + salary * save * 0.01;//Calculates yo$
  double F3 = F2 * (1+0.01 * growthRate) + salary * save * 0.01;//Calculates yo$

  Scanner sf = new Scanner(new File("./growthRate.txt"));
  int maxIndx = -1;
  String text[] = new String[100];
  while(sf.hasNext())
  {
	maxIndx++;
	text[maxIndx] = sf.nextLine();
  }
  sf.close();

  System.out.println("End of year 1:" + F1);
  System.out.println("End of year 2:" + F2);
  System.out.println("End of year 3:" + F3);
 }
}


