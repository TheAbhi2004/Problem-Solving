class Solution 
{
    public String minWindow(String s, String t) 
    {
        if(t.length()==0)
        {
            return "";
        }
        if(s.length()<t.length())
        {
            return "";
        }
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();

        for(char ch:t.toCharArray())
        {
            need.put(ch,need.getOrDefault(ch,0)+1);
        }
        int required=need.size();
        int formed=0;
        int start=0;
        int minLength = Integer.MAX_VALUE;
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            char ch = s.charAt(right);
            window.put(ch,window.getOrDefault(ch,0)+1);
            if(need.containsKey(ch) && window.get(ch).equals(need.get(ch)))
            {
                formed++;
            }
            while(formed==required)
            {
                int len = right-left+1;
                if(len<minLength)
                {
                    minLength=len;
                    start=left;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar,window.get(leftChar)-1);
                if(need.containsKey(leftChar)&&window.get(leftChar)<need.get(leftChar))
                {
                    formed--;
                }
                left++;
            }
        }
        if(minLength==Integer.MAX_VALUE)
        {
            return "";
        }

        return s.substring(start,start+minLength);
    }
}