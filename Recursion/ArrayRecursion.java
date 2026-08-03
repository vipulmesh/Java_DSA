package DSA.Recursion;

public class ArrayRecursion {

    public static void main(String[] args) {
        int[] arr = {2, 7, 8, 7, 3};
        printArray(arr, 0);
    }

    static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        System.out.println(arr[index]);
        printArray(arr, index + 1);
    }
}