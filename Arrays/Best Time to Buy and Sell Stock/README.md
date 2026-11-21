
# Best Time to Buy and Sell Stock - Java

## Problem Description

You are given an array `prices` where `prices[i]` represents the price of a stock on the ith day.

You can buy one stock and sell it on a different day in the future.

Your task is to find the maximum profit you can achieve. If no profit is possible, return 0.

## Example 1

**Input:**
```java
prices = [7,1,5,3,6,4]
```

**Output:**
```java
5
```

**Explanation:**

Buy on day 2 at price 1 and sell on day 5 at price 6.

Profit = 6 - 1 = 5.

## Example 2

**Input:**
```java
prices = [7,6,4,3,1]
```

**Output:**
```java
0
```

**Explanation:**

Stock prices keep decreasing, so no profit is possible.

## Approach: Greedy Algorithm

We use a Greedy approach to find the maximum profit in a single traversal.

### Steps

1. Initialize `lowest` with `Integer.MAX_VALUE` to track the minimum stock price.
2. Initialize `gain = 0` to store the maximum profit.
3. Traverse the prices array using a for-each loop.
4. If the current price is smaller than `lowest`, update `lowest`.
5. Otherwise, calculate the profit by subtracting the lowest price from the current price.
6. If the calculated profit is greater than `gain`, update `gain`.
7. Finally, return `gain`.

**Input:**
```java
prices = [7,1,5,3,6,4]
```

| Day | Price | Lowest Price | Profit | Max Gain |
|---|---:|---:|---:|---:|
| 1 | 7 | 7 | 0 | 0 |
| 2 | 1 | 1 | 0 | 0 |
| 3 | 5 | 1 | 4 | 4 |
| 4 | 3 | 1 | 2 | 4 |
| 5 | 6 | 1 | 5 | 5 |
| 6 | 4 | 1 | 3 | 5 |

**Final Output:** `5`

- Buying Price: 1
- Selling Price: 6
- Maximum Profit: 5

## Complexity Analysis

**Time Complexity: O(n)**

- We traverse the prices array only once.
- Each iteration performs constant-time operations.

**Space Complexity: O(1)**

- We use only a fixed number of variables.
- No additional data structures are required.

## Key Concepts Used

- Arrays
- Greedy Algorithm
- Single Traversal
- Minimum Value Tracking
- Maximum Profit Calculation

## LeetCode Details

- **Problem:** Best Time to Buy and Sell Stock
- **Problem Number:** 121
- **Difficulty:** Easy
- **Language:** Java
- **Topic:** Arrays & Greedy

---

⭐ If you find this solution helpful, don't forget to star the repository!
