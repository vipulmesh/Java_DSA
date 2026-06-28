package DSA.Arrays;

import java.util.Arrays;

public class rev_array {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 9 };
        int i = 0;
        int j = arr.length-1;
        int temp = 0;
        while (i<= j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
