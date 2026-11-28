class Solution {
    public int[] sortedSquares(int[] nums) {

        int sol[]=new int[nums.length];

        int left=0;
        int right=nums.length-1;

        int square=nums.length-1;

        while(left<=right){
            int leftsquare=nums[left]*nums[left];
            int rightsquare=nums[right]*nums[right];

            if(leftsquare>rightsquare){
                sol[square]=leftsquare;
                left++;
            }else {

                sol[square] = rightsquare;
                right--;

            }
            square--;
        }
        return sol;
    }

}
