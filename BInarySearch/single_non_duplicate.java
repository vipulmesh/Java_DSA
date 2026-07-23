package DSA.BInarySearch;

public class single_non_duplicate {
    public static void main(String[] args) {
        int[] arr = { 10, 10, 20, 20, 30, 30, 40, 40, 50, 60, 60 };
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            // single lement wala case
            if (s == e) {
                System.out.println(arr[s]);
                return;
            }
            int currentValue = arr[mid];
            int preValue = -1;
            if (mid - 1 >= 0) {
                preValue = arr[mid - 1];
            }

            int nextValue = -1;
            if (mid + 1 < arr.length) {
                nextValue = arr[mid + 1];
            }

            if (currentValue != preValue && currentValue != nextValue) {
                System.out.println(currentValue);
                return;
            }
            if (currentValue != preValue && currentValue == nextValue) {
                int StartingIndexOfPair = mid;
                if ((StartingIndexOfPair & 1) == 1) {
                    // odd wala case
                    // ans left me hoga
                    e = mid - 1;
                } else {
                    // even wala case
                    // ans right me hoga
                    s = mid + 1;

                }
            } else if (currentValue == preValue && currentValue != nextValue) {
                int EndingIndexOfPair = mid;
                if ((EndingIndexOfPair & 1) == 1) {
                    // odd wala case
                    // ans left me hoga
                    e = mid - 1;
                } else {
                    // even wala case
                    // ans right me hoga
                    s = mid + 1;

                }

            }

        }

    }
}
