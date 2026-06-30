class Solution 
{
    public int numberOfSubstrings(String s) 
    {
        int l = 0;
        int count = 0;
        int n = s.length();

        Map<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < n; r++)
        {
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() == 3)
            {
                count += (n - r);

                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0)
                    map.remove(leftChar);

                l++;
            }
        }
        return count;
    }
}