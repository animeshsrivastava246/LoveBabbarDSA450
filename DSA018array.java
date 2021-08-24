import java.io.*;
import java.util.*;

public class DSA018array {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Sol().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>(n);
        for(int i = 0; i < n; i++) mp.put(arr[i], (mp.get(arr[i]) == null) ? 1 : mp.get(arr[i]) + 1);
        int ans = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == k - arr[i]) ans += (mp.get(arr[i]) - 1);
            else if(mp.get(k - arr[i]) != null) ans += mp.get(k - arr[i]);
        }
        return ans/2;
    }
}