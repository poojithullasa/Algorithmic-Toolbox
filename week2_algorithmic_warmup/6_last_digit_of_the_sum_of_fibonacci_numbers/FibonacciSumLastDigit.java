import java.util.*;

public class FibonacciSumLastDigit
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
        if(c<=0)
        return 9;
        return (c-1)%10;
    }
    public static void main(String args[])
    {
        long n;
        Scanner in=new Scanner(System.in);
        n=in.nextLong();
        System.out.println(digit(n+2));
    }
}