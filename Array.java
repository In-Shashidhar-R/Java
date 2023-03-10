/*Shashidhar
Ch.en.u4aie22058*/
import java.util.Scanner;
class Array
{
public static void main(String[] arg)
{
Scanner S = new Scanner (System.in);
int a[][] = new int [100][100];
int r,c;
int i,j;
System.out.println("Enter the number of rows");
r = S.nextInt();
System.out.println("Enter the number of colums");
c = S.nextInt();
for( i=0;i<r;i++)
{
    for(j=0;j<c;j++)
    {
        System.out.println("Enter the element a["+i+"]["+j+"]");
        a[i][j] = S.nextInt();
    }
}
    for( i=0;i<r;i++)
{
    for(j=0;j<c;j++)
    {
        System.out.print(a[i][j]+"\t");
        
 
}
}
     System.out.println("\n");
}
}