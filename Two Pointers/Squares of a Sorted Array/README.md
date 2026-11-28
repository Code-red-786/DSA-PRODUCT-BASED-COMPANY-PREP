977. Squares of a Sorted Array
Intuition

Given a sorted integer array, we need to return a new array containing the squares of each number in sorted order.

Since the array contains negative and positive numbers, simply squaring each element will not maintain the sorted order.

The largest square will always be at either the leftmost or rightmost position because numbers with larger absolute values produce larger squares.

So, we can use the Two Pointer technique to solve this efficiently.

Approach
Create a new array sol of the same length as the input array.
Initialize two pointers:
left = 0 → points to the first element.
right = nums.length - 1 → points to the last element.
Initialize square = nums.length - 1 to fill the result array from right to left.
Calculate the squares of the left and right elements.
Compare both squares:
If leftsquare > rightsquare, place leftsquare at sol[square] and increment left.
Otherwise, place rightsquare at sol[square] and decrement right.
Decrement square after every iteration.
Continue until left > right.
Return the sorted squares array.
Java Code
java
class Solution {
    public int[] sortedSquares(int[] nums) {

        int sol[] = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        int square = nums.length - 1;

        while (left <= right) {

            int leftsquare = nums[left] * nums[left];
            int rightsquare = nums[right] * nums[right];

            if (leftsquare > rightsquare) {
                sol[square] = leftsquare;
                left++;
            } else {
                sol[square] = rightsquare;
                right--;
            }

            square--;
        }

        return sol;
    }
}

Example

Input:

text
nums = [-4, -1, 0, 3, 10]


Output:

text
[0, 1, 9, 16, 100]

Dry Run
Left Value	Right Value	Larger Square	Result Position
-4	10	100	4
-4	3	16	3
-1	3	9	2
-1	0	1	1
0	0	0	0

Final Result: [0, 1, 9, 16, 100]

Complexity
Time Complexity: 
𝑂(𝑛)
 – We traverse the array only once using two pointers.
Space Complexity: 
𝑂(𝑛)
 – We create a new result array of size n.
Key Concept

Two Pointers Technique

Instead of squaring every element and sorting the result, we compare the squares at both ends and fill the result array from right to left.

This avoids the need for an additional sorting operation.
