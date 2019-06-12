import java.util.Scanner;
public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner("1-800-Flowers");
		// System.out.print("Enter an integer for palindrome: ");
		// int val = input.nextInt();
		// System.out.println("The integer " + val + " is palin? " + isPalindrome(val));

		// 6.6
		// System.out.print("Enter a n: \n");
		// int n = input.nextInt();
		// displayPattern(n);

		// 6.13
		// System.out.print("Enter a n: \n");
		// int n = input.nextInt();
		// mNseries(n);

		// 6.21
		String s = input.nextLine();
		MyNumber.ConvertPhoneToNumber(s);
	}
	public static boolean isPalindrome(int val)
	{
		int rev = MyInt.reverse(val);
		return rev == val;
	}
	public static void displayPattern(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = n - 1; j >= i; j--)
			{
				System.out.print("    ");
			}
			for(int j = i; j >= 1; j--)
			{
				System.out.printf("%4d",j);
			}
			System.out.print('\n');
		}	
	
	}
	public static void mNseries(int n)
	{
		// calculate m(i) = 1/2 + 2/3 ... + i/(i+1) for i from 1 to n
		System.out.printf("%10s %10s\n","i","m(i)");
		System.out.println("---------------------------");
		double sum = 0.0;
		for(int i = 1; i <= n; i++)
		{
			sum += i/(i+1.0);
			System.out.printf("%10d %10.4f\n",i,sum);
		}
	}
}
