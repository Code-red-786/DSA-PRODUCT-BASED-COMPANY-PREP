class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> ls=new ArrayList<>(map.keySet());

        Collections.sort(ls,(a,b)->map.get(b)-map.get(a));

        int[] sol=new int[k];

        for(int i=0;i<k;i++){
            sol[i]=ls.get(i);
        }
        return sol;
    }
}
