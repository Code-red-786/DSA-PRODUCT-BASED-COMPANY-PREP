class Solution {
    public int longestPalindrome(String s) {

        int arr[] = new int[128];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        boolean odd = false;
        int count = 0;

        for (int i = 0; i < 128; i++) {
            if (arr[i] % 2 == 0) {
                count += arr[i];
            } else {
                count += arr[i] - 1;
                odd = true;
            }

        }

        if (odd) {
            count++;
        }
        return count;
    }
}
