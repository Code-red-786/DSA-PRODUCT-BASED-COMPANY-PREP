75. Sort Colors
Problem Description

Given an array nums containing 0, 1, and 2, sort the array in-place so that all 0s come first, followed by all 1s, and then all 2s.

0 represents Red.
1 represents White.
2 represents Blue.

The solution must be implemented without using the built-in sorting function.

Approach: Dutch National Flag Algorithm (Three Pointers)

We use three pointers to sort the array in a single traversal.

Initialize three pointers:
low = 0
mid = 0
high = nums.length - 1
Traverse the array while mid <= high.
Check the current element nums[mid]:

Case 1: nums[mid] == 0

Swap nums[low] and nums[mid].
Increment both low and mid.

Case 2: nums[mid] == 1

Increment mid.
No swapping is required because 1 belongs in the middle.

Case 3: nums[mid] == 2

Swap nums[mid] and nums[high].
Decrement high.
Do not increment mid, because the swapped element needs to be checked.
Continue until mid > high.
Java Solution
java
class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}

Example

Input:

java
nums = [2,0,2,1,1,0]


Output:

java
[0,0,1,1,2,2]

Complexity Analysis
Time Complexity: O(n) – Each element is processed at most once.
Space Complexity: O(1) – Sorting is performed in-place using only three pointers and a temporary variable.
Key Learnings
Dutch National Flag Algorithm.
Three Pointer Technique.
In-place sorting.
Efficient swapping.
Handling duplicate elements.

Optimal Solution: O(n) Time Complexity and O(1) Auxiliary Space.
