import java.util.*;
public class DSA014array {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        if(intervals.length == 0 || intervals == null) return ans.toArray(new int[0][]);
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int st = intervals[0][0], ed = intervals[0][1];
        for(int[] i : intervals) {
            if(i[0] <= ed) ed = Math.max(ed, i[1]);
            else {
                ans.add(new int[]{st , ed});
                st = i[0];
                ed = i[1];
            }
        }
        ans.add(new int[]{st, ed});
        return ans.toArray(new int[0][]);
    }
}