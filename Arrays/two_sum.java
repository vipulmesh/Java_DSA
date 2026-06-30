package DSA.Arrays;

import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int target =7;
        int[] arr = { 2, 1, 3, 5, 4, 6 };
        int [] ans = {0,0};
        // int [] ans = new int[//twosum ke liye 2 likehn ];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
               if(arr[i]+arr[j]==target){
                ans = new int[]{arr[i], arr[j]};
                //to print the indexes of the array 
                //ans = new int[]{i, j};
               }
            }
        }
// tc = n(sqr), sc - constant
        System.out.println(Arrays.toString(ans));
    }
}
