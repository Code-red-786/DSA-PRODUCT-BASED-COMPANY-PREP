LeetCode 387 – First Unique Character in a String
Problem Description

Given a string s, find the first non-repeating character and return its index.

If no unique character exists, return -1.

Approach: Frequency Array

We use an integer array of size 26 to count the frequency of each lowercase English letter.

Steps
Create an integer frequency array of size 26.
Traverse the string and count the occurrences of each character.
Traverse the string again from left to right.
Check whether the current character's frequency is equal to 1.
If the frequency is 1, return its index.
If no unique character is found, return -1.
Example 1

Input:

text
s = "leetcode"


Frequency:

l = 1
e = 3
t = 1
c = 1
o = 1
d = 1

The first non-repeating character is l at index 0.

Output:

text
0

Example 2

Input:

text
s = "loveleetcode"


Frequency:

l = 2
o = 2
v = 1
e = 4
t = 1
c = 1
d = 1

The first non-repeating character is v at index 2.

Output:

text
2

Example 3

Input:

text
s = "aabb"


All characters appear more than once.

Output:

text
-1

Complexity Analysis

Let n be the length of the string.

Complexity	Value	Explanation
Time	O(n)	Two traversals of the string.
Space	O(1)	Fixed-size frequency array of 26 elements.
Important Concepts
Strings
Arrays
Frequency Counting
Character Mapping
Two-Pass Traversal
Key Learning
java
frequency[s.charAt(i) - 'a']++;


This expression maps each lowercase character to an array index and increments its frequency.

For example:

'a' - 'a' = 0
'b' - 'a' = 1
'l' - 'a' = 11

The array index represents the character, and the array value represents its occurrence count.

Platform

LeetCode – 387. First Unique Character in a String

Status: Solved ✅
