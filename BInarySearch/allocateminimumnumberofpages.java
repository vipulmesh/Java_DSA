package DSA.BInarySearch;

public class allocateminimumnumberofpages {
    public static void main(String[] args) {


        int[] arr = { 10, 20, 30, 40, 50 };
        int k = 2;
        int n = arr.length;
        int s = 1;
        int sum = 0;

        if(arr.length<k){
            System.out.println("-1");
        }
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        int e = sum;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAnswer(arr,k,mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        System.out.println(ans);
    }

    static boolean isValidAnswer(int arr[], int k, int maxPages) {
        // chk whether mid or maxPges is a valid solution or not
        int StudentCount =1;
        int pages =0;
        for(int i=0; i<arr.length; i++){
            if(pages+arr[i]<=maxPages){
                pages = pages +arr[i];
            }
            else{
                StudentCount++;
                if(StudentCount >k || arr[i]> maxPages){
                    return false;
                }
                else{
                    pages=0;
                    pages =pages +arr[i];
                }
            }
        }
        return true;
    }
}
