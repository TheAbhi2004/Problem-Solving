class Solution 
{
    public int reverseDegree(String s) 
    {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            int rev='z'-ch+1;
            sum=sum+rev*(i+1);
        }
        return sum;
    }
}