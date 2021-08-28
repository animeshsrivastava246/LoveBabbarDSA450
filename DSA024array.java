import java.util.*;
import java.io.*;

public class DSA024array
{
    // Driver Code
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    out.println(new Solution024().findLongestConseqSubseq(a, n));
		    t--;
		}
		out.flush();
	}
}// } Driver Code Ends


//User function Template for Java

class Solution024
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   TreeSet<Integer> trset = new TreeSet<>();
	   for(int i = 0; i < N; i++) trset.add(arr[i]);
	   int maxCon = 1, curCon = 1;
	   while(trset.size() > 0){
	       if(trset.contains(trset.pollFirst()+1)){
	           if(++curCon > maxCon) maxCon = curCon;
	       }
	       else curCon = 1;
	   }
	   return maxCon;
	}
}