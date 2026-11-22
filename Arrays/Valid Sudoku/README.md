# LeetCode 36 – Valid Sudoku

## Problem
Determine if a 9 × 9 Sudoku board is valid.

A Sudoku board is valid if:
- Each row contains no duplicate digits (1–9).
- Each column contains no duplicate digits (1–9).
- Each 3 × 3 sub-box contains no duplicate digits (1–9).
- Empty cells (`.`) are ignored.

## Approach: Boolean 2D Arrays

We use three 2D boolean arrays to track whether a number has already appeared:

```java
boolean[][] r = new boolean[9][9];
boolean[][] c = new boolean[9][9];
boolean[][] b = new boolean[9][9];
```

- `r[i][num]` → Tracks a number in row `i`.
- `c[j][num]` → Tracks a number in column `j`.
- `b[bi][num]` → Tracks a number in 3 × 3 box `bi`.

### Important Calculations

**1. Convert character into array index**

```java
int num = board[i][j] - '1';
```

Maps `'1'` to `0`, `'2'` to `1`, ... `'9'` to `8`.

**2. Find the 3 × 3 box index**

```java
int bi = (i / 3) * 3 + (j / 3);
```

Maps every cell to one of the 9 boxes (0–8).


## Complexity Analysis

- **Time Complexity:** O(1) – The board is always fixed at 9 × 9 (81 cells).
- **Space Complexity:** O(1) – Three fixed-size 9 × 9 boolean arrays.

## Key Learning

- 2D Boolean arrays for duplicate detection.
- Character-to-integer conversion using ASCII difference.
- 3 × 3 box index calculation.
- Using `||` to check multiple duplicate conditions.

**LeetCode:** 36 – Valid Sudoku  
**Difficulty:** Medium  
**Language:** Java
