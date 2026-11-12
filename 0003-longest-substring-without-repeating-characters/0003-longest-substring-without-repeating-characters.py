class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        char_index = {}  # Stores characters and their latest index
        left = 0         # Left pointer of the window
        max_length = 0   # Result variable

        for right in range(len(s)):
            if s[right] in char_index and char_index[s[right]] >= left:
                # Move the left pointer to the right of the repeating character
                left = char_index[s[right]] + 1

            char_index[s[right]] = right  # Update the last seen index
            max_length = max(max_length, right - left + 1)  # Update max length

        return max_length