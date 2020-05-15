import java.util.*;

public class FibonacciSumSquares 
{
    public static long sq(long n)
    {
        long rem=n%60;
        long c=rem;
        long a=0;
        long b=1;
        for(long i=1;i<rem;i++)
        {
            c=(a+b)%10;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String []args)
    {
        long n;
        Scanner in=new Scanner(System.in);
        n=in.nextLong();
        System.out.println((sq(n)*sq(n+1))%10);
    }
}

