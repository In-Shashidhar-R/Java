/*Ch.en.u4aie22058
SHASHIDHAR R*/
import java.util.Scanner;
public class Prime
{
public static void main(String[] arg)
{
   Scanner S= new Scanner(System.in);
   System.out.print("Enter the a value:");
   int a= S.nextInt();
   int count=0,i;
    for(i=0;i<a;i++)
     {
       if (a%i == 0);
       {
         count++;
       } 
     }
  if (count==2)
   {
	 System.out.print("The number is prime number");
   }
  else
   {
       System.out.print("The number is not a prime number");
   }
 }
}

