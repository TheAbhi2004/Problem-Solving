class Solution 
{
    public int lengthOfLIS(int[] nums) 
    {
        int[] arr = new int[nums.length];
        int size = 0;
        for (int num : nums) 
        {
            int left = 0;
            int right = size;

            while (left < right) 
            {
                int mid = left + (right - left) / 2;

                if (arr[mid] < num) 
                {
                    left = mid + 1;
                } 
                else 
                {
                    right = mid;
                }
            }

            arr[left] = num;

            if (left == size) 
            {
                size++;
            }
        }

        return size;
    }
}