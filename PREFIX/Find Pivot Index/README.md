###LeetCode 724 --- Find Pivot Index
Problem
Given an integer array nums, find the pivot index.

A pivot index is an index where the sum of all elements strictly to its
left is equal to the sum of all elements strictly to its right.
- Elements at the pivot index are excluded from both sums.
- If the pivot is at the left edge, the left sum is 0.
- If the pivot is at the right edge, the right sum is 0.
- Return the leftmost pivot index.
- If no pivot exists, return -1.
Examples
Example 1
Input
nums = [1, 7, 3, 6, 5, 6]
Output
3
Explanation

At index 3:
- Left sum = 1 + 7 + 3 = 11
- Right sum = 5 + 6 = 11
Since both sums are equal, the pivot index is 3.
Example 2
Input
nums = [1, 2, 3]
Output
-1
Explanation

There is no index where the left sum equals the right sum.
Example 3
Input
nums = [2, 1, -1]
Output
0
Explanation

At index 0:
- Left sum = 0 (there are no elements to the left)
- Right sum = 1 + (-1) = 0
Both sums are equal, so the pivot index is 0.
Approach --- Total Sum and Running Left Sum
Instead of calculating the left and right sums separately for every
index, calculate the total sum once.

For each index i:
1. leftSum stores the sum of elements before index i.
2. Calculate the right sum using:
   rightSum = totalSum - leftSum - nums[i];
3. If leftSum == rightSum, return i.
4. Otherwise, add nums[i] to leftSum and continue.
If the loop finishes without finding a pivot, return -1.
Java Solution
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
Dry Run
For:
nums = [1, 7, 3, 6, 5, 6]
The total sum is 28.
Index (`i`)     `nums[i]`     `leftSum`   `rightSum = total - leftSum - nums[i]`      Equal?

          0             1             0                                       27        No

          1             7             1                                       20        No

          2             3             8                                       17        No

          3             6            11                                       11       Yes

At index 3, leftSum and rightSum are both 11, so the method
returns 3.
Complexity Analysis
- Time Complexity: O(n) --- one pass calculates the total sum
  and another pass checks each possible pivot.
- Space Complexity: O(1) --- only a few extra variables are
  used.
Key Formula
rightSum = totalSum - leftSum - nums[i];
The total sum includes the left side, the current pivot element, and the
right side. Subtracting the left sum and current element leaves the
right sum.
Key Takeaway
Use a running leftSum and the precomputed totalSum to calculate each
rightSum in constant time. This finds the leftmost pivot in linear
time without creating an extra array.
