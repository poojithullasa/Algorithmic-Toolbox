import java.util.*;
{
    public static long max(long arr[])
    {
        int n=arr.length;
        long m1,m2;
		long j=0;
		m1=m2=0;
		for(int i=0;i<n;i++)
		{
		    if(m1<arr[i])
		    {
		        m1=arr[i];
		        j=i;
		    }
		}
		for(int i=0;i<n;i++)
		{
		    if(m2<arr[i] && i!=j)
		    {
		        m2=arr[i];
		    }
		}
		return m1*m2;
	}
	public static void main(String[] args)
	{
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=in.nextLong();
		}
		System.out.println(max(arr));
}
}
