# Group Anagrams - Java

## Problem Description

Given an array of strings `strs`, group the anagrams together. You can return the answer in any order.

Anagrams are words that contain the same characters with the same frequency, but may be arranged in a different order.

## Example

**Input:**
```java
strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
```

**Output:**
```java
[["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
```

## Approach: HashMap + Sorting

We use a HashMap to group strings that are anagrams.

### Steps

1. Create a HashMap where:
   - Key = Sorted characters of a string.
   - Value = List of strings having the same sorted key.

2. Iterate through each string in the input array.

3. Convert the string into a character array using `toCharArray()`.

4. Sort the character array using `Arrays.sort()`.

5. Convert the sorted character array into a String. This becomes the key.

6. Check whether the key exists in the HashMap:
   - If it does not exist, create a new ArrayList.
   - Add the original string to the corresponding list.

7. Return all grouped anagrams using `map.values()`.
