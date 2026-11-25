290. Word Pattern
Intuition

We need to check whether the given string s follows the same pattern as the string pattern.

Each character in pattern should map to exactly one word in s, and each word should map to exactly one character.

To maintain this one-to-one relationship, we use two HashMaps.

map1 stores character-to-word mapping.
map2 stores word-to-character mapping.
Approach
Create two HashMaps:
map1: Maps characters to words.
map2: Maps words to characters.
Split the string s into an array of words using split(" ").
Check whether the length of pattern matches the number of words. If not, return false.
Traverse the pattern and words simultaneously:
Get the current character from pattern.
Get the corresponding word from words.
Check whether the character is already mapped to a different word. If yes, return false.
Check whether the word is already mapped to a different character. If yes, return false.
Otherwise, update both HashMaps.
If all characters and words satisfy the mapping rules, return true.
Complexity
Time Complexity: O(n) – We traverse the words once. HashMap operations take O(1) average time.
Space Complexity: O(n) – We use two HashMaps to store character-to-word and word-to-character mappings.


Example

Input:

text
pattern = "abba"
s = "dog cat cat dog"


Step-by-step mapping:

Iteration	Character	Word	Result
1	a	dog	Insert mapping
2	b	cat	Insert mapping
3	b	cat	Mapping matches
4	a	dog	Mapping matches

Final HashMaps:

text
map1 = {a=dog, b=cat}
map2 = {dog=a, cat=b}


All mappings are valid.

Output:

text
true

Key Takeaway
First HashMap prevents one character from mapping to multiple words.
Second HashMap prevents multiple characters from mapping to the same word.
Both HashMaps are necessary to maintain a one-to-one mapping.
