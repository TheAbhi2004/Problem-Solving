class Solution 
{
    private String process(String s)
    {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch!='#')
            {
                st.push(ch);
            }
            else if(!st.isEmpty())
            {
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public boolean backspaceCompare(String s, String t) 
    {
        return process(s).equals(process(t));
    }
}