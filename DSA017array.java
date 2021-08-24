public class DSA017array {
    public int maxProfit(int[] arr) {
        int maxPr = 0, minNow = arr[0];
        for(int i = 0; i < arr.length; i++){
            minNow = Math.min(minNow, arr[i]);
            maxPr = Math.max(maxPr, arr[i]-minNow);
        }
        return maxPr;
    }
}