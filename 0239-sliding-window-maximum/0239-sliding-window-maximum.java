class Solution 
{
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();
        int idx = 0;

        for (int i = 0; i < n; i++) 
        {
            // Remove indices outside the window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) 
            {
                deque.pollFirst();
            }

            // Maintain decreasing order
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) 
            {
                deque.pollLast();
            }

            deque.offerLast(i);

            // Record maximum when window is complete
            if (i >= k - 1) 
            {
                result[idx++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}