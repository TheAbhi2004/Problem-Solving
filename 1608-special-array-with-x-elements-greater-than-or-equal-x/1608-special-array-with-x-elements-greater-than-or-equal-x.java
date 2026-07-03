class Solution 
{
    public int specialArray(int[] nums) 
    {
        Arrays.sort(nums);

        int n = nums.length;

        for (int x = 1; x <= n; x++) 
        {
            int left = 0;
            int right = n - 1;

            while (left <= right) 
            {
                int mid = left + (right - left) / 2;

                if (nums[mid] >= x)
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }

            if (n - left == x)
            {
                return x;
            }
        }

        return -1;
    }
}