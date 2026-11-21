#Top K Frequent Elements - Java

##Problem Description

Given an integer array nums and an integer k, return the k most frequent elements.

You can return the answer in any order.

##Example 1

Input:

java
nums = [1,1,1,2,2,3]
k = 2


Output:

java
[1,2]


Explanation:

1 appears 3 times.
2 appears 2 times.
3 appears 1 time.

The two most frequent elements are [1,2].

Example 2

Input:

java
nums = [1]
k = 1


Output:

java
[1]

##Approach: HashMap + Sorting

We use HashMap to count the frequency of each element and Sorting to arrange elements based on their frequency.

##Steps
Create a HashMap to store each number and its frequency.
Traverse the array and count the frequency using:

map.put(num, map.getOrDefault(num, 0) + 1);

Convert the HashMap keys into an ArrayList using:

List<Integer> list = new ArrayList<>(map.keySet());

Sort the list in descending order based on frequency using:

Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

Create an answer array of size k.
Store the first k elements from the sorted list.

##Complexity Analysis

Time Complexity: O(n + m log m)

O(n) to count frequencies using HashMap.
O(m) to create the list of unique elements.
O(m log m) to sort the elements.
O(k) to store the top k elements.

Here, m represents the number of unique elements.

Space Complexity: O(n)

HashMap stores the frequencies.
ArrayList stores unique elements.
Answer array stores the top k elements.
Key Concepts Used
Arrays
HashMap
ArrayList
Sorting
Frequency Counting
LeetCode Details
Problem: Top K Frequent Elements
Problem Number: 347
Difficulty: Medium
Language: Java
Topic: Array & HashMap

⭐ If you find this solution helpful, don't forget to star the repository!
