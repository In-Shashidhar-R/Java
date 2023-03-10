import java.util.Scanner;
class darray
{
public static void main(String[] arg)
{
Scanner S = new Scanner (System.in);
int a[] = new int [100];
int r;
int i;
System.out.println("Enter the number of rows");
r = S.nextInt();
for( i=0;i<r;i++)
{
   
        System.out.println("Enter the element a["+i+"]");
        a[i] = S.nextInt();
    }

    for( i=0;i<r;i++)
{
    
        System.out.print(a[i]+"\t");
        
 
}
}
     
}
