package DSA.BInarySearch;

public class unbounded_search {

    // Static nested class
    static class InfiniteArray {

        private int[] arr;

        public InfiniteArray(int[] nums) {
            this.arr = nums;
        }

        public int get(int index) {
            if (index >= arr.length) {
                return Integer.MAX_VALUE;
            }
            return arr[index];
        }
    }

    // Unbounded Search
    static int search(InfiniteArray arr, int target) {

        if (arr.get(0) == target) {
            return 0;
        }

        int i = 1;

        // Expand the search range
        while (arr.get(i) < target) {
            i = i * 2;
        }

        // Binary Search
        int s = i / 2;
        int e = i;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr.get(mid) == target) {
                return mid;
            } else if (arr.get(mid) > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        InfiniteArray arr = new InfiniteArray(
                new int[] {
                        2, 4, 6, 8, 10, 12, 14, 16,
                        18, 20, 22, 24, 26, 28, 30,
                        32, 34
                });

        int target = 22;

        int ans = search(arr, target);

        System.out.println("Index = " + ans);
    }
}