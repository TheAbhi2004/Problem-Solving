class Solution 
{
    public String makeGood(String s) 
    {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(!st.isEmpty() && Math.abs(st.peek()-ch)==32)
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch:st)
        {
            res.append(ch);
        }
        return res.toString();
    }
}