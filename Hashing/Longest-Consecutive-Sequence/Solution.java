class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxcount=0;

        for(int num : set){

            if(!set.contains(num-1)){
                int count=1;
                int current=num;

                while(set.contains(current+1)){
                    count++;
                    current++;
                }
            
            maxcount=Math.max(maxcount,count);
            }
        }
        
        return maxcount;
    }
}
