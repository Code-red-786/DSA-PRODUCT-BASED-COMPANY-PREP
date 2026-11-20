class Solution {
    public int maxSubArray(int[] nums) {

        int globalmax=nums[0];
        int currmax=nums[0];

        for(int i=1;i<nums.length;i++){

             currmax=Math.max(nums[i],nums[i]+currmax);

            globalmax=Math.max(globalmax,currmax);
        }
        return globalmax;
    }
}
