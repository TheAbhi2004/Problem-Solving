/*
Recursive
class Solution 
{
    public int fib(int n) 
    {
        if(n==0||n==1)
        {
            return n;
        }
        int a1=fib(n-1);
        int a2=fib(n-2);
        return a1+a2;
    }
}*/ 

//Solving using DP for fast computation
class Solution
{
    public int fib(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        int[] dp=new int[n+1];
        dp[0]=0;dp[1]=1;
        int i;
        for(i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

