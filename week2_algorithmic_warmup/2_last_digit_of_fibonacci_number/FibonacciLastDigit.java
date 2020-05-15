import java.util.*;

public class FibonacciLastDigit {
  private static long calc_fib(long n) {
    if (n <= 1)
      return n;
    long a=0;
    long b=1;
    long c=0;
    for(long i=2;i<=n;i++)
    {
        c=(a+b)%10;
        a=b;
        b=c;
    }
    return c;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    long n = in.nextInt();
    System.out.println(calc_fib(n));
  }
}



