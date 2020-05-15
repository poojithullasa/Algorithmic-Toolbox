import java.util.Scanner;
public class ChangeDP
{
    public static long num(int coins[],long m)
    {
        long arr[]=new long[(int)m+1];
        arr[0]=0;
        for(int i=1;i<=m;i++)
        {
            arr[i]=Long.MAX_VALUE;
        }
        long x=Long.MAX_VALUE;
        for(int i=1;i<=m;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(coins[j]<=i)
                {
                    long sub=arr[i-coins[j]];
                    if(sub!=x && sub+1<arr[i])
                    arr[i]=sub+1;
                }
            }
        }
        return arr[(int)m];
    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long m;
		m=in.nextLong();
		int coins[]={1,3,4};
		System.out.println(num(coins,m));
	}
}
