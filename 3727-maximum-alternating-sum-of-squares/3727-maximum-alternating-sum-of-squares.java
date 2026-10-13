class Solution 
{
    public long maxAlternatingSum(int[] nums) 
    {
        long res=0;
        int n=nums.length;
        int i;
        for(i=0;i<n;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int mid=n/2;
        i=0;
        while(i<mid)
        {
            res=res-nums[i];
            i++;
        }
        i=mid;
        while(i<n)
        {
            res=res+nums[i];
            i++;
        }
        return res;
    }
}