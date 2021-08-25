import java.util.*;
public class DSA016array
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution16().inversionCount(arr, n));
            
        }
        sc.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution16
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    long inversionCount(long arr[], long N) {
        return sort(arr,0, (int)N-1);
    }
    static long sort(long[] arr,int l, int r) {
        if(l >= r) return 0;
        int m = (l+r)/2;
        long c = sort(arr,l,m) + sort(arr,m+1,r);
        return c + merge(arr,l,m,r);
    }
    static long merge(long arr[], int l,int m, int r) {
        long left[] = Arrays.copyOfRange(arr,l,m+1), right[] = Arrays.copyOfRange(arr,m+1,r+1), count = 0;
        int i = 0, j = 0, k = l;
        while(i<left.length && j<right.length) {
            if(left[i] <= right[j]) arr[k++] = left[i++];
            else {
                arr[k++] = right [j++];
                count += (m + 1) - (l + i);
            }
        }
        while(i < left.length) arr[k++] = left[i++];
        while(j < right.length) arr[k++] = right[j++];
        return count;
    }
}