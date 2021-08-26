import java.util.*;

public class DSA021array {
	public static void main (String[] args) {
		//taking input using class Scanner
		Scanner scan = new Scanner(System.in);
		
		//taking total number of testcases
		int t = scan.nextInt();
		while(t>0)
		{
		    //taking total count of elements
		    int n = scan.nextInt() ;
		    
		    //Declaring and Initializing an array of size n
		    int arr[] = new int[n];
		    
		    //adding elements to the array
		    for(int i = 0; i < n; i++) arr[i] = scan.nextInt();
		    
		    t--;
		    
		     //calling the method findSum
		     //and print "YES" or "NO" based on the result
		     System.out.println(new Solution021().findsum(arr,n)==true ? "Yes" : "No");
		}
        scan.close();
	}
	
	
}// } Driver Code Ends


class Solution021{
    //Function to check whether there is a subarray present with 0-sum or not.
    boolean findsum(int arr[],int n)
    {
        //Your code here
        // create an empty set to store the sum of elements of each
        Set<Integer> set = new HashSet<>(n);
        // insert 0 into the set to handle the case when subarray with zero-sum starts from index 0
        set.add(0);
        int sum = 0;
        for (int value: arr)// for each loop to traverse
        {
            sum += value;//sum of elements so far
            if (set.contains(sum)) return true;//if sum is seen before, we have found zero-sum subarray
            set.add(sum);//insert sum so far
        }
        return false;// no zero-sum subarray found
    }
}