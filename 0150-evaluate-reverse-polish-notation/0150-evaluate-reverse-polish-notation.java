class Solution
{
    public int evalRPN(String[] tokens)
    {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens)
        {
            switch (token)
            {
                case "+":
                {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a + b);
                    break;
                }

                case "-":
                {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;
                }

                case "*":
                {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a * b);
                    break;
                }

                case "/":
                {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a / b);
                    break;
                }

                default:
                {
                    stack.push(Integer.parseInt(token));
                }
            }
        }

        return stack.pop();
    }
}