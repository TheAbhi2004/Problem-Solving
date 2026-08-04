class Solution 
{
    public List<Integer> findMissingElements(int[] nums) 
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();
        for(int num:nums)
        {
            min = Math.min(num,min);
            max = Math.max(num,max);
            set.add(num);
        }

        List<Integer> res = new ArrayList<>();
        for(int i=min+1;i<max;i++)
        {
            if(!set.contains(i))
            {
                res.add(i);
            }
        }
        return res;
    }
}