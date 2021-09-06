import java.util.Arrays;
import java.util.Comparator;
public class DSA014Barray { //Java program to merge overlapping Intervals in O(n Log n) time and O(1) extra space
    public static void mergeIntervals(Interval arr[]) { //Function that takes a set of intervals, merges  overlapping intervals and prints the result
        Arrays.sort(arr, new Comparator<Interval>() { //Sort Intervals in increasing order of start time
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        int index = 0; //Stores index of last element in output array (modified arr[])
        for(int i = 1; i < arr.length; i++) { //Traverse all input Intervals
            if (arr[index].end >=  arr[i].start) { //If this is not first Interval and overlaps with the previous one
                // Merge previous and current Intervals
                arr[index].end = Math.max(arr[index].end, arr[i].end); 
                arr[index].start = Math.min(arr[index].start, arr[i].start); 
            }
            else arr[index++] = arr[i];
        }
        System.out.print("The Merged Intervals are: "); //Now arr[0..index-1] stores the merged Intervals 
        for(int i = 0; i <= index; i++) System.out.print("[" + arr[i].start + ","+ arr[i].end + "]");
    }
    public static void main(String args[]) {
        Interval arr[] = new Interval[4];
        arr[0] = new Interval(6,8);
        arr[1] = new Interval(1,9);
        arr[2] = new Interval(2,4);
        arr[3] = new Interval(4,7);
        mergeIntervals(arr);
    }
}
class Interval { //An Interval
    int start, end;
    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}