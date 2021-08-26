import java.util.*;
public class DSA006array {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n,m;
		    //taking size of array a
		    n=sc.nextInt();
		    //taking size of array b
		    m=sc.nextInt();
		    //Creating 2 array of size n and m
		    int a[]=new int[n];
		    int b[]=new int[m];
		    
		    //inserting elements to array a
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    //inserting elements to array b
		    for(int i=0;i<m;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    Solution006 ob=new Solution006();
		    //calling doUnion method and printing the results
		    System.out.println(ob.doUnion(a,n,b,m));
		}
        sc.close();
	}
}// } Driver Code Ends


//User function Template for Java

class Solution006{
    public int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> arr = new HashSet<Integer>();
        for(int i = 0; i < n; i++) arr.add(a[i]);
        for(int i = 0; i < m; i++) if(!arr.contains(b[i]))arr.add(b[i]);
        return arr.size();
    }
}