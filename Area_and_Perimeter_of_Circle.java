import java.util.Scanner;
 public class ap
{
    public static void main(String[] args)
    {
        int a;
        
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
       System.out.printf("%.2f
%.2f",3.14*a*a,2*3.14*a);
    }
}