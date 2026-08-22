class Solution 
{
    public boolean checkDivisibility(int n) 
    {
        int sum=0;
        int p=1;
        int temp=n;

        while(temp>0)
        {
            int r=temp%10;
            sum=sum+r;
            p=p*r;
            temp=temp/10;
        }

        if(n%(sum+p)==0)
        return true;
        else
        return false;
    }
}