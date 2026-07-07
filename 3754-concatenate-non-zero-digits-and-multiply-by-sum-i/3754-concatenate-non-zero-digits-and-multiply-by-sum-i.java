class Solution 
{
    public long sumAndMultiply(int n) 
    {
        int place = 1; 
        int x = 0;
        int sum = 0; 
        while(n>0)
        {
            int d = n % 10;
            if(d != 0)
            {
                x = x + d * place;
                sum = sum + d;
                place = place * 10;
            }
            n = n / 10;
        }
        return 1L * x * sum;
    }
}