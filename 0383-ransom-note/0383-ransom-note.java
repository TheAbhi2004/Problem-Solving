class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int[] ct = new int[26];

        for (char c : magazine.toCharArray()) 
        {
            ct[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) 
        {
            if (ct[c - 'a'] == 0) 
            {
                return false;
            }
            ct[c - 'a']--;
        }

        return true;
    }
}