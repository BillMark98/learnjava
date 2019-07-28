import java.util.Scanner;
public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner input = new Scanner("1-800-Flowers");
		Scanner input = new Scanner(System.in);
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
		// System.out.println("Enter a string: ");
		// String s = input.nextLine();
		// MyNumber.ConvertPhoneToNumber(s);

		// 6.26
		// int count = 0;
		// int number = 2;
		// boolean alreadyNewLine = false;
		// while(count <= 100)
		// {
		// 	if(MyNumber.isPrime(number) && isPalindrome(number))
		// 	{
		// 		System.out.print(" " + number);
		// 		count++;
		// 		alreadyNewLine = false;
		// 	}
		// 	number++;
		// 	// have to add a flag to test already printed a nwline
		// 	// for example 181 the count = 9 and will not be updated
		// 	// but in this case 182,183,184... all correspond to count = 9 and
		// 	// will print a newline
		// 	if(count % 10 == 9 && !alreadyNewLine)
		// 	{
		// 		System.out.println();
		// 		alreadyNewLine = true;
		// 	}
		// }
		// System.out.println();
		// String num = 123 + "";
		// System.out.println("The number is " + num);


		// 6.30
		// modelling the craps to calculate approximately the rate to lose
		// N = 1000000000  The approximate lose rate is 0.507067028
		// by calculating precisely, the rate is 251/495 ~ 0.507070707...
		int N = 1000;
		int Loses = 0;
		boolean winCraps = false;
		for(int count = 1; count <= N; count++)
		{	
			winCraps = Craps();
			if(winCraps == false)
			{
				Loses++;
			}
		}
		double loseRate = (double) Loses/N;
		// Craps();
		System.out.println("The approximate lose rate is " + loseRate );
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
	public static boolean Craps()
	{
		int num1 = MyNumber.rowDice();
		int num2 = MyNumber.rowDice();
		int sum = num1 + num2;
		// System.out.println("You rolled " + num1 + " + " + num2 + " = " + sum);
		boolean winCraps = false;
		switch(sum)
		{
			case 2:
			case 3:
			case 12:
				// System.out.println("You lose");
				break;
			case 7:
			case 11:
				// System.out.println("You win");
				winCraps = true;
				break;
			default:
				// row again
				num1 = MyNumber.rowDice();
				num2 = MyNumber.rowDice();
				int temp = num1 + num2;
				while(true)
				{
					// System.out.println("You rolled " + num1 + " + " + num2 + " = " + temp);
					if(temp == 7)
					{
						// System.out.println("You lose");
						break;
					}
					else if(temp == sum)
					{
						// System.out.println("You win");
						winCraps = true;
						break;
					}
					num1 = MyNumber.rowDice();
					num2 = MyNumber.rowDice();
					temp = num1 + num2;
				}
				break;
		}
		return winCraps;
	}
}
