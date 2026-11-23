class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        for(int n: nums1){
            set1.add(n);
        }

        for(int n : nums2){
            set2.add(n);
        }

        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();

        for(int n : set1){
            if(!set2.contains(n)){
                ls1.add(n);
            }
        }

         for(int n : set2){
            if(!set1.contains(n)){
                ls2.add(n);
            }
         }
        
        List<List<Integer>> sol=new ArrayList<>();

                sol.add(ls1);
                sol.add(ls2);

         return sol;       
    }    

}
