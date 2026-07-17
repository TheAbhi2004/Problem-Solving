class Solution 
{
    private int isVowel(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            return 1;
        }
        return 0;
    }
    public int maxVowels(String s, int k) 
    {
        int n = s.length();
        int count = 0;
        for(int i=0;i<k;i++)
        {
            char ch = s.charAt(i);
            if(isVowel(ch)==1)
            {
                count++;
            }
        }
        int max = count;
        for(int i=k;i<n;i++)
        {
            if(isVowel(s.charAt(i))==1)
            {
                count++;
            }
            if(isVowel(s.charAt(i-k))==1)
            {
                count--;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}