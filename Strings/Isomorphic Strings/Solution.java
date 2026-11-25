class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1!=n2) return false;

        char[] map1 = new char[256];
        char[] map2 = new char[256];

        for(int i=0; i<n1; i++){
           char ch1 = s.charAt(i);
           char ch2 = t.charAt(i);

           if(map1[ch1]!='\0' && map1[ch1] != ch2) return false;
           if(map2[ch2]!='\0' && map2[ch2] != ch1) return false;

           map1[ch1] = ch2;
           map2[ch2] = ch1;
        }
        return true;
    }
}
