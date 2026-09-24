class Solution 
{
    public int smallestIndex(int[] nums) 
    {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int k=nums[i];
            int s=0;
            while(k>0)
            {
                int r=k%10;
                s=s+r;
                k=k/10;
            }
            if(s==i)
            {
                return i;
            }
        }
        return -1;
    }
}