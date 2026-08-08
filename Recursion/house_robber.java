package DSA.Recursion;

public class house_robber {

    static int rob(int nums[]) {
        int index = 0;
        int ans = solve(nums, index);
        return ans;
    }

    static int solve(int nums[], int index) {

        // Base case
        if (index >= nums.length) {
            return 0;
        }

        // Include current house
        int includeAns = nums[index] + solve(nums, index + 2);

        // Exclude current house
        int excludeAns = solve(nums, index + 1);

        // Take maximum
        int finalAns = Math.max(includeAns, excludeAns);

        return finalAns;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 7, 9, 3, 1 };

        int ans = rob(arr);

        System.out.println("Maximum amount robbed: " + ans);
    }
}