package DSA.Recursion;

public class MinimizetheDifference {
    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = 15;
        int ans = solution(mat, target);
        System.out.println(ans);
    }

    public static int solution(int[][] mat, int target) {
        int row = 0;
        int sum = 0;
        int ans = solve(sum, target, mat, row);
        return ans;
    }

    public static int solve(int sum, int target, int[][] mat, int row) {
        if (row >= mat.length) {
            return Math.abs(target - sum);
        }
        int mini = Integer.MAX_VALUE;
        for (int num : mat[row]) {
            int ans = solve(sum + num, target, mat, row + 1);
            mini = Math.min(mini, ans);
        }
        return mini;
    }
}