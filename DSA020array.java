import java.util.*;
public class DSA020array {

	// function which works in the condition when number of negative numbers are lesser or equal than positive numbers
	static void fill1(int a[], int neg, int pos)
	{
		if (neg % 2 == 1) {
			for (int i = 1; i < neg; i += 2) {
				int c = a[i];
				int d = a[i + neg];
				int temp = c;
				a[i] = d;
				a[i + neg] = temp;
			}
		}
		else {
			for (int i = 1; i <= neg; i += 2) {
				int c = a[i];
				int d = a[i + neg - 1];
				int temp = c;
				a[i] = d;
				a[i + neg - 1] = temp;
			}
		}
	}
	// function which works in the condition when number of negative numbers are greater than positive numbers
	static void fill2(int a[], int neg, int pos)
	{
		if (pos % 2 == 1) {
			for (int i = 1; i < pos; i += 2) {
				int c = a[i];
				int d = a[i + pos];
				int temp = c;
				a[i] = d;
				a[i + pos] = temp;
			}
		}
		else {
			for (int i = 1; i <= pos; i += 2) {
				int c = a[i];
				int d = a[i + pos - 1];
				int temp = c;
				a[i] = d;
				a[i + pos - 1] = temp;
			}
		}
	}
	static void reverse(int a[], int n)
	{
		int i, t;
		for (i = 0; i < n / 2; i++) {
			t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}
	}
	static void print(int a[], int n)
	{
		for (int i = 0; i < n; i++) System.out.print(a[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) throws java.lang.Exception
	{
		int[] arr = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };//Given Array
		int n = arr.length;
		int neg = 0, pos = 0;
		for (int i = 0; i < n; i++)
			if (arr[i] < 0) neg++;
            else pos++;
		Arrays.sort(arr); // Sort the array
		if (neg <= pos) fill1(arr, neg, pos);
		else {
            reverse(arr, n);// reverse the array in this condition
			fill2(arr, neg, pos);
		}
		print(arr, n);
	}
}