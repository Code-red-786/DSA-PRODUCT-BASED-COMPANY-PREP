
# Valid Anagram - Java

## Problem Description

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters exactly once.

## Example 1

**Input:**
```java
s = "anagram"
t = "nagaram"
```

**Output:**
```java
true
```

**Explanation:**

Both strings contain the same characters with the same frequency.

## Example 2

**Input:**
```java
s = "rat"
t = "car"
```

**Output:**
```java
false
```

**Explanation:**

Both strings contain different characters, so they are not anagrams.

## Approach: Sorting

We use the Sorting technique to check whether two strings are anagrams.

### Steps

1. First, check whether both strings have the same length.
2. If their lengths are different, return `false`.
3. Convert both strings into character arrays using `toCharArray()`.
4. Sort both character arrays using `Arrays.sort()`.
5. Compare both sorted arrays using `Arrays.equals()`.
6. If both arrays are equal, return `true`; otherwise, return `false`.


## Complexity Analysis

**Time Complexity: O(n log n)**

- Converting strings into character arrays takes O(n).
- Sorting both arrays takes O(n log n).
- Comparing both arrays takes O(n).

**Space Complexity: O(n)**

- Two character arrays are created to store the characters of both strings.

## Key Concepts Used

- Strings
- Character Arrays
- Sorting
- Arrays.sort()
- Arrays.equals()
- String Manipulation

## LeetCode Details

- **Problem:** Valid Anagram
- **Problem Number:** 242
- **Difficulty:** Easy
- **Language:** Java
- **Topic:** Hashing & Sorting

---

⭐ If you find this solution helpful, don't forget to star the repository!
