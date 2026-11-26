125. Valid Palindrome

Difficulty: Easy

Topic: Two Pointers, String

Problem Description

Given a string s, determine whether it is a palindrome after:

Converting uppercase letters into lowercase.
Removing all non-alphanumeric characters.

Return true if it is a palindrome, otherwise return false.

Example

Input:

text
s = "A man, a plan, a canal: Panama"


Output:

text
true

Approach: Two Pointers
Initialize left = 0 and right = s.length() - 1.
Skip non-alphanumeric characters from both sides.
Compare characters after converting them to lowercase.
If characters don't match, return false.
Move both pointers towards the center.
If all characters match, return true.
Java Solution
java
class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right &&
                   !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right &&
                   !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1)
Key Concept

Two Pointers help compare characters from opposite ends without creating an additional string.
