LeetCode 344 – Reverse String
Problem Description

Write a function that reverses a string. The input string is given as an array of characters char[].

You must reverse the input array in-place with O(1) extra memory.

Approach: Two Pointers

We use two pointers:

left starts at the beginning of the array.
right starts at the end of the array.
Swap the characters at both positions.
Move left forward and right backward.
Continue until both pointers meet.
Example

Input:

text
s = ['h', 'e', 'l', 'l', 'o']


Output:

text
['o', 'l', 'l', 'e', 'h']

Complexity Analysis
Complexity	Value	Explanation
Time	O(n)	Each element is processed at most once.
Space	O(1)	Reversal is performed in-place.
Key Concepts
Arrays
Two Pointer Technique
Swapping
In-place Algorithms
Platform

LeetCode – Reverse String (Problem 344)

Status: Solved ✅
