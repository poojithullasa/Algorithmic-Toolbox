import java.util.Scanner;
public class LCS2
{
    static int count=0;
    public static int val(int n,int a[],int m,int b[])
    {
        int arr[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        arr[i][0]=0;
        for(int i=0;i<=m;i++)
        arr[0][i]=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                int x=arr[i-1][j-1];
                int y=Math.max(arr[i-1][j],arr[i][j-1]);
                if(a[i-1]==b[j-1])
                {
                    arr[i][j]=x+1;
                }
                else
                {
                    arr[i][j]=y;
                }
            }
        }
        return arr[n][m];
    }
	public static void main(String[] args) 
	{
	    int n;
	    Scanner in=new Scanner(System.in);
	    n=in.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    a[i]=in.nextInt();
	    int m;
	    m=in.nextInt();
	    int b[]=new int[m];
	    for(int i=0;i<m;i++)
	    b[i]=in.nextInt();
	    System.out.println(val(n,a,m,b));
	}
}
