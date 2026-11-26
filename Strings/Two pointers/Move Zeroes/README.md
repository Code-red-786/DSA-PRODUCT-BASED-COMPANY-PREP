283. Move Zeroes

Difficulty: Easy

Topic: Array, Two Pointers

Problem Description

Given an integer array, move all zeroes to the end while maintaining the relative order of non-zero elements.

The operation must be performed in-place.

Example

Input:

text
nums = [0,1,0,3,12]


Output:

text
[1,3,12,0,0]

Approach: Two Pointers (Overwrite and Fill)
Initialize i = 0 to track the next position for a non-zero element.
Traverse the array using j.
If nums[j] != 0:
Assign nums[j] to nums[i].
Increment i.
After traversing, fill the remaining positions with zeroes.
Java Solution
java
class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0;

        // Move non-zero elements to the front
        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        // Fill remaining positions with zeroes
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}

Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1)
Key Concept

Instead of swapping every element, we move all non-zero elements to the front and fill the remaining positions with zeroes.

This maintains the relative order of non-zero elements.
