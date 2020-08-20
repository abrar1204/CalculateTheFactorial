
import java.util.Scanner;

public class CalcTheFactorial
  
{
  public static void main(String[] args)
  {
    Scanner factorial = new Scanner(System.in);
  
    int number; 
    
    System.out.println("Enter the number that you want to calculate a factorial of: "); 
    number = factorial.nextInt();
    
    System.out.println(number + "! = " + calc(number));
  }
  
  public static int calc(int number) 
  {
    if (number == 0)
    {
      return 1;
    }
    else
    {
      return number * calc( number - 1 );
    }
  }
}
  