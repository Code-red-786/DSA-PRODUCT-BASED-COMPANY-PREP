383. Ransom Note
Intuition

We need to check whether the ransomNote can be constructed using the characters available in magazine.

Each character in magazine can be used only once.

So, we need to maintain the frequency of each character and make sure we never use more characters than are available.

Approach
Create an integer array of size 27 to store the frequency of lowercase English letters.
Traverse the magazine string and increment the frequency of each character.
Traverse the ransomNote string:
Calculate the index of the current character.
Decrement its frequency because we are using that character.
If the frequency becomes negative, return false because the required character is not available.
If the entire loop completes without returning false, return true.
Complexity
Time Complexity: O(m + n) – We traverse both strings once, where m is the length of magazine and n is the length of ransomNote.
Space Complexity: O(1) – We use a fixed-size array to store character frequencies.


Example

Input:

text
ransomNote = "aa"
magazine = "aab"


Frequency Calculation:

Initially, all frequencies are zero.

After traversing magazine = "aab":

text
a = 2
b = 1


Now traverse ransomNote = "aa":

First 'a': Frequency decreases from 2 to 1.
Second 'a': Frequency decreases from 1 to 0.

No frequency becomes negative, so we return true.

Output:

text
true

Key Takeaway
arr[index]++ → Increases the available character count.
arr[index]-- → Uses one available character.
arr[index] < 0 → Required character is not available enough times.

Note: An array of size 26 is sufficient because we only have lowercase English letters. Size 27 also works, but one extra element is unused.
