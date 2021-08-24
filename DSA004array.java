import java.io.*;

// } Driver Code Ends
//User function template for Java

public class DSA004array
{
    public void sort012(int a[], int n)
    {
        // code here 
        int n0 = 0, n1 = 0, n2 = 0;
        for(int i = 0; i < n; i++){
            if(a[i]==0) n0++;
            else if(a[i]==1) n1++;
            else n2++;
        }
        int ind = 0;
        while((n0--)!=0) a[ind++] = 0;
        while((n1--)!=0) a[ind++] = 1;
        while((n2--)!=0) a[ind++] = 2;
    }
}
// { Driver Code Starts.
class GFG {   
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            DSA004array ob=new DSA004array();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}
  // } Driver Code Ends