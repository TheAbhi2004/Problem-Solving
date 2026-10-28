class Solution 
{
    public int[] singleNumber(int[] nums) 
    {
        int n=nums.length;
        int xor=0;
        int i;
        for(i=0;i<n;i++)
        {
            xor=xor^nums[i];
        }
        int bit=xor&(-xor); //the rightmost set bit 
        int a=0;
        int b=0;
        for(i=0;i<n;i++)
        {
            if((nums[i]&bit)==0)
            {
                a=a^nums[i];
            }
            else
            {
                b=b^nums[i];
            }
        }
        return new int[]{b,a};
    }
}