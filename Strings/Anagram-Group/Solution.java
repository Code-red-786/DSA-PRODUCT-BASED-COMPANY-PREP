class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> map=new HashMap<>();

    for(int i=0;i<strs.length;i++){
        String s=strs[i];
        char[] ch=s.toCharArray();
        Arrays.sort(ch);

        String key=String.valueOf(ch);

        if(!map.containsKey(key)){
            map.put(key,new ArrayList());   
        }
        map.get(key).add(s);
    }
        
        return new ArrayList(map.values());
    }
}
