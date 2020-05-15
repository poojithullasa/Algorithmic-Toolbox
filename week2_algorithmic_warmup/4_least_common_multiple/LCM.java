import java.util.*;

public class LCM {
    private static long gcd_naive(long a, long b) {
   if(a==0)
   {
       return b;
   }
   return gcd_naive(b%a,a);
  }
  public static long lcm(long a,long b)
  {
      long res=gcd_naive(a,b);
      return ((a*b)/res);
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    System.out.println(lcm(a, b));
  }
}
