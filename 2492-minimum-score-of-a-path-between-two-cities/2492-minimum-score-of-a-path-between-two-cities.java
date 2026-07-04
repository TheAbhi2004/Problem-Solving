class Solution 
{
    public int minScore(int n, int[][] roads) 
    {
        List<int[]>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) 
        {
            graph[i] = new ArrayList<>();
        }

        for (int[] road : roads) 
        {
            int u = road[0], v = road[1], w = road[2];
            graph[u].add(new int[]{v, w});
            graph[v].add(new int[]{u, w});
        }

        boolean[] visited = new boolean[n + 1];
        return dfs(1, graph, visited);
    }

    private int dfs(int node, List<int[]>[] graph, boolean[] visited) 
    {
        visited[node] = true;
        int min = Integer.MAX_VALUE;

        for (int[] edge : graph[node]) 
        {
            int next = edge[0];
            int weight = edge[1];

            min = Math.min(min, weight);

            if (!visited[next]) 
            {
                min = Math.min(min, dfs(next, graph, visited));
            }
        }

        return min;
    }
}