class Solution 
{
    public String smallestSubsequence(String s)
    {
        int[] last = new int[26];
        boolean[] visited = new boolean[26];

        // Record the last occurrence of each character
        for (int i = 0; i < s.length(); i++) 
        {
            last[s.charAt(i) - 'a'] = i;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);

            if (visited[c - 'a']) 
            {
                continue;
            }

            while (!stack.isEmpty()
                    && stack.peekLast() > c
                    && last[stack.peekLast() - 'a'] > i) 
                    {
                visited[stack.removeLast() - 'a'] = false;
            }

            stack.addLast(c);
            visited[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) 
        {
            sb.append(stack.removeFirst());
        }

        return sb.toString();
    }
}