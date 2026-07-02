package DSA.Arrays;

public class missing_ele_with_duplicates {
    public static void main(String[] args) {
        // marking

        int[] arr = { 8, 2, 1, 10, 9, 4, 6, 4, 5, 6 };
        int n = arr.length;
        for (int index = 0; index < n; index++) {
            int value = Math.abs(arr[index]);
            int position = value - 1;
            // mark krdo yeh position
            if (arr[position] > 0) {
                arr[position] = -arr[position];
            }
        }
        // travel array and whensever you encounter a postive value , print the number
        // as the same time
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                int valueAtThisIndex=i+1;
                System.out.println(valueAtThisIndex);
            }
        }
    }
}
