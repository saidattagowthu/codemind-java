import java.util.*;
public class swap
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int m=read.nextInt();
        int temp=n;
        n=m;
        m=temp;
        System.out.println(n+"
"+m);
    }
}