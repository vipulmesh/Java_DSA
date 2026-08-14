package DSA.kk_recursion;

public class sorted_array {
    public static void main(String[] args) {
        int[] arr = { 4, 8, 9, 17, 56, 100, 124 };
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return (arr[index] < arr[index + 1] && sorted(arr, index + 1));

    }
}
