class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; // Pointer to place the next valid element
        
        for (int i = 0; i < nums.length; i++) {
            // If the current element is NOT the one to remove
            if (nums[i] != val) {
                nums[index] = nums[i]; // Move it to the front
                index++; // Move our pointer forward
            }
        }
        return index; 
    }
}
