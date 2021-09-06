//Initial Template for Java

import java.util.*;
import java.io.*;

public class DSA028array
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution028 ob=new Solution028();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution028
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public boolean find3Numbers(int A[], int n, int X) { 
       // Your code Here
        Arrays.sort(A);
        for(int i = 0; i < n-1; i++){
            int l = i + 1, r = n-1, sum = A[i];
            while (l < r) {
                if (sum + A[l] + A[r] == X) return true;
                else if (sum + A[l] + A[r] < X) l++;
                else r--;
            }
        }
        return false;
    }
}