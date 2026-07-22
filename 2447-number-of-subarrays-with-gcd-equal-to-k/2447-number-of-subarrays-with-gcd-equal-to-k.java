class Solution 
{
    private int gcd(int a, int b) 
    {
        while (b != 0) 
        {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    public int subarrayGCD(int[] nums, int k) 
    {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) 
        {
            int g = 0;

            for (int j = i; j < n; j++) 
            {
                g = gcd(g, nums[j]);

                if (g == k) 
                {
                    count++;
                } 
                else if (g < k) 
                {
                    break;
                }
            }
        }

        return count;
    }
}