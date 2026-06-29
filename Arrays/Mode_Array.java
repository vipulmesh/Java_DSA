package DSA.Arrays;
//THIS CODE IS COPIED USING CHATGPT , REVISE WISELY
public class Mode_Array {
    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 2, 5, 2, 4, 3, 4, 4};

        int mode = arr[0];
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        System.out.println("Mode = " + mode);
        System.out.println("Frequency = " + maxCount);
    }
}