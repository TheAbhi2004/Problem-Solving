class Solution 
{
    public int countPrimes(int n) 
    {
        if(n<3)
            return 0;
        int i,j;
        boolean[] prime = new boolean[n];
        for(i=2;i<n;i++)
        {
            prime[i]=true;
        }
        for(i=2;i*i<n;i++)
        {
            if(prime[i]==true)
            {
                for(j=i*i;j<n;j+=i)
                {
                    prime[j]=false;
                }
            }
        }
        int c=0;
        for(i=2;i<n;i++)
        {
            if(prime[i]==true)
            {
                c++;
            }
        }
        return c;
    }
}