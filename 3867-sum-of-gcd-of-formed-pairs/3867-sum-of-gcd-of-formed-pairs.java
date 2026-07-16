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
    public long gcdSum(int[] nums) 
    {
        int n = nums.length;
        int prefixgcd[] = new int[n];

        int max=nums[0];
        for(int i=0;i<n;i++)
        {
            max = Math.max(max,nums[i]);
            prefixgcd[i] = gcd(nums[i],max);
        }

        Arrays.sort(prefixgcd);

        long sum=0;
        int l=0,r=nums.length-1;

        while(l<r)
        {
            sum = sum+gcd(prefixgcd[l],prefixgcd[r]);
            l++;
            r--;
        }
        return sum;
    }
}