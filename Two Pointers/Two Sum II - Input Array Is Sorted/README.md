167. Two Sum II - Input Array Is Sorted

Difficulty: Medium

Topic: Two Pointers, Array, Binary Search

Problem Description

Given a sorted array of integers and a target, find two numbers whose sum equals the target.

Return their 1-based indices.

Example

Input:

text
numbers = [2,7,11,15]
target = 9


Output:

text
[1,2]

Approach: Two Pointers
Initialize left = 0.
Initialize right = numbers.length - 1.
Calculate the sum of both elements.
If sum equals target, return their indices.
If sum is smaller than target, increment left.
If sum is greater than target, decrement right.

Since the array is sorted, we can efficiently find the answer.

Java Solution
java
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}

Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1)
Key Concept

In a sorted array:

Smaller sum → Move left pointer forward.
Larger sum → Move right pointer backward.

Remember to return 1-based indices using left + 1 and right + 1.
