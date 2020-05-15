import java.util.Scanner;
class Sorting
{ 
static int partition(long []arr, int low,int high) 
{ 
    long pivot = arr[(low+high)/2]; 
    int i = low - 1, j = high + 1;
    while (true) 
    { 
        do
        { 
            i++; 
        } while (arr[i] < pivot); 
        do
        { 
            j--; 
        } while (arr[j] > pivot); 
        if (i >= j) 
            return j; 
        long temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    } 
} 
static void quickSort(long []arr, int low,int high) 
{ 
    if (low < high) 
    { 
        int pi = partition(arr, low, high); 
        quickSort(arr, low, pi); 
        quickSort(arr, pi + 1, high); 
    } 
} 
static void printArray(long []arr, int n) 
{ 
    for (int i=0; i < n; i++) 
    System.out.print(arr[i]+" "); 
    System.out.println(); 
} 

static public void main (String[] args) 
{ 
    Scanner in=new Scanner(System.in);
    int n;
    n=in.nextInt();
    long arr[]=new long[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=in.nextLong();
    }
    quickSort(arr, 0, n - 1);
    printArray(arr, n); 
} 
}