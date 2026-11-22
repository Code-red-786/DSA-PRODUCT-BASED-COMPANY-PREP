# Longest Consecutive Sequence – Java

## LeetCode 128

### Problem Description
Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.

The solution must run in O(n) time complexity.

### Example

**Input:**
```java
nums = [100, 4, 200, 1, 3, 2]
```

**Output:**
```java
4
```

**Explanation:**

The longest consecutive sequence is `[1, 2, 3, 4]`.

Therefore, the answer is `4`.

---

## Approach: HashSet

I used a HashSet to solve this problem efficiently.

### Algorithm

1. Insert all array elements into a HashSet.
2. Iterate through the unique elements.
3. Check whether `num - 1` exists in the set.
4. If it does not exist, the current number is the starting point of a sequence.
5. Use a while loop to count consecutive numbers.
6. Update the maximum sequence length.

## Complexity Analysis

| Complexity | Value |
|---|---|
| Time Complexity | O(n) Average |
| Space Complexity | O(n) |

- HashSet insertion takes O(n) average time for all elements.
- Each consecutive sequence is traversed only once.
- HashSet stores unique elements.

## Key Concept

```java
if(!set.contains(num - 1))
```

This is the most important condition.

It ensures that we start counting only from the beginning of a consecutive sequence, avoiding unnecessary repeated calculations.

---

## What I Learned

- How to use HashSet effectively.
- How to avoid duplicate elements.
- How to identify the starting point of a sequence.
- How to optimize an algorithm to O(n) average time complexity.

## Topics

`Java` `HashSet` `Arrays` `LeetCode` `Time Complexity` `Problem Solving`

---

**Problem:** LeetCode 128 – Longest Consecutive Sequence

**Language:** Java

**Approach:** HashSet

**Goal:** O(n) Average Time Complexity
