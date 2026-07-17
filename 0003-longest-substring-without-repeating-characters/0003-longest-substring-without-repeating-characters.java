class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int left = 0;
        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) 
        {
            char ch = s.charAt(right);
            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen,right-left+1);
        }

        return maxLen;
    }
}
