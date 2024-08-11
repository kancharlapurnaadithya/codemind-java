/*import java.util.Scanner;
public class sumofn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        double sum;
        n=sc.nextInt();
        sum=(double)n*((n+1)/2);
        System.out.println(+sum);
        sc.close();
    }
}*/
import java.util.Scanner;
public class sumofn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,sum=0;
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(+sum);
        sc.close();
    }
}
        
        
        
        
        
        
        
        
        
        
        
