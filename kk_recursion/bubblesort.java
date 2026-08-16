package DSA.kk_recursion;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        int len = arr.length - 1;
        bubble(arr, len, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int len, int i) {
        if (len == 0) {
            return;
        }
        if (i < len) {
            if (arr[i] > arr[i + 1]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }
            bubble(arr, len, i + 1);
        } else {
            bubble(arr, len - 1, 0);
        }

    }
}
