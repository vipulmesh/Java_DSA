class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int maxi =Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            //step1
            sum =sum+nums[i];
            //step2
            maxi=Math.max(maxi,sum);
            //step3
                if(sum<0){
                sum=0;
            }
        }
        return maxi;

    }
}
