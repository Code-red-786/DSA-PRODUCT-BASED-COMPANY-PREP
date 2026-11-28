209. Minimum Size Subarray Sum
Intuition

We need to find the minimum length of a contiguous subarray whose sum is greater than or equal to the given target.

Instead of checking every possible subarray using nested loops, we can use the Variable Size Sliding Window technique.

We expand the window by moving the right pointer and shrink the window by moving the left pointer whenever the sum becomes greater than or equal to the target.

This helps us find the minimum length efficiently.

Approach
Initialize two pointers:
left = 0 to represent the starting index.
right to represent the ending index.
Initialize sum = 0 to maintain the current window sum.
Initialize length = Integer.MAX_VALUE to track the minimum subarray length.
Traverse the array using the right pointer.
Add the current element to the window sum:
sum += nums[right]
If sum >= target:
Update the minimum length using Math.min().
Remove the leftmost element from the current sum.
Move the left pointer forward.
Continue shrinking the window while the sum is greater than or equal to the target.
After traversing the array:
If a valid subarray was found, return its minimum length.
Otherwise, return 0.
Java Code
java
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // Expand the window
            sum += nums[right];

            // Shrink the window
            while (sum >= target) {

                length = Math.min(
                    length, right - left + 1
                );

                sum -= nums[left];
                left++;
            }
        }

        if (length != Integer.MAX_VALUE) {
            return length;
        } else {
            return 0;
        }
    }
}

Example

Input:

text
target = 7
nums = [2, 3, 1, 2, 4, 3]


Output:

text
2


Explanation:

The subarray [4, 3] has a sum of 7 and length 2, which is the minimum possible length.

Dry Run
Right	Added Element	Current Window	Sum	Minimum Length
0	2	[2]	2	Infinity
1	3	[2,3]	5	Infinity
2	1	[2,3,1]	6	Infinity
3	2	[2,3,1,2]	8	4
3	Remove 2	[3,1,2]	6	4
4	4	[3,1,2,4]	10	4
4	Remove 3	[1,2,4]	7	3
4	Remove 1	[2,4]	6	3
5	3	[2,4,3]	9	3
5	Remove 2	[4,3]	7	2
5	Remove 4	[3]	3	2

Final Answer: 2

Complexity
Time Complexity: O(n)
The right pointer traverses the array once.
The left pointer also moves forward at most n times.
Therefore, the overall time complexity is O(n).
Space Complexity: O(1)
Only a few variables are used.
No additional data structure is required.
Key Concepts
Variable Size Sliding Window
Two Pointers
Window Expansion
Window Shrinking
Minimum Length Optimization
Important Observations
Use right to expand the window.
Use left to shrink the window.
Use sum >= target to identify valid subarrays.
Use Math.min() to maintain the minimum length.
Initialize minimum length with Integer.MAX_VALUE.
Return 0 if no valid subarray exists.

Pattern: Variable Size Sliding Window – Expand and Shrink.
