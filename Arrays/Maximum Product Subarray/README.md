152. Maximum Product Subarray

!Difficulty !Topic !Language

📌 Problem Statement

Given an integer array nums, find a contiguous subarray that has the largest product and return that product.

A subarray must contain at least one element.

📝 Examples

Example 1:

text
Input:  nums = [2, 3, -2, 4]
Output: 6
Explanation: [2, 3] has the maximum product.


Example 2:

text
Input:  nums = [-2, 0, -1]
Output: 0
Explanation: The maximum product is 0.

💡 Approach: Dynamic Programming
Intuition

The main challenge is handling negative numbers.

Multiplying two negative numbers produces a positive number.
A minimum product can become the maximum product when multiplied by a negative number.
Zero resets the product.

So, we maintain three variables:

Variable	Purpose
max	Maximum product ending at current index
min	Minimum product ending at current index
ans	Overall maximum product
Algorithm
Initialize max, min, and ans with the first array element.
Traverse the array from index 1.
If the current number is negative, swap max and min.
Update the maximum product.
Update the minimum product.
Update the overall answer.
Return ans.
🔍 Dry Run

Input: nums = [2, 3, -2, 4]

Initial values:

text
max = 2
min = 2
ans = 2

Current Element	Max Product	Min Product	Answer
2	2	2	2
3	6	3	6
-2	-2	-12	6
4	4	-48	6

Final Output: 6

⏱️ Complexity Analysis

Time Complexity: O(n) – We traverse the array only once.

Space Complexity: O(1) – We use only a constant number of variables.

🎯 Key Takeaways
Track both maximum and minimum products.
Swap maximum and minimum when encountering a negative number.
Negative × Negative = Positive.
Handle zero naturally through the recurrence.
Dynamic Programming helps achieve an optimal solution.

Pattern: Maximum and Minimum Tracking + Dynamic Programming

LeetCode: 152. Maximum Product Subarray
