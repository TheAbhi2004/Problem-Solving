class Solution 
{
    public int[] asteroidCollision(int[] asteroids) 
    {
        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) 
        {

            while (!st.isEmpty() && st.peek()>0 && a<0 && st.peek() < -a) 
            {
                st.pop();
            }

            if (!st.isEmpty() && st.peek()>0 && a<0) 
            {
                if (st.peek()==-a) 
                {
                    st.pop();
                }
                // if st.peek() > -a, current asteroid dies
            } 
            else 
            {
                st.push(a);
            }
        }

        int[] res = new int[st.size()];

        for (int i = res.length - 1; i >= 0; i--) 
        {
            res[i] = st.pop();
        }

        return res;
    }
}