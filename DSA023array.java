import java.io.*;
public class DSA023array {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(inputLine[i]);
            System.out.println(new Solution023().maxProduct(arr, n));
        }
        br.close();
    }
}
// } Driver Code Ends


class Solution023 {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        if(n==1) return arr[0];
        else{
            long MaxPrd = 1, min = 1, max = 1;
            for(int i = 0; i < n; i++){
                if(arr[i] >0 ){
                    max *= arr[i];
                    min = Math.min(arr[i]*min, 1);
                }
                else if(arr[i] == 0) max = min = 1;
                else {
                    min += max - (max = min);
                    min *= arr[i];
                    max = Math.max(1, arr[i]*max);
                }
                MaxPrd = Math.max(MaxPrd, max);
            }
            return MaxPrd;
        }
    }
}