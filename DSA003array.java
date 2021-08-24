import java.io.*;
import java.util.*;
public class DSA003array {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
        sc.close();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < k; i++) pq.add(arr[i]);
        for (int i = k; i < r-l+1; i++) if (arr[i] < pq.peek()) {
            pq.poll();
            pq.add(arr[i]);
        }
        return pq.peek();
    } 
}
