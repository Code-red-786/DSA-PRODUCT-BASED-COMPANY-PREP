3. Longest Substring Without Repeating Characters
Intuition

We need to find the length of the longest substring that contains no repeating characters.

We can solve this problem efficiently using the Sliding Window + Two Pointers + Last Seen Array technique.

Instead of removing duplicate characters one by one using a HashSet, we store the last seen index of every character in an array.

When a duplicate character appears, we directly move the left pointer to the position after its previous occurrence.

This avoids unnecessary iterations and makes the solution efficient.

Approach
Create an integer array lastSeen of size 128 to store the last seen position of each ASCII character.
Initialize:
left = 0 to represent the starting index of the current window.
maxlen = 0 to store the maximum substring length.
Traverse the string using the right pointer (i).
Get the current character using s.charAt(i).
Update the left pointer:
Use Math.max(left, lastSeen[ch]) to move the left pointer after the previous occurrence of the character.
This ensures that the left pointer never moves backward.
Calculate the current window length using i - left + 1.
Update the maximum length using Math.max().
Store the current character's last seen position as i + 1.
Return maxlen.
Java Code
java
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int lastSeen[] = new int[128];
        int maxlen = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            left = Math.max(left, lastSeen[ch]);

            maxlen = Math.max(maxlen, i - left + 1);

            lastSeen[ch] = i + 1;
        }

        return maxlen;
    }
}

Example 1

Input:

text
s = "abcabcbb"


Output:

text
3


Explanation:

The longest substring without repeating characters is "abc".

Other valid substrings include "bca" and "cab".

Example 2

Input:

text
s = "bbbbb"


Output:

text
1


Explanation:

The longest substring without repeating characters is "b".

Example 3

Input:

text
s = "pwwkew"


Output:

text
3


Explanation:

The longest substring without repeating characters is "wke".

Dry Run

Input:

text
s = "abcabcbb"

i	Character	lastSeen[ch] Before Update	left	Current Window	maxlen
0	a	0	0	a	1
1	b	0	0	ab	2
2	c	0	0	abc	3
3	a	1	1	bca	3
4	b	2	2	cab	3
5	c	3	3	abc	3
6	b	5	5	cb	3
7	b	7	7	b	3

Final Answer: 3

Complexity
Time Complexity: O(n)
We traverse the string only once.
Each character is processed in constant time using direct array access.
Therefore, the overall time complexity is O(n).
Space Complexity: O(1)
We use a fixed-size array of 128 elements.
The extra space remains constant.
Key Concepts
Sliding Window
Two Pointers
Last Seen Index
Character Frequency / Position Tracking
Math.max()
Important Observations
The right pointer expands the window.
The left pointer jumps directly when a duplicate character is found.
lastSeen[ch] stores the previous occurrence's index plus one.
Math.max() prevents the left pointer from moving backward.
i - left + 1 calculates the current window length.
This approach avoids the repeated removal operations used in the HashSet approach.
Optimization

HashSet Approach:

Uses contains() and remove().
Shrinks the window one character at a time.

Last Seen Array Approach:

Uses direct array indexing.
Moves the left pointer directly to the required position.
Avoids the inner while loop.

Pattern: Variable Size Sliding Window + Last Seen Array.
