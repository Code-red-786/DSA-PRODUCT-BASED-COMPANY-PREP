LeetCode 14 – Longest Common Prefix
Problem Description

Given an array of strings, find the longest common prefix string among all the strings.

If there is no common prefix, return an empty string "".

Approach: Vertical Scanning

We use the first string as a reference and compare its characters with the characters at the same index in all other strings.

Steps
Check if the input array is empty. If yes, return "".
Traverse the first string character by character.
Store the current character in a variable ch.
Compare that character with the same index in all other strings.
If a mismatch occurs or another string ends, return the common prefix using substring(0, i).
If no mismatch occurs, return the first string.


Example 1

Input:

text
strs = ["flower", "flow", "flight"]


Comparison:

Index	flower	flow	flight	Result
0	f	f	f	Match
1	l	l	l	Match
2	o	o	i	Mismatch

Output:

text
"fl"

Example 2

Input:

text
strs = ["dog", "racecar", "car"]


No common prefix exists.

Output:

text
""

Complexity Analysis

Let:

n = Number of strings.
m = Length of the first string.
Complexity	Value	Explanation
Time	O(n × m)	Each character is compared across the strings.
Auxiliary Space	O(1)	Only a few variables are used, excluding the returned string.
Important Concepts
String Array
Vertical Scanning
Nested Loops
Character Comparison
charAt()
substring()
Platform

LeetCode – 14. Longest Common Prefix

Status: Solved ✅
