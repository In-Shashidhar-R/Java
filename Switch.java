/*Ch.en.u4aie22058
SHASHIDHAR R*/
import java.util.Scanner;
public class Switch
{
	public static void main(String[] arg)
{
		Scanner A = new Scanner(System.in);
		System.out.println("Enter the a value:");
		int a= A.nextInt();
		System.out.println("Enter the b value:");
		int b= A.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multplication");
		System.out.println("4.Division");
		System.out.println("Enter the C value:");
		int C = A.nextInt();
		switch(C)
{
case 1:
System.out.println("Addition " +(a+b));
break;
case 2:
System.out.println("Subtraction " +(a-b));
break;
case 3:
System.out.println("Multplication " +(a*b));
break;
case 4:
System.out.println("Division " +(a/b));
break;
default:
}
}
}