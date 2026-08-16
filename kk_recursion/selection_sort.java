package DSA.kk_recursion;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        int len = arr.length;
        int max = 0;
        int i = 0;
        sort(arr, len, i, max);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int len, int i, int max) {
        if (len == 0) {
            return;
        }
        if (len > i) {
            if (arr[i] > arr[max]) {
                sort(arr, len, i + 1, i);
            } else {
                sort(arr, len, i + 1, max);
            }
        } else {
            // if len ==i // means the maximum element is at the last position
            int temp = arr[max];
            arr[max] = arr[len - 1];
            arr[len - 1] = temp;
            sort(arr, len - 1, 0, 0);
        }

    }
}
