class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int k = s1.length();

        if (k > s2.length()) {
            return false;
        }

        int[] count = new int[26];

        // Store s1 character frequencies
        for (int i = 0; i < k; i++) {
            count[s1.charAt(i) - 'a']++;
        }

        // Sliding Window
        for (int i = 0; i < s2.length(); i++) {

            // Add new character
            count[s2.charAt(i) - 'a']--;

            // Remove old character
            if (i >= k) {
                count[s2.charAt(i - k) - 'a']++;
            }

            // Check current window
            if (i >= k - 1) {

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
