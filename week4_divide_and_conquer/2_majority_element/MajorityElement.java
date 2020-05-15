import java.util.Scanner;
public class MajorityElement
{
    public static long ismaj(int n,long arr[])
    {
        int maj=0;
        int count =1;
        for(int i=1;i<n;i++)
        {
            if(arr[maj]==arr[i])
            {
                count++;
            }
            else
            count --;
            if(count ==0)
            {
                maj=i;
                count=1;
            }
        }
        return arr[maj];
    }
    private static long count(int n,long arr[],long a)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
           if(a==arr[i])
           count++;
        }
        if(count>(n/2))
        return 1;
        return 0;
    }
    public static long maj(int n,long arr[])
    {
        long a=ismaj(n,arr);
        long b=count(n,arr,a);
        return b;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextLong();
        }
        System.out.println(maj(n,arr));
    }
}