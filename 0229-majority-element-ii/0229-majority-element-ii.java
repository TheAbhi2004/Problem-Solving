class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        int f1=0,f2=0;
        int c1=0,c2=0;

        for(int num:nums)
        {
            if(f1==num)
            {
                c1++;
            }
            else if(f2==num)
            {
                c2++;
            }
            else if(c1==0)
            {
                f1=num;
                c1=1;
            }
            else if(c2==0)
            {
                f2=num;
                c2=1;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int num:nums)
        {
            if(num==f1)
            {
                c1++;
            }
            else if(num==f2)
            {
                c2++;
            }
        }

        List<Integer> res = new ArrayList<>();
        int n = nums.length;

        if(c1>n/3)
            res.add(f1);
        if(c2>n/3)
            res.add(f2);    

        return res;
    }
}
