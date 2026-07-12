class Solution 
{
    public int[] arrayRankTransform(int[] arr) 
    {
        int n = arr.length;
        int[] s = new int[n];

        for (int i = 0; i < n; i++) 
        {
            s[i] = arr[i];
        }

        Arrays.sort(s);

        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 1;

        for (int num : s) 
        {
            if (!map.containsKey(num)) 
            {
                map.put(num, c++);
            }
        }

        for (int i = 0; i < n; i++) 
        {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}