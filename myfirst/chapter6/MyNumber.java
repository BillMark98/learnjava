// import java.util.Scanner;
public class MyNumber
{
    public static int getNumber(char upperCase)
    {
        if(upperCase <= 'C')
        {
            return 2;
        }
        else if(upperCase <= 'F')
        {
            return 3;
        }
        else if(upperCase <= 'I')
        {
            return 4;
        }
        else if(upperCase <= 'L')
        {
            return 5;
        }
        else if(upperCase <= 'O')
        {
            return 6;
        }
        else if(upperCase <= 'S')
        {
            return 7;
        }
        else if(upperCase <= 'V')
        {
            return 8;
        }
        else
        {
            return 9;
        }
    }
    public static void ConvertPhoneToNumber(String s)
    {
        int len = s.length();
        char ch;
        for(int i = 0; i < len; i++)
        {
            ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                System.out.print(getNumber(Character.toUpperCase(ch)));
            }
            else
            {
                System.out.print(ch);
            }
        }
        System.out.print('\n');
    }
    public static boolean isPrime(int number)
    {
        for(int divisor = 2; divisor <= number/2; divisor++)
        {
            if(number % divisor == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static int rowDice()
    {
        // if (int)Math.random() * 6 + 1;
        // will always generate 1
        int num = (int)(Math.random() * 6) + 1;
        return num;
    }
}