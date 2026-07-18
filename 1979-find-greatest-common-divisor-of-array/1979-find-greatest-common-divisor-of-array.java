class Solution 
{
    private int gcd(int a,int b)
    {
        while(b!=0)
        {
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public int findGCD(int[] nums) 
    {
        int min=nums[0];
        int max=nums[0];
        for(int num:nums)
        {
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        return gcd(max,min);
    }
}