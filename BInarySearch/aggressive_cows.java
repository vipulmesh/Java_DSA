package DSA.BInarySearch;

import java.util.Arrays;

public class aggressive_cows {

    static boolean isPossible(int[] arr, int N, int c, int distance) {

        int cows = 1;
        int lastStallPos = arr[0];

        for (int i = 1; i < N; i++) {

            if (arr[i] - lastStallPos >= distance) {
                cows++;
                lastStallPos = arr[i];

                if (cows == c) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 8, 9};
        int c = 3;

        Arrays.sort(arr);

        int N = arr.length;

        int st = 1;
        int end = arr[N - 1] - arr[0];
        int ans = -1;

        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (isPossible(arr, N, c, mid)) {
                ans = mid;
                st = mid + 1; // Try for larger minimum distance
            } else {
                end = mid - 1; // Reduce distance
            }
        }

        System.out.println("Maximum minimum distance = " + ans);
    }
}