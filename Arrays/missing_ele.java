package DSA.Arrays;

public class missing_ele {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 5 };
        int n = arr.length + 1;
        int total_sum = n * (n + 1) / 2;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.err.println("missing element");
        System.out.println(total_sum - sum);
    }
}
