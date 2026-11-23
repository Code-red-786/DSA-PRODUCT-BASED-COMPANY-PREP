303. Range Sum Query - Immutable

!Difficulty !Topic !Language

📌 Problem Statement

Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of elements between indices left and right inclusive.

Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array.
int sumRange(int left, int right) Returns the sum of elements between indices left and right inclusive.
📝 Examples

Example 1:

text
Input:
nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) = 1
sumRange(2, 5) = -1
sumRange(0, 5) = -3


Explanation:

text
Query 1: -2 + 0 + 3 = 1
Query 2: 3 + (-5) + 2 + (-1) = -1
Query 3: -2 + 0 + 3 + (-5) + 2 + (-1) = -3

💡 Approach: Prefix Sum
Intuition

Instead of calculating the sum every time a query is made, we preprocess the array and store cumulative sums in a prefix array.

Prefix Sum Formula:

text
prefix[i] = prefix[i - 1] + nums[i]


To calculate the sum between indices left and right:

text
sumRange(left, right) = prefix[right] - prefix[left - 1]


If left == 0, directly return prefix[right] because there are no elements before the starting index.

Algorithm
Create a prefix array of the same length as nums.
Initialize prefix[0] = nums[0].
Calculate cumulative sums for the remaining elements.
For each query:
If left == 0, return prefix[right].
Otherwise, return prefix[right] - prefix[left - 1].

🔍 Dry Run

Input:

text
nums = [-2, 0, 3, -5, 2, -1]

Step 1: Build Prefix Sum Array
Index	nums[i]	Prefix Sum
0	-2	-2
1	0	-2
2	3	1
3	-5	-4
4	2	-2
5	-1	-3

Prefix Array:

text
[-2, -2, 1, -4, -2, -3]

Step 2: Execute Queries

Query 1: sumRange(0, 2)

text
left == 0

return prefix[2]
     = 1


Query 2: sumRange(2, 5)

text
return prefix[5] - prefix[1]
     = -3 - (-2)
     = -1


Query 3: sumRange(0, 5)

text
left == 0

return prefix[5]
     = -3

Final Output
text
[1, -1, -3]

⏱️ Complexity Analysis

Let n be the length of the input array.

Operation	Time Complexity
Constructor	O(n)
sumRange()	O(1)

Space Complexity: O(n)

We use an additional prefix array of size n.

🎯 Key Takeaways
Prefix Sum is useful for answering multiple range-sum queries efficiently.
Precompute cumulative sums only once.
Use subtraction to calculate the sum of any range.
Avoid repeatedly traversing the original array.
Each range query takes constant time O(1).

Pattern: Prefix Sum

LeetCode: 303. Range Sum Query - Immutable
