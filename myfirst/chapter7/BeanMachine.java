import java.util.Scanner;
public class BeanMachine
{
    public static void startGame()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int balls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int slots = input.nextInt();
        int[] ballsPos = new int[slots];
        int pos;
        for(int term = 1; term <= balls; term++)
        {
            pos = dropBall(slots);
            ballsPos[pos]++;
        }
        // print the result
        System.out.println();
        printSlots(ballsPos);
    }
    // return the slots in which the ball is in
    public static int dropBall(int slots)
    {
        int rightCount = 0;
        for(int round = 0; round < slots - 1; round++)
        {
            int direc = (int) (Math.random() * 2);
            if(direc == 0)
            {
                // goes left
                System.out.print("L");
            }
            else
            {
                System.out.print("R");
                rightCount++;
            }
        }
        System.out.println();
        return rightCount;
    }
    public static void printSlots(int[] arr)
    {
        // find the maximum
        int max = 0;
        for(int index = 0; index < arr.length; index++)
        {
            if(arr[index] > max)
            {
                max = arr[index];
            }
        }
        for(int stocks = max; stocks > 0; stocks--)
        {
            for(int index = 0; index < arr.length; index++)
            {
                if(arr[index] >= stocks)
                {
                    System.out.print("|O");
                }
                else
                {
                    System.out.print("| ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }
}