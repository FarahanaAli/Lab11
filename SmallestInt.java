import java.util.Scanner;

public class SmallestInt
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a value for x:");
      int x = scan.nextInt();
      System.out.println("Enter a value for y:");
      int y = scan.nextInt();
      System.out.println("Enter a value for y:");
      int z = scan.nextInt();
      if (x >= y && x >=z)
         System.out.println("The bigger value was " + x);
      else if(z>=x && z>=y)
      System.out.println("The bigger value was " + z);
      else
         System.out.println("The bigger value was " + y);
   }
}
