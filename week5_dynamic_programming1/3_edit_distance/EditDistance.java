import java.util.*;

class EditDistance
{
    public static int mini(String a,String b)
    {
        int n=a.length();
        int m=b.length();
        int arr[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++)
        arr[i][0]=arr[i-1][0]+1;
        for(int i=1;i<=m;i++)
        arr[0][i]=arr[0][i-1]+1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                int x=arr[i-1][j-1];
                int y=Math.min(arr[i-1][j]+1,arr[i][j-1]+1);
                if(a.charAt(i-1)==b.charAt(j-1))
                {
                    arr[i][j]=Math.min(x,y);
                }
                else
                {
                    arr[i][j]=Math.min(x+1,y);
                }
            }
        }
        return arr[n][m];
    }
    public static void main(String args[])
    {
        String a,b;
        Scanner in=new Scanner(System.in);
        a=in.next();
        b=in.next();
        System.out.println(mini(a,b));
    }
}
