package DSA.Recursion;

public class maximum_in_array {
    static void findMax(int[] arr, int i, int maxi) {
        if (i >= arr.length) {
            System.out.println(maxi);

            return;
        }
        // processing case
        if (arr[i] > maxi) {
            maxi = arr[i];
        }
        // r r
        findMax(arr, i + 1, maxi);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 32, 42, 43, 55, 22, 44 };

        int maxi = Integer.MIN_VALUE;
        int i = 0;
        findMax(arr, i, maxi);

    }
}
