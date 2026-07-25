class Solution 
{
    public int maxProduct(int n) 
    {
        int largest = 0;
        int secondLargest = 0;
        int r;
        while (n > 0) 
        {
            r = n % 10;

            if (r > largest) 
            {
                secondLargest = largest;
                largest = r;
            } 
            else if (r > secondLargest) 
            {
                secondLargest = r;
            }

            n /= 10;
        }

        return largest * secondLargest;
    }
}