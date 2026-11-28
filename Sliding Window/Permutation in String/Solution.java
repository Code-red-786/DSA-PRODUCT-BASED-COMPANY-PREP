class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int window = s1.length();

        if (window > s2.length()) {
            return false;
        }

        int count[] = new int[26];

        for (int i = 0; i < window; i++) {
            count[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i) - 'a']--;

            if (i >= window) {
                count[s2.charAt(i - window) - 'a']++;
            }
            if (i >= window - 1) {

                boolean match = true;

                for (int j = 0; j < 26; j++) {
                    if (count[j] != 0) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }

        }
        return false;
    }
}
