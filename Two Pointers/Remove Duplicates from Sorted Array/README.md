26. Remove Duplicates from Sorted Array

Difficulty: Easy

Topic: Array, Two Pointers

Problem Description

Given a sorted integer array, remove duplicates in-place so that each unique element appears only once.

Return the number of unique elements k.

The first k elements of the array should contain the unique elements in their original order.

Example

Input:

text
nums = [0,0,1,1,1,2,2,3,3,4]


Output:

text
5


Modified array:

text
[0,1,2,3,4,_,_,_,_,_]

Approach: Two Pointers
Initialize i = 0 to track the last unique element.
Start j = 1 to traverse the array.
Compare nums[i] with nums[j].
If both are different:
Increment i.
Assign nums[j] to nums[i].
If both are equal, skip the duplicate.
Return i + 1.
Java Solution
java
class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}

Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1)
Key Concept

Because the array is sorted, duplicate elements are always adjacent.

We use two pointers to modify the original array without using extra space.

Important: HashSet can find unique elements, but it requires O(n) extra space. Two Pointers satisfy the O(1) space requirement.
