// Java Code to find elements whose
// frequency yis more than n/k
import java.util.*;

public class DSA025array

{
	public static void morethanNdK(int a[], int n, int k)
	{
		int x = n / k;
		
		// Hash map initialization
		HashMap<Integer, Integer> y = new HashMap<>();
	
		// count the frequency of each element.
		for (int i = 0; i < n; i++)
		{
			// is element doesn't exist in hash table
			if (!y.containsKey(a[i]))
				y.put(a[i], 1);
		
		
			// if lement does exist in the hash table
			else
			{
				int count = y.get(a[i]);
				y.put(a[i], count + 1);
			}
		}

		// iterate over each element in the hash table
		// and check their frequency, if it is more than
		// n/k, print it.
		for (Map.Entry<Integer, Integer> m : y.entrySet())
		{
			Integer temp = (Integer)m.getValue();
			if (temp > x)System.out.println(m.getKey());
		}
	}

	// Driver Code
	public static void main(String[] args)
	{

		int a[] = new int[] { 1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1 };
		int n = 12;
		int k = 4;
		morethanNdK(a, n, k);
	}
}
