package DSA.Recursion;

public class binry_search {
    static int search(int arr[], int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            e = mid - 1;
        } else if (arr[mid] < target) {
            s = mid + 1;

        }
        return search(arr, target, s, e);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 20, 21, 29 };
        int s = 0;
        int e = arr.length - 1;
        int target = 1;
        int ans = search(arr, target, s, e);
        System.out.println(ans);

    }
}
