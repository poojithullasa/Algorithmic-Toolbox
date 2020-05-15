import java.util.*;

public class PrimitiveCalculator
{
    static Stack<Long> st=new Stack<Long>();
    static void cal(long n)
    {
        long arr[]=new long[(int)n+1];
        for(int i=2;i<=n;i++)
        {
            arr[i]=arr[i-1]+1;
            if(i%2==0)
            {
                if(arr[i]>arr[i/2]+1)
                {
                    arr[i]=arr[i/2]+1;
                }
            }
            if(i%3==0)
            {
                if(arr[i]>arr[i/3]+1)
                {
                    arr[i]=arr[i/3]+1;
                }
            }
        }
        System.out.println(arr[(int)n]);
        st.push(n);
        while(n>1)
        {
          if(arr[(int)n]==arr[(int)n-1]+1)
          {
              st.push(n-1);
              n=n-1;
          }
          else if(n%2==0 && arr[(int)n]==arr[(int)n/2]+1)
          {
              st.push(n/2);
              n=n/2;
          }
          else if(n%3==0 && arr[(int)n]==arr[(int)n/3]+1)
          {
              st.push(n/3);
              n=n/3;
          }
        }
    }
	public static void main(String[] args) 
	{
	    long n;
	    Scanner in=new Scanner(System.in);
	    n=in.nextLong();
	    cal(n);
	    while(st.isEmpty()==false)
	    System.out.print(st.pop()+" ");
	}
}