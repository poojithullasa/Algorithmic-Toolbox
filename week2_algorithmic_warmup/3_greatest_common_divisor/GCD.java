import java.util.*;

public class GCD {
  private static long gcd_naive(long a, long b) {
   if(a==0)
   {
       return b;
   }
   return gcd_naive(b%a,a);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    System.out.println(gcd_naive(a, b));
  }
}

