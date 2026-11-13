# Contains Duplicate

- **Platform:** LeetCode
- **Problem Number:** 217
- **Difficulty:** Easy
- **Topic:** Arrays
- **Pattern:** Hashing
- **Data Structure:** HashSet

## Problem

Given an integer array `nums`, return `true` if any value appears at least twice, and return `false` if every element is distinct.

## Approach – HashSet

Used a HashSet to store unique elements.

1. Create an empty HashSet.
2. Traverse the array using a for-each loop.
3. Try adding each number to the HashSet.
4. If `add()` returns false, the number already exists.
5. Return true if a duplicate is found.
6. If the loop completes, return false.

## Example

**Input:** `nums = [1, 2, 3, 1]`

**Output:** `true`

The number `1` appears twice.

## Complexity Analysis

- **Time Complexity:** O(n) average
- **Space Complexity:** O(n)

## What I Learned

- HashSet
- Duplicate detection
- `HashSet.add()` boolean return value
- For-each loop
- Hashing technique
