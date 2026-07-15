class Solution 
{
    public int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // children pointer
        int j = 0; // cookies pointer

        while (i < g.length && j < s.length) 
        {
            if (s[j] >= g[i]) 
            {
                i++; // child is satisfied
            }
            j++; // move to next cookie
        }

        return i;
    }
}