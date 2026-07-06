package DSA.TwoD_Arrays;

import java.util.ArrayList;
import java.util.List;

public class wave_print_matrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 3, 4 } };
        List<Integer> result = new ArrayList<>();

        int totalrows = arr.length;
        int totalcols = arr[0].length;

        for (int row = 0; row < totalrows; row++) {
            if(row%2==0){
                for (int col = 0; col < totalcols; col++) {
                System.out.println(arr[row][col]);
            }
            }
           else{
           for (int col = totalcols - 1; col >= 0; col--){
                System.out.println(arr[row][col]);
            }
           }
    }
}
}
