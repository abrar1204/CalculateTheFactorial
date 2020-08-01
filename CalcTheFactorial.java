
public class Factorial2 
  
{
  public static void main(String[] args)
  {
    System.out.println("6! = " + calc(6));
  }
  
  public static int calc(int n) 
  {
    if (n == 0)
    {
      return 1;
    }
    else
    {
      return n * calc( n - 1 );
    }
  }
}
  
