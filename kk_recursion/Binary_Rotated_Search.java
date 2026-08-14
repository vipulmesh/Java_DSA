package DSA.kk_recursion;

public class Binary_Rotated_Search {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3 };
        int s = 0;
        int e = arr.length - 1;
        int target = 7;
        System.out.println(solution(arr, target, s, e));
    }

    static int solution(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return solution(arr, target, s, mid - 1);

            } else {
                return solution(arr, target, mid + 1, e);
            }
        }
        if (target >= arr[mid] && target <= arr[e]) {
            return solution(arr, target, mid + 1, e);
        } else {
            return solution(arr, target, s, mid - 1);
        }
    }
}
