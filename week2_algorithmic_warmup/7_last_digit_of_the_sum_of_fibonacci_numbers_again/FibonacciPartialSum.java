import java.util.*;

public class FibonacciPartialSum
{
    public static long digit(long n)
    {
        long rem=n%60;
        long a=0;
        long b=1;
        long c=rem;
        for(int i=1;i<rem;i++)
        {
            c=(a+b)%10;
            a=b;
            b=c;
        }
        return c%10;
    }
    public static void main(String args[])
    {
        long n,m;
        Scanner in=new Scanner(System.in);
        n=in.nextLong();
        m=in.nextLong();
        long a=digit(n+1);
        long b=digit(m+2);
        if(b-a<0)
        {
        System.out.println(b-a+10);
        System.exit(1);
        }
        System.out.println(b-a);
    }
}