import java.io.*;
public class DSA010array
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution010().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends


class Solution010{
    int minJumps(int[] a){
        // your code here
        int mx = a[0], stp = a[0], jp = 1, n = a.length;
        if(n==1) return 0;
        else if(a[0]==0) return -1;
        else{
            for(int i = 1; i < n; i++){
                if(i==n-1) return jp;
                mx = Math.max(mx, i + a[i]);
                stp--;
                if(stp==0){
                    jp++;
                    if(mx<=i) return -1;
                    stp = mx-i;
                }
            }
        }
        return jp;
    }
}