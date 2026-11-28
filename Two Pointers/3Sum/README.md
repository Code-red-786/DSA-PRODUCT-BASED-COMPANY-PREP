15. 3Sum
Intuition

The goal is to find all unique triplets in the array whose sum is equal to zero.

A brute-force approach would use three nested loops, resulting in O(n³) time complexity.

We can optimize this using Sorting + Two Pointers.

After sorting the array, we fix one element and use two pointers (left and right) to find the remaining two elements whose sum with the fixed element equals zero.

Approach
Create an empty list ans to store the unique triplets.
Sort the input array using Arrays.sort(nums).
Iterate through the array using a for loop:
Skip duplicate elements to avoid duplicate triplets.
If nums[i] > 0, break because the remaining elements are also positive.
Initialize two pointers:
left = i + 1
right = nums.length - 1
Calculate the sum of the three elements:
sum = nums[i] + nums[left] + nums[right]
Check the sum:
If sum == 0, add the triplet to the result.
Move both pointers inward.
Skip duplicate values to avoid duplicate triplets.
If sum < 0, increment left to increase the sum.
If sum > 0, decrement right to decrease the sum.
Continue until left is no longer less than right.
Return the result list.
Java Code
java
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] > 0) {
                break;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    ans.add(Arrays.asList(
                        nums[i], nums[left], nums[right]
                    ));

                    left++;
                    right--;

                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return ans;
    }
}

Example

Input:

text
nums = [-1, 0, 1, 2, -1, -4]


After Sorting:

text
[-4, -1, -1, 0, 1, 2]


Output:

text
[[-1, -1, 2], [-1, 0, 1]]

Dry Run
i	nums[i]	left	right	Sum	Action
0	-4	-1	2	-4	left++
0	-4	-1	1	-4	left++
0	-4	0	1	-3	left++
1	-1	-1	2	0	Add triplet
1	-1	0	1	0	Add triplet

Final Result:

text
[[-1, -1, 2], [-1, 0, 1]]

Complexity
Time Complexity: O(n²)
Sorting takes O(n log n).
The outer loop runs O(n) times.
The two-pointer traversal takes O(n) for each iteration.
Overall complexity is O(n²).
Space Complexity: O(1) auxiliary space, excluding the sorting implementation and output list.
Key Concepts
Sorting
Two Pointers
Duplicate Handling
Array Traversal
Important Observations
Sorting helps us use two pointers efficiently.
If the sum is less than zero, move left forward.
If the sum is greater than zero, move right backward.
Skip duplicate values to avoid repeated triplets.
If the fixed element is greater than zero, stop searching because no valid triplet is possible.
