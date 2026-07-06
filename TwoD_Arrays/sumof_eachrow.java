package DSA.TwoD_Arrays;

import java.util.ArrayList;
import java.util.List;

public class sumof_eachrow {
    // Array Intialised and Assigned
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 3, 4 } };
        List<Integer> result = new ArrayList<>();

        int totalrows = arr.length;
        int totalcols = arr[0].length;

        for (int row = 0; row < totalrows; row++) {
            //jaise hi main kisi naye row me aaunga
            //wasie hi main sum=0 krduga
            int sum=0;
            for (int col = 0; col < totalcols; col++) {
                int value=arr[row][col];
                sum=sum+value;
            }
            result.add(sum);
        }
        System.out.println(result);
    }

}
