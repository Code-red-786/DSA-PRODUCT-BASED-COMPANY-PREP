643. Maximum Average Subarray I
Intuition

We need to find the maximum average value of a contiguous subarray of length k.

A brute-force approach would calculate the sum of every subarray of size k, which requires unnecessary repeated calculations.

We can optimize this using the Fixed Size Sliding Window technique.

Instead of calculating the sum from scratch for every window, we calculate the first window sum and then update it by adding the new element and removing the previous element.

Approach
Initialize sum = 0 to calculate the sum of the first window.
Traverse the first k elements and calculate their sum.
Initialize maxsum = sum to store the maximum window sum.
Start traversing the remaining elements from index k.
For each iteration:
Add the new element to the current sum.
Remove the element that is leaving the window using nums[i-k].
Update maxsum if the current sum is greater.
After checking all possible windows, calculate the maximum average by dividing maxsum by k.
Return the result as a double.
Java Code
java
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // Calculate the first window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxsum = sum;

        // Fixed Size Sliding Window
        for (int i = k; i < nums.length; i++) {

            // Add new element and remove old element
            sum += nums[i] - nums[i - k];

            // Update maximum sum
            if (sum > maxsum) {
                maxsum = sum;
            }
        }

        // Return maximum average
        return (double) maxsum / k;
    }
}

Example 1

Input:

text
nums = [1, 12, -5, -6, 50, 3]
k = 4


Output:

text
12.75000


Explanation:

The subarray [12, -5, -6, 50] has the maximum sum.

Sum = 12 - 5 - 6 + 50 = 51

Maximum Average = 51 / 4 = 12.75

Example 2

Input:

text
nums = [5]
k = 1


Output:

text
5.00000

Dry Run

Input:

text
nums = [1, 12, -5, -6, 50, 3]
k = 4

Step 1: Calculate First Window

First window = [1, 12, -5, -6]

Sum = 1 + 12 - 5 - 6 = 2

maxsum = 2

Step 2: Sliding Window
i	New Element	Removed Element	Current Window	Sum	maxsum
4	50	1	[12,-5,-6,50]	51	51
5	3	12	[-5,-6,50,3]	42	51
Step 3: Calculate Average

Maximum Sum = 51

Window Size = 4

Maximum Average = 51 / 4 = 12.75

Final Output: 12.75

Complexity
Time Complexity: O(n)
Calculating the first window sum takes O(k).
Sliding through the remaining elements takes O(n-k).
Each element is processed only once.
Overall time complexity is O(n).
Space Complexity: O(1)
Only a few variables are used.
No additional data structures are required.
Key Concepts
Fixed Size Sliding Window
Two Pointers Concept
Running Sum
Maximum Value Tracking
Type Casting (double)
Important Observations
The window size always remains fixed at k.
Calculate the first window sum only once.
Add the new element entering the window.
Subtract the old element leaving the window.
Maintain the maximum sum using maxsum.
Use (double) maxsum / k to get the decimal average.

Pattern: Fixed Size Sliding Window – Add New Element + Remove Old Element.
