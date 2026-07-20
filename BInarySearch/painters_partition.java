package DSA.BInarySearch;

public class painters_partition {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 30, 20, 15 };
        int k = 3;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int ans = -1;
        int s = 0;
        int e = sum;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValid(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        System.out.println(ans);

    }

    static boolean isValid(int arr[], int k, int mid) {
        // mid --> max lenght of boards , a painter can paint
        int painterCount = 1;
        int paintedLenght = 0;

        for (int i = 0; i < arr.length; i++) {
            if (paintedLenght + arr[i] <= mid) {
                // assig the board to the painter
                paintedLenght = paintedLenght + arr[i];
            } else {
                painterCount++;
                paintedLenght = 0;
                if (painterCount > k || arr[i] > mid) {
                    return false;
                } else {
                    paintedLenght = paintedLenght + arr[i];
                }
            }
        }
        return true;

    }
}
