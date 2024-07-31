import java.util.*;
public class sum_N
{
    public static void main(String[] args)
    {
        int n,i,s=0;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        for(i=0;i<=n;i++)
        {
         s=s+i;
        }
        System.out.printf("%d",s);
        
    }
}