
# Maximum Subarray - Java

## Problem Description

Given an integer array `nums`, find the subarray with the largest sum, and return its sum.

A subarray is a contiguous non-empty sequence of elements within an array.

## Example

**Input:**
```java
nums = [-2,1,-3,4,-1,2,1,-5,4]
```

**Output:**
```java
6
```

**Explanation:**

The subarray `[4,-1,2,1]` has the largest sum.

Sum = `4 + (-1) + 2 + 1 = 6`

## Approach: Kadane's Algorithm

We use Kadane's Algorithm to find the maximum subarray sum efficiently.

### Steps

1. Initialize two variables:
   - `currmax = nums[0]`
   - `globalmax = nums[0]`

2. Traverse the array starting from index 1.

3. For every element, calculate the maximum of:
   - Starting a new subarray from the current element.
   - Adding the current element to the previous subarray sum.

4. Update `currmax` using:

   `currmax = Math.max(nums[i], nums[i] + currmax);`

5. Update `globalmax` using:

   `globalmax = Math.max(globalmax, currmax);`

6. Finally, return `globalmax`.

## Dry Run

**Input:**
```java
[-2,1,-3,4,-1,2,1,-5,4]
```

| Index | Element | currmax | globalmax |
|---|---:|---:|---:|
| 0 | -2 | -2 | -2 |
| 1 | 1 | 1 | 1 |
| 2 | -3 | -2 | 1 |
| 3 | 4 | 4 | 4 |
| 4 | -1 | 3 | 4 |
| 5 | 2 | 5 | 5 |
| 6 | 1 | 6 | 6 |
| 7 | -5 | 1 | 6 |
| 8 | 4 | 5 | 6 |

**Final Answer:** `6`

Maximum Subarray: `[4,-1,2,1]`

## Complexity Analysis

**Time Complexity:** `O(n)`

- We traverse the array only once.
- Each iteration performs constant-time operations.

**Space Complexity:** `O(1)`

- We use only two extra variables.
- No additional data structures are required.

## Key Concepts Used

- Arrays
- Dynamic Programming
- Kadane's Algorithm
- Greedy Approach
- Maximum Subarray Sum

## LeetCode Details

- **Problem:** Maximum Subarray
- **Problem Number:** 53
- **Difficulty:** Medium
- **Language:** Java
- **Topic:** Array & Dynamic Programming

---

⭐ If you find this solution helpful, don't forget to star the repository!
