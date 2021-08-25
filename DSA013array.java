import java.io.*;
public class DSA013array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution13 obj = new Solution13();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution13{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int max = arr[0];
        for(int i = 0; i < n; i++) if(arr[i] > max) max=arr[i];
        if(max <= 0) return max;
        int maxs = 0, curs = 0;
        for(int i = 0; i < n; i++){
            curs += arr[i];
            if(curs > maxs) maxs = curs;
            if(curs < 0) curs = 0;
        }
        return maxs;
    }
    
}