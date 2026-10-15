class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] ans = new int[2]; // int [] ans = new int[//twosum ke liye 2 likehn ];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans = new int[] { i, j };
                    // to print the indexes of the array
                    // ans = new int[]{i, j};
                }
            }
        }
        return ans;
    }
}