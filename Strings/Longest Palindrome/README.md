409. Longest Palindrome
Intuition

We need to find the maximum length of a palindrome that can be formed using the characters of the given string.

A palindrome must have matching characters on both sides, so characters should be used in pairs.

Characters with even frequency can be used completely.
Characters with odd frequency can contribute all except one character.
We can use at most one leftover character in the middle of the palindrome.
Approach
Create an integer array of size 128 to store the frequency of each ASCII character.
Traverse the string and increment the frequency of each character.
Initialize count = 0 to store the palindrome length and odd = false to track whether any character has an odd frequency.
Traverse the frequency array:
If the frequency is even, add the entire frequency to count.
If the frequency is odd, add frequency - 1 to count and set odd = true.
After the loop, if odd is true, increment count by 1 to use one character in the middle.
Return count.
Complexity
Time Complexity: O(n) – We traverse the input string once and the frequency array of size 128 once. Since 128 is constant, the overall complexity is O(n).
Space Complexity: O(1) – We use a fixed-size frequency array of 128 elements, regardless of the input size.

Example

Input:

text
s = "abccccdd"


Character Frequencies:

text
a = 1
b = 1
c = 4
d = 2


Calculation:

a → 1 - 1 = 0
b → 1 - 1 = 0
c → 4
d → 2

Total count = 6

Since at least one odd frequency exists, add 1 for the middle character.

Output:

text
7


One possible palindrome is "dccaccd".

Key Takeaway
Even frequency → Use all characters.
Odd frequency → Use all except one.
If at least one odd frequency exists → Add exactly one character for the middle.
