import java.util.Scanner;
public class LCS3
{
    static int count=0;
    public static int val(int n,int a[],int m,int b[],int l,int c[])
    {
        int arr[][][]=new int[n+1][m+1][l+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                for(int k=1;k<=l;k++)
                {
                    int x=arr[i-1][j-1][k-1];
                    int y=Math.max(arr[i-1][j][k],Math.max(arr[i][j-1][k],arr[i][j][k-1]));
                    if(a[i-1]==b[j-1] && b[j-1]==c[k-1])
                    {
                        arr[i][j][k]=x+1;
                    }
                    else
                    {
                        arr[i][j][k]=y;
                    }
                }
            }
        }
        return arr[n][m][l];
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
	    int l=in.nextInt();
	    int c[]=new int[l];
	    for(int i=0;i<l;i++)
	    c[i]=in.nextInt();
	    System.out.println(val(n,a,m,b,l,c));
	}
}
