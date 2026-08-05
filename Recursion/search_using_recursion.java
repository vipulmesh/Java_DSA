package DSA.Recursion;

public class search_using_recursion {

    public static int findTarget(int arr[], int i, int target) {
        if (i >= arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return findTarget(arr, i + 1, target);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 8, 7, 3 };
        int target =2;
        int i=0;
        System.out.println(findTarget(arr, i, target));

    }
}
