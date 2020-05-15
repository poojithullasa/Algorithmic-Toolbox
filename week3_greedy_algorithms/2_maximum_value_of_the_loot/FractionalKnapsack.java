import java.util.*;
import java.io.*;

public class FractionalKnapsack
{
    public static double value(int n,int cap,int v[],int w[])
    {
        int sum=0;
        double value=0.0d;
        double val=0.0d;
        for(int i=0;i<n;i++)
        {
            sum=sum+w[i];
        }
        for(int i=0;i<n;i++)
        {
            value=value+v[i];
        }
        if(cap>sum)
        {
           return value; 
        }
        double arr[]=new double[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=(v[i]*1.0)/w[i];
        }
        while(cap>0)
        {
        int j=0;
        double max=0.0f;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                j=i;
            }
        }
        if(cap>w[j])
        {
            val=val+(w[j]*arr[j]);
            cap=cap-w[j];
        }
        else
        {
            val=val+(cap*arr[j]);
            cap=0;
        }
        arr[j]=0;
        }
        return val;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int cap=in.nextInt();
        int w[]=new int[n];
        int v[]=new int[n];
        for(int i=0;i<n;i++)
        {
            v[i]=in.nextInt();
            w[i]=in.nextInt();
        }
        double val=value(n,cap,v,w);
        System.out.printf(String.format("%.4f", val));
    }
}