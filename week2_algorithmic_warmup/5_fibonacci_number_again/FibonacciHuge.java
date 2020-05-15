import java.util.Scanner;
public class FibonacciHuge
{
    private static long pmod(long m)
    {
        long a=0;
        long c=0;
        long b=1;
        for(long i=0;i<m*m;i++)
        {
          c=(a+b)%m;
          a=b;
          b=c;
          if(a==0 && b==1)
          {
          return i+1;
          }
        }
        return 0;
    }
    private static long mod(long n,long m)
    {
        long rem=n%pmod(m);
        long a=0;
        long b=1;
        long c=rem;
        for(long i=1;i<rem;i++)
        {
            c=(a+b)%m;
            a=b;
            b=c;
        }
        return c%m;
    }
    public static void main(String []args)
    {
        long n,m;
        Scanner in=new Scanner(System.in);
        n=in.nextLong();
        m=in.nextLong();
        System.out.println(mod(n,m));
    }
}