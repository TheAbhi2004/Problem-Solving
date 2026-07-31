class Solution 
{
    public int hammingDistance(int x, int y) 
    {
        int n=x^y;
        int c=0;

        while (n > 0) 
        {
            c= c+ n % 2;
            n = n/2;
        }

        return c;
    }
}