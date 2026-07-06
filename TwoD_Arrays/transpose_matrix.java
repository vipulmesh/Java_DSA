package DSA.TwoD_Arrays;

import java.util.Arrays;

public class transpose_matrix {
    public static void main(String[] args) {
         int[][] arr = { { 1, 2 }, { 3, 4 } };

         if(arr==null || arr.length==0){
            System.out.println("not possible");

         }
         int totalrows=arr.length;
         int totalcols=arr[0].length;

         int newTotalrows=totalcols;
         int newTotalcols=totalrows;

         int ans[][] =new int[newTotalrows][newTotalcols];

         //actual logic 
         for(int row=0; row<totalrows; row++){
            for(int col=0; col<totalcols;col++){
                ans[col][row]=arr[row][col];
                  System.out.print(ans[row][col] + " ");
            }
            System.out.println();
         }
         
    }
}
