class Solution 
{
    public int candy(int[] ratings) 
    {
        int n=ratings.length;
        int[] cds=new int[n];
        Arrays.fill(cds,1);
        int i;
        for(i=1;i<n;i++)
        {
            if(ratings[i-1]<ratings[i])
            {
                cds[i]=cds[i-1]+1;
            }
        }
        for(i=n-2;i>=0;i--)
        {
            if(ratings[i+1]<ratings[i])
            {
                cds[i]=Math.max(cds[i],cds[i+1]+1);
            }
        }
        int s=0;
        for(int c:cds)
        {
            s=s+c;
        }
        return s;
    }
}