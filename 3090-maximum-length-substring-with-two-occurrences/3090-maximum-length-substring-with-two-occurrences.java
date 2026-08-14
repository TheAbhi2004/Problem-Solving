class Solution 
{
    public int maximumLengthSubstring(String s) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0,maxl=0;
        for(int r=0;r<s.length();r++)
        {
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2)
            {
                char ch1=s.charAt(l);
                map.put(ch1,map.get(ch1)-1);
                l++;
            }
            maxl=Math.max(maxl,r-l+1);
        }
        return maxl;
    }
}