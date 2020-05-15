import java.util.Scanner;
public class BinarySearch
{
    public static long search(long arr[],long key,int l,int h,int n)
    {
        if(l<=h)
        {
            if(arr[n-1]<key)
            {
                return -1;
            }
            int mid=(l+h)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]>key)
            {
                return search(arr,key,l,mid-1,n);
            }
            else
            {
                return search(arr,key,mid+1,h,n);
            }
        }
        return -1;
    }
    public static void binary(int n,int m,long arr[],long inp[])
    {
        long out[]=new long[m];
        for(int i=0;i<m;i++)
        {
            int l=0;
            int h=n;
            long key=inp[i];
            out[i]=search(arr,key,l,h,n);
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(out[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextLong();
        }
        m=in.nextInt();
        long inp[]=new long[m];
        for(int i=0;i<m;i++)
        {
            inp[i]=in.nextLong();
        }
        binary(n,m,arr,inp);
    }
}