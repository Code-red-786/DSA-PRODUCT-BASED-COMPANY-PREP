LeetCode 151 – Reverse Words in a String
Problem Description

Given an input string s, reverse the order of the words.

Words are separated by one or more spaces.

The returned string should:

Have words in reverse order.
Contain only a single space between words.
Have no leading or trailing spaces.
Approach: Split + Reverse Traversal

We use trim(), split() and StringBuilder to reverse the words.

Steps
Use trim() to remove leading and trailing spaces.
Use split("\\s+") to separate words based on one or more spaces.
Create a StringBuilder to construct the reversed string.
Traverse the words array from the last index to the first index.
Append each word to the StringBuilder.
Add a single space between words.
Return the final string using toString().
Java Solution
java
class Solution {
    public String reverseWords(String s) {

        String words[] = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);

            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}

Example 1

Input:

text
s = "the sky is blue"


After split():

text
["the", "sky", "is", "blue"]


Reverse traversal:

text
blue → is → sky → the


Output:

text
"blue is sky the"

Example 2

Input:

text
s = "  hello world  "


After trim() and split():

text
["hello", "world"]


Output:

text
"world hello"

Important Java Concepts
1. trim()

Removes leading and trailing spaces.

2. split("\s+")

Splits the string wherever one or more whitespace characters occur.

3. StringBuilder

Efficiently constructs the resulting string.

4. Reverse for loop
java
for (int i = words.length - 1; i >= 0; i--)


Traverses the words array from last to first.

Complexity Analysis

Let n be the length of the input string.

Complexity	Value	Explanation
Time	O(n)	Trimming, splitting and traversing the words.
Space	O(n)	Stores the words array and the resulting string.
Key Learning
String manipulation
Split method
Trim method
StringBuilderLeetCode 151 – Reverse Words in a String
Problem Description

Given an input string s, reverse the order of the words.

Words are separated by one or more spaces.

The returned string should:

Have words in reverse order.
Contain only a single space between words.
Have no leading or trailing spaces.
Approach: Split + Reverse Traversal

We use trim(), split() and StringBuilder to reverse the words.

Steps
Use trim() to remove leading and trailing spaces.
Use split("\\s+") to separate words based on one or more spaces.
Create a StringBuilder to construct the reversed string.
Traverse the words array from the last index to the first index.
Append each word to the StringBuilder.
Add a single space between words.
Return the final string using toString().

Example 1

Input:

text
s = "the sky is blue"


After split():

text
["the", "sky", "is", "blue"]


Reverse traversal:

text
blue → is → sky → the


Output:

text
"blue is sky the"

Example 2

Input:

text
s = "  hello world  "


After trim() and split():

text
["hello", "world"]


Output:

text
"world hello"

Important Java Concepts
1. trim()

Removes leading and trailing spaces.

2. split("\s+")

Splits the string wherever one or more whitespace characters occur.

3. StringBuilder

Efficiently constructs the resulting string.

4. Reverse for loop
java
for (int i = words.length - 1; i >= 0; i--)


Traverses the words array from last to first.

Complexity Analysis

Let n be the length of the input string.

Complexity	Value	Explanation
Time	O(n)	Trimming, splitting and traversing the words.
Space	O(n)	Stores the words array and the resulting string.
Key Learning
String manipulation
Split method
Trim method
StringBuilder
Reverse traversal
Handling multiple spaces
Platform

LeetCode – 151. Reverse Words in a String

Status: Solved ✅
Reverse traversal
Handling multiple spaces
Platform

LeetCode – 151. Reverse Words in a String

Status: Solved ✅
