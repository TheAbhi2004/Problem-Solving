class Solution 
{
    public boolean isPalindrome(String s) 
    {
        // Convert to lowercase
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) 
        {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) 
            {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) 
            {
                right--;
            }
            
            // Compare characters
            if (s.charAt(left) != s.charAt(right)) 
            {
                return false;
            }
            
            left++;
            right--;
        }
        return true;
    }
}
