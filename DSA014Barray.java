import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
public class DSA014Barray { //A Java program for merging overlapping intervals
    public static void mergeIntervals(Interval arr[]) { //The main function that takes a set of intervals, merges overlapping intervals and prints the result
        if (arr.length <= 0) return; //Test if the given set has at least one interval
        Stack<Interval> stack = new Stack<>(); //Create an empty stack of intervals
        Arrays.sort(arr, new Comparator<Interval>() { //sort the intervals in increasing order of start time
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        stack.push(arr[0]); //push the first interval to stack
        for (int i = 1; i < arr.length; i++) //Start from the next interval and merge if necessary
        {
            Interval top = stack.peek(); //get interval from stack top
            if (top.end < arr[i].start) stack.push(arr[i]); //if current interval is not overlapping with stack top, push it to the stack
            else if (top.end < arr[i].end) { //Otherwise update the ending time of top if ending of current interval is more
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }
        System.out.print("The Merged Intervals are: "); // Print contents of stack
        while (!stack.isEmpty()) {
            Interval t = stack.pop();
            System.out.print("[" + t.start + "," + t.end + "] ");
        }
    }
    public static void main(String args[]) {
        Interval arr[] = new Interval[4];
        arr[0] = new Interval(6, 8);
        arr[1] = new Interval(1, 9);
        arr[2] = new Interval(2, 4);
        arr[3] = new Interval(4, 7);
        mergeIntervals(arr);
    }
}
class Interval {
    int start, end;
    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}