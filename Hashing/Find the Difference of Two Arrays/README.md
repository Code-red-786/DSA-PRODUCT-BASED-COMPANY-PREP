Find the Difference of Two Arrays
Problem Description

Given two integer arrays nums1 and nums2, return a list containing two lists:

The first list contains all distinct integers in nums1 that are not present in nums2.
The second list contains all distinct integers in nums2 that are not present in nums1.
Approach: HashSet

We use two HashSets to efficiently find the difference between the two arrays.

Algorithm
Create two HashSets: set1 and set2.
Add all elements of nums1 into set1.
Add all elements of nums2 into set2.
Iterate through set1:
If an element is not present in set2, add it to ls1.
Iterate through set2:
If an element is not present in set1, add it to ls2.
Add both lists to the final result and return it.


Example

Input:

text
nums1 = [1, 2, 3]
nums2 = [2, 4, 6]


Output:

text
[[1, 3], [4, 6]]


Explanation:

Elements present in nums1 but not in nums2 are [1, 3].
Elements present in nums2 but not in nums1 are [4, 6].
Complexity Analysis

Let n be the length of nums1 and m be the length of nums2.

Operation	Complexity
Creating HashSets	O(n + m)
Checking elements	O(n + m)
Building result lists	O(n + m)

Time Complexity: O(n + m) average case.

Space Complexity: O(n + m) for the HashSets and result lists.

Key Concepts Used
HashSet
Array Traversal
Set Operations
contains() method
Array Difference
Conclusion

Using HashSet helps eliminate duplicate elements and provides efficient lookup operations. This approach solves the problem with O(n + m) average time complexity.
