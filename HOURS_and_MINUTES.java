import java.util.*;
public class h_M
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
     int t=read.nextInt();
     int h=t/60;
     int m=t%60;
     System.out.println(h+ " Hour(s) " +m+ " Minute(s)");
    }
}