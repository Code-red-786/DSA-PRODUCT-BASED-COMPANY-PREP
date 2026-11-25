205. Isomorphic Strings
Intuition

We need to check whether two strings s and t are isomorphic.

Two strings are isomorphic if each character in the first string can be replaced with a character in the second string while maintaining the same character pattern.

Each character must have a consistent one-to-one mapping.

To achieve this, we use two character arrays:

map1 stores the mapping from s to t.
map2 stores the mapping from t to s.
Approach
First, check whether both strings have the same length. If not, return false.
Create two character arrays of size 256 to store character mappings.
Traverse both strings simultaneously:
Get the current characters ch1 and ch2.
Check whether ch1 is already mapped to a different character. If yes, return false.
Check whether ch2 is already mapped to a different character. If yes, return false.
If both mappings are valid, update both arrays.
After checking all characters, return true.

Note: '\0' represents the null character and is used to identify whether a character has been mapped or not.

Complexity
Time Complexity: O(n) – We traverse both strings exactly once.
Space Complexity: O(1) – We use two fixed-size arrays of 256 characters, regardless of the input length.
Code

Example

Input:

text
s = "egg"
t = "add"


Step-by-step mapping:

Iteration	ch1	ch2	Operation
1	e	a	Store e → a
2	g	d	Store g → d
3	g	d	Existing mapping matches

Final mappings:

text
map1: e → a, g → d
map2: a → e, d → g


All mappings are consistent.

Output:

text
true

Key Takeaway
map1 ensures one character from s always maps to the same character in t.
map2 ensures two different characters from s cannot map to the same character in t.
Both arrays maintain a one-to-one character mapping.
