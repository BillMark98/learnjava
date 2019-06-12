
public class MyInt {

	public static int reverse(int a)
	{
		int value = 0;
		while(a != 0)
		{
			value = value * 10 + a % 10;
			a /= 10; 
		}
		return value;
	}
}
