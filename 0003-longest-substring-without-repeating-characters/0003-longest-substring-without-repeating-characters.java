class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int left = 0;
        int maxLen = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) 
        {
            char ch = s.charAt(right);

            // If character repeats inside current window
            if (map.containsKey(ch) && map.get(ch)>=left) 
            {
                left = map.get(ch) + 1;  // move left pointer
            }

            // update last index of char
            map.put(ch, right);

            // update longest length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
