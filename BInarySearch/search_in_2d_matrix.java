package DSA.BInarySearch;

public class search_in_2d_matrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 } };
        int totalRow = arr.length;
        int totalCol = arr[0].length;
        int target = 11;

        int n = totalRow * totalCol; // total nos of elements
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int rowIndex = mid / totalCol;
            int colIndex = mid % totalCol;
            if (arr[rowIndex][colIndex] == target) {
                System.out.println("true");
                return;
            }
            if (arr[rowIndex][colIndex] > target) {
                e = mid - 1;
            }
            if (arr[rowIndex][colIndex] <target) {
                s=mid+1;
            }
        }
        System.out.println("not found");

    }
}
