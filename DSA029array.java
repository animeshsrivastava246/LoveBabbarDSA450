import java.io.*;
public class DSA029array {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution029 obj = new Solution029();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}
// } Driver Code Ends
class Solution029{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    long trappingWater(int arr[], int n) { 
        // Your code here
        // maintain two pointers Left and Right, pointing to the leftmost and rightmost index of the input array
        int lt = 0, rt = n - 1, maxL = arr[lt], maxR = arr[rt];
        long water = 0;
        while (lt < rt) {
            if (arr[lt] <= arr[rt]) {
                lt++;
                maxL = Integer.max(maxL, arr[lt]);
                water += (maxL - arr[lt]);
            }
            else {
                maxR = Integer.max(maxR, arr[--rt]);
                water += (maxR - arr[rt]);
            }
        }
        return water;
    } 
}