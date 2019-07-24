public class MyString
{
    public static boolean isPalindrome(String teststring)
    {
        int low = 0;
        int high = teststring.length();
        while(low < high)
        {
            if(teststring.charAt(low) != teststring.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}