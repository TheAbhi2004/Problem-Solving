class Solution 
{
    public int findNumberOfLIS(int[] nums) 
    {
        int n = nums.length;

        int[] len = new int[n];   // length of LIS ending at i
        int[] count = new int[n]; // number of LIS ending at i

        Arrays.fill(len, 1);
        Arrays.fill(count, 1);

        int maxLen = 1;

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                if (nums[j] < nums[i]) 
                {

                    // Found a longer subsequence
                    if (len[j] + 1 > len[i]) 
                    {
                        len[i] = len[j] + 1;
                        count[i] = count[j];
                    }
                    // Found another way to get same length
                    else if (len[j] + 1 == len[i]) 
                    {
                        count[i] += count[j];
                    }
                }
            }

            maxLen = Math.max(maxLen, len[i]);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) 
        {
            if (len[i] == maxLen) 
            {
                ans += count[i];
            }
        }

        return ans;
    }
}