class Solution 
{
    public int[] replaceElements(int[] arr) 
    {
        int max=-1;
        int i;
        int n=arr.length;
        for(i=n-1;i>=0;i--)
        {
            int c=arr[i];
            arr[i]=max;
            if(c>max)
            {
                max=c;
            }
        }
        return arr;
    }
}