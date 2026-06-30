package DSA.Arrays;

import java.util.Arrays;

public class three_sum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        int target = 0;
        int[] ans = { 0, 0, 0 };

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length-1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans = new int[] { arr[i], arr[j], arr[k]};
                    }

                }
            }
        }
        System.out.println(Arrays.toString(ans));

    }
}
