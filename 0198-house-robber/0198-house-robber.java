class Solution 
{
    public int rob(int[] nums) 
    {    
        int k=nums[0];
        if (nums.length == 1)
            return k;       
        int p1=k; 
        int p2=0;   
        for (int i=1;i<nums.length;i++) 
        {
            int robcurr=nums[i]+p2;
            int skipcurr=p1;
            int curr=Math.max(robcurr,skipcurr);
            p2=p1;
            p1=curr;
        }
        return p1;
    }
}