package DSA.BInarySearch;

public class eko_spoj {

    static boolean ValidAns(int arr[], int m, int maxHeight) {
        int totalWoodCollected = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxHeight) {
                // iska matlb , sawbalde overall tree height se chotta hiai therfore the pkka
                // kuch wood amount cut krega
                int currentTreeWoodCollected = arr[i] - maxHeight;
                totalWoodCollected = totalWoodCollected + currentTreeWoodCollected;
            }
        }
        if (totalWoodCollected >= m) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 20, 15, 10, 17 };
        int n = arr.length;
        int s = 0;
        int maxi = -1;
        int m = 7;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        int ans = -1;

        int e = maxi;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (ValidAns(arr, m, mid)) {
                // ans sotre
                ans = mid;
                // move right
                s = mid + 1;

            } else {
                e = mid - 1;
            }
        }
        System.out.println(ans);

    }
}
