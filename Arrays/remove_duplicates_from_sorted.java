package DSA.Arrays;

public class remove_duplicates_from_sorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 3, 4 };
        int j = 1;
        int i = 0;
        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            } else {
                j++;
            }

        }

        System.out.println(i + 1);
    }
}
