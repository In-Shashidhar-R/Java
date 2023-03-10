/*Shashidhar
Ch.en.u4aie22058*/
class diagonal
{
    public static void main(String[] arg)
    {
        int a[][]= new int[3][3];
        int i,j;
        for ( i=0;i<3;i++)
        {
            for( j=0;j<3;j++)
        
                if(i==j)
               
                a[i][j]=1;
               
               else
              
                a[i][j]=0;
              

              
            
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    System.out.print(a[i][j]+"\t");
                    
                }
                System.out.println();
                
            }
        }
    }
}