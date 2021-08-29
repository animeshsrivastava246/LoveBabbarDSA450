public class DSA026array {
    public static void main(String[] args) {
        int arr[] = {10, 22, 5, 75, 65, 80};
        int maxPr = 0;
        for(int i = 1; i < arr.length; i++)
        if(arr[i]>arr[i-1]) maxPr += (arr[i]-arr[i-1]);
        System.out.println(maxPr);
    }
}
