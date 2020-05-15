import java.util.Scanner;
public class Knapsack
{
    static int max(int arr[],int n,int m)
    {
        int sum[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                sum[i][j]=sum[i][j-1];
                if(i>=arr[j-1])
                {
                    sum[i][j]=Math.max(sum[i-arr[j-1]][j-1]+arr[j-1],sum[i][j]);
                }
            }
        }
        return sum[m][n];
    }
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int m=in.nextInt();
	    int n=in.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    arr[i]=in.nextInt();
	    System.out.println(max(arr,n,m));
	}
}
