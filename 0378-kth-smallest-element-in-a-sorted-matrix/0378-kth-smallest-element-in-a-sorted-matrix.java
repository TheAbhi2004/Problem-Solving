class Solution 
{
    public int kthSmallest(int[][] matrix, int k) 
    {
        int n = matrix.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>
        (
            (a, b) -> Integer.compare(a[0], b[0])
        );
        for (int i = 0; i < n; i++) 
        {
            pq.offer(new int[]{matrix[i][0], i, 0});
        }

        for (int count = 1; count < k; count++) 
        {
            int[] curr = pq.poll();

            int row = curr[1];
            int col = curr[2];

            if (col + 1 < n) 
            {
                pq.offer(new int[]{
                    matrix[row][col + 1],
                    row,
                    col + 1
                });
            }
        }

        return pq.poll()[0];
    }
}