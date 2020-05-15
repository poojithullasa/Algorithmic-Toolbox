import java.util.Scanner;
class Partition3
{
    static boolean istrue(int n,int arr[])
    {
        int sum=0;
        for(int i=0;i<n;i++)
        sum=sum+arr[i];
        if(sum%3!=0 || n<3)
        return false;
        boolean val[][]=new boolean[sum/3+1][n+1];
        for(int i=1;i<=sum/3;i++)
        val[i][0]=false;
        for(int i=0;i<=n;i++)
        val[0][i]=true;
        for(int i=1;i<=sum/3;i++)
        {
            for(int j=1;j<=n;j++)
            {
                val[i][j]=val[i][j-1];
                if(i>=arr[j-1])
                {
                    val[i][j]=val[i][j]||val[i-arr[j-1]][j-1];
                }
            }
        }
        return val[sum/3][n];
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
        if(istrue(n,arr))
        {
        System.out.println(1);
        }
        else
        {
        System.out.println(0);
        }
    }
}