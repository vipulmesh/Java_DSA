package DSA.BInarySearch;

public class lowerBound {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 30, 35, 39, 42 };
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int target = 36;
        int ans =0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans =mid;
                end=mid-1;

            }
            else{
                start=mid+1;
            }

        }
        System.out.println(ans);
    }
}
