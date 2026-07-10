package DSA.BInarySearch;

public class upperBound {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 30, 35, 39, 42 };
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int target = 25;
        int ans =-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]<=target){
                start=mid+1;

            }
            else{
                ans=mid;
                end=mid-1;

            }
        }
        System.out.println(ans);
    }
}
