package DSA.BInarySearch;

class SearchInRotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 0;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Target found at index : " + mid);
                return;
            }

            // Left half is sorted
            if (arr[start] <= arr[mid]) {

                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

            // Right half is sorted
            else {

                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }

        }

        System.out.println("Target not found");
    }
}