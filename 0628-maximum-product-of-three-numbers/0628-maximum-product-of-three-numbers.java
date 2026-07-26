class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        int l1 = Integer.MIN_VALUE;
        int l2 = Integer.MIN_VALUE;
        int l3 = Integer.MIN_VALUE;

        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;

        for(int n:nums)
        {
            if(n>l1)
            {
                l3=l2;
                l2=l1;
                l1=n;
            }
            else if(n>l2)
            {
                l3=l2;
                l2=n;
            }
            else if(n>l3)
            {
                l3=n;
            }
            if(n<s1)
            {
                s2=s1;
                s1=n;
            }
            else if(n<s2)
            {
                s2=n;
            }
        }
        return Math.max(l1*l2*l3,l1*s1*s2);
    }    
}