11. Container With Most Water
Problem Description

Given an integer array height, where each element represents the height of a vertical line, find two lines that together with the x-axis form a container that can store the maximum amount of water.

Return the maximum water capacity.

Approach: Two Pointer Technique

We use the Two Pointer approach to solve this problem efficiently.

Initialize two pointers:
left = 0
right = height.length - 1
Initialize maxArea = 0.
Calculate the width using right - left.
Find the minimum height between the two pointers using Math.min().
Calculate the area using:

Area = Width * Minimum Height

Update the maximum area using Math.max().
Move the pointer with the smaller height:
If height[left] < height[right], increment left.
Otherwise, decrement right.
Repeat until left becomes greater than or equal to right.
Return maxArea.
Java Solution
java
class Solution {
    public int maxArea(int[] height) {

        int right = height.length - 1;
        int left = 0;
        int maxarea = 0;

        while (left < right) {

            int width = right - left;

            int h = Math.min(height[left], height[right]);

            int area = width * h;

            maxarea = Math.max(maxarea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxarea;
    }
}

Example

Input:

java
height = [1,8,6,2,5,4,8,3,7]


Output:

java
49


Explanation:

The maximum area is formed by the lines at index 1 and index 8.

Left height = 8
Right height = 7
Width = 8 - 1 = 7
Minimum height = 7

Area = 7 × 7 = 49.

Complexity Analysis
Time Complexity: O(n) – We traverse the array using two pointers. Each pointer moves at most n times.
Space Complexity: O(1) – We use only a constant number of extra variables.
Key Learnings
Two Pointer Technique.
Efficient area calculation.
Using Math.min() and Math.max().
Moving the pointer with the smaller height helps optimize the search.

Optimal Solution: O(n) Time and O(1) Auxiliary Space.
