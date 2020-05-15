import java.util.*;
import java.io.*;

public class CarFueling 
{
    public static long fuel(long cap,int n,long arr[])
    {
        int ini=0;
        int cur=0;
        long num=0;
        while(ini<=n)
        {
            cur=ini;
            while(ini<=n && arr[ini+1]-arr[cur]<=cap)
            {
                ini =ini+1;
            }
            if(ini ==cur)
            {
                return -1;
            }
            if(ini<=n)
            {
                num=num+1;
            }
        }
        return num;
    }
	public static void main(String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    long dis=in.nextLong();
	    long cap=in.nextLong();
	    int n=in.nextInt();
	    long arr[]=new long[n+2];
	    for(int i=1;i<=n;i++)
	    {
	        arr[i]=in.nextLong();
	    }
	    arr[0]=0;
	    arr[n+1]=dis;
	    long ref=fuel(cap,n,arr);
	    System.out.println(ref);
	}
}