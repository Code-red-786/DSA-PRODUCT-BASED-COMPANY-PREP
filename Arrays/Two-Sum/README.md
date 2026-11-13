
# Two Sum

- **Platform:** LeetCode
- **Difficulty:** Easy
- **Topic:** Arrays
- **Pattern:** HashMap (Hashing)

## Problem
Find the indices of two numbers whose sum equals the given target.

## Approach
Used HashMap to store numbers and their indices.

1. Calculate `target - nums[i]`.
2. Check whether the required number exists in the HashMap.
3. If found, return both indices.
4. Otherwise, store the current number and its index.

## Complexity
- **Time:** O(n) average
- **Space:** O(n)

## What I Learned
- HashMap and key-value pairs
- Complement technique
- Optimizing brute force from O(n²) to O(n)
