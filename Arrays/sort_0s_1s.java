package DSA.Arrays;

import java.util.Arrays;

public class sort_0s_1s {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 0, 0, 1 };
        int i = 0;
        int j = arr.length - 1;
        int temp = 0;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }


    //easier approach with same tc and sc
    
    static int[] easy_approach(int arr[]) {
        int zero_count = 0;
        int one_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero_count++;
            }
            if (arr[i] == 1) {
                one_count++;
            }

        }
        // Fill 0s
    int index = 0;
    while (zero_count > 0) {
        arr[index] = 0;
        index++;
        zero_count--;
    }

    // Fill 1s
    while (one_count > 0) {
        arr[index] = 1;
        index++;
        one_count--;
    }

        return arr;
    }
}
