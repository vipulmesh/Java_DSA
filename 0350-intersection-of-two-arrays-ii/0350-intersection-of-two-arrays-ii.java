class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums3 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    nums3.add(nums1[i]);
                    nums2[j] = -1; // Mark as used
                    break;
                }
            }
        }

        int[] result = new int[nums3.size()];

        for (int i = 0; i < nums3.size(); i++) {
            result[i] = nums3.get(i);
        }

        return result;
    }
}