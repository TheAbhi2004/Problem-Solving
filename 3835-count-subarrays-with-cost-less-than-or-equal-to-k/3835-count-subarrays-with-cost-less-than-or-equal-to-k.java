class Solution 
{
    public long countSubarrays(int[] nums, long k) 
    {
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();

        int left = 0;
        long ans = 0;

        for (int right = 0; right < nums.length; right++) 
        {

            while (!maxDeque.isEmpty() &&
                   nums[maxDeque.peekLast()] <= nums[right]) 
            {
                maxDeque.pollLast();
            }

            while (!minDeque.isEmpty() &&
                   nums[minDeque.peekLast()] >= nums[right]) 
            {
                minDeque.pollLast();
            }

            maxDeque.offerLast(right);
            minDeque.offerLast(right);

            while (left < right &&
                  (long)(nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()])
                  * (right - left + 1) > k) 
            {

                left++;

                if (maxDeque.peekFirst() < left)
                {
                    maxDeque.pollFirst();
                }

                if (minDeque.peekFirst() < left) 
                {
                    minDeque.pollFirst();
                }
            }

            ans += right - left + 1;
        }

        return ans;
    }
}