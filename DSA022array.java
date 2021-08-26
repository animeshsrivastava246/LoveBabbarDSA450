import java.util.*;

public class DSA022array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution022 ob = new Solution022();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) System.out.print(val);
            System.out.println();
        }
        sc.close();
    }
}// } Driver Code Ends


//User function Template for Java

class Solution022 {
    ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> facto = new ArrayList<Integer>();
        int size = 0, c = 0;
        facto.add(0,1);// adding 1 at 0th ind
        size=1;//updating size
        int val = 2;// Decalre a variable to traverse numbers from 2 to n
        while(val <= N)
        {
            // Traverse array list from right to left
            for(int i = size-1; i >= 0; i--)
            {
                int temp = facto.get(i)*val + c;//Update value in list
                facto.set(i,temp%10);// store last digit at i'th ind and add remaining to carry 
                c = temp/10;//update carry
            }
            while(c!=0){ // insert carry digit by digit to the begining of the ArrayList
                facto.add(0, c%10);
                c /= 10;
                size++;
            }
            val++;
        }
        return facto;
    }
}