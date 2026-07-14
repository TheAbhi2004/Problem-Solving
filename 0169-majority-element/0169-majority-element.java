//Boyer-Moore Voting Algorithm 
class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int freq = 0, f = 0;
        
        for (int num : nums)
        {
            if (freq == 0) 
            {
                f = num;
            }
            if(num==f)
            {
                freq++;
            }
            else
            {
                freq--;
            }
        }
        
        return f;
    }
}
