//Initial Template for Java

import java.util.*;
public class DSA030array
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            ArrayList<Long> arr = new ArrayList<Long>();
            for(int i = 0;i<n;i++)
                {
                    long x = sc.nextInt();
                    arr.add(x);
                }
            long m = sc.nextLong();
            
            Solution030 ob = new Solution030();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        sc.close();
    }
}// } Driver Code Ends


//User function Template for Java

class Solution030
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        Collections.sort(a);
        if(n==m) return a.get((int)n-1)-a.get(0);
        else {
            long min = Long.MAX_VALUE;
            for(int i = 0; i < (int)(n-m)+1; i++) min = Math.min(a.get(i+(int)m-1)-a.get(i), min);
            return min;
        }
    }
}