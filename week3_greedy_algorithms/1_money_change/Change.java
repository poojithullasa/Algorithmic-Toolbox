import java.util.Scanner;
public class Change 
{
    public static long no(long n)
    {
        long m=n/10;
        n=n%10;
        long l=n/5;
        n=n%5;
        return m+l+n;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Long n=in.nextLong();
        System.out.println(no(n));
    }
}

