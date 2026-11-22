# LeetCode 442 – Find All Duplicates in an Array

## Problem

Given an integer array `nums` of length `n`, where:
- Every integer is in the range `[1, n]`.
- Each integer appears at most twice.

Return all integers that appear twice.

**Example:**

```java
Input:  nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
```

## Approach 1: HashSet

We can use a HashSet to identify duplicate elements.

- If an element is not present in the HashSet, add it.
- If it is already present, add it to the result list.

### Java Code

```java
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (!set.add(num)) {
                list.add(num);
            }
        }

        return list;
    }
}
```

### Complexity

- Time Complexity: O(n) average
- Space Complexity: O(n)

Note: This approach works but does not satisfy the constant auxiliary space requirement.

---

## Approach 2: Index Marking (Optimal)

Since all numbers are in the range `[1, n]`, we can use array indexes to track visited numbers.

### Main Logic

1. Convert the current number into an array index using `Math.abs(nums[i]) - 1`.
2. Check the value at that index.
3. If it is already negative, the number is a duplicate.
4. Otherwise, make that value negative to mark it as visited.
5. Add `index + 1` to the result list when a duplicate is found.

### Important Formulas

**Number to Index:**

```java
int index = Math.abs(nums[i]) - 1;
```

We subtract 1 because array indexes start from 0, but numbers start from 1.

**Index to Original Number:**

```java
list.add(index + 1);
```

We add 1 because we need the original number, not its array index.

## Dry Run

**Input:**

```java
nums = [1, 2, 2]
```

| Iteration | Current Number | Index | Action |
|---|---:|---:|---|
| 1 | 1 | 0 | Mark nums[0] negative |
| 2 | 2 | 1 | Mark nums[1] negative |
| 3 | 2 | 1 | Already negative, duplicate found |

**Final Output:**

```java
[2]
```

## Complexity Analysis

- **Time Complexity:** O(n) – We traverse the array once.
- **Auxiliary Space Complexity:** O(1) – No additional data structure is used, excluding the output list.

Note: The original input array is modified.

## Key Learnings

- HashSet for duplicate detection.
- Array index mapping using `number - 1`.
- Using negative values to mark visited elements.
- `Math.abs()` to retrieve the original number.
- Converting an index back to a number using `index + 1`.
- Achieving O(n) time and O(1) auxiliary space.

**LeetCode:** 442 – Find All Duplicates in an Array  
**Difficulty:** Medium  
**Language:** Java
